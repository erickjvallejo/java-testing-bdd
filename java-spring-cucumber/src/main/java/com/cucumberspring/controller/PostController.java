package com.cucumberspring.controller;

import com.cucumberspring.domain.Post;
import com.cucumberspring.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class    PostController {

    private final Logger log = LoggerFactory.getLogger(PostController.class);
    private PostRepository postRepository;


    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping(value = {"", "/"})
    public List<Post> getAll() {
        log.debug("REST request to getAll Post");
        return postRepository.findAll();
    }

    @GetMapping("/posts/{id}")
    public Optional<Post> getById(@PathVariable Long id) {
        log.debug("REST request to get by Id {} ", id);
        return postRepository.findById(id);
    }

    @PostMapping("/posts")
    public Post save(@RequestBody Post post) {
        log.debug("REST request to save {} ", post);
        return postRepository.save(post);
    }


}
