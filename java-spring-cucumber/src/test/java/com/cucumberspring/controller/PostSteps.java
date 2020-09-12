package com.cucumberspring.controller;

import com.cucumberspring.AbstractSteps;
import com.cucumberspring.domain.Post;
import com.cucumberspring.repository.PostRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class PostSteps extends AbstractSteps {

    private static final Logger LOG = LoggerFactory.getLogger(PostSteps.class);
    @Autowired
    private PostController postController;
    @Autowired
    private PostRepository postRepository;
    private MockMvc restVersionMockMvc;
    private ObjectMapper objectMapper = new ObjectMapper();

    public PostSteps() {
    }

    @Given("as user can create a new post")
    public void as_user_can_create_a_new_post() {
        this.restVersionMockMvc = MockMvcBuilders.standaloneSetup(postController).build();
    }

    @Given("i sending post to be created with post id {long}, title {string} and content {string}")
    public void i_sending_post_to_be_created_with_post_id_title_New_post_Title_and_content_content(Long id, String title, String content) throws Exception {
        Post post = new Post(id, title, content);

        LOG.info("I am sending a post {}", post);
        // Create Post
        actions = this.restVersionMockMvc.perform(post("/api/posts")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(post)));
    }

    @Then("i should be able to see my newly created post {long}, title {string} and content {string}")
    public void i_should_be_able_to_see_my_newly_created_post_title_and_content(Long id, String title, String content) throws Exception {

        LOG.info("Post is ok");
        actions.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.id").value(id))
                .andExpect(jsonPath("$.title").value(title))
                .andExpect(jsonPath("$.content").value(content));
    }

    /* Update Post */

    @When("i have sent to post to be created with post id {long}, title {string} and content {string}")
    public void i_have_sent_to_post_to_be_created_with_post_id_title_and_content(Long id, String title, String content) throws Exception {
        // Create Post

        Post post = new Post(id, title, content);
        LOG.info("I am creating a post {}", post);

        actions = this.restVersionMockMvc.perform(post("/api/posts")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(objectMapper.writeValueAsString(post)));

    }

    @Then("i want to find by id {long}")
    public void i_want_to_find_by_id(Long id) throws Exception {

        // Search by id
        actions = this.restVersionMockMvc.perform(get("/api/posts/{id}", id))

                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.id").value(id));
    }

    @And("i should be able to see the title {string}")
    public void i_should_be_able_to_see_the_title(String title) throws Exception {

        actions.andExpect(jsonPath("$.title", Matchers.is(title)));
    }

    @And("i see too the content {string}")
    public void i_see_too_the_content(String content) throws Exception {

        actions.andExpect(jsonPath("$.content", Matchers.is(content)));
    }


}
