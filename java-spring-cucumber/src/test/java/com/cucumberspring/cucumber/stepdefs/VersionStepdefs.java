package com.cucumberspring.cucumber.stepdefs;

import com.cucumberspring.controller.VersionController;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class VersionStepdefs extends StepDefs {
    @Autowired
    private VersionController versionController;
    private MockMvc restVersionMockMvc;


    @Given("we have a restful service")
    public void we_have_a_restful_service() {
        this.restVersionMockMvc = MockMvcBuilders.standaloneSetup(versionController).build();

    }

    @When("the client calls {string}")
    public void theClientCalls(String page) throws Exception {
        actions = restVersionMockMvc.perform(get(page)
                .accept(MediaType.APPLICATION_JSON));
    }


    @Then("the client receives status code of {int}")
    public void theClientReceivesStatusCodeOf(int statusCode) throws Exception {
        actions
                .andExpect(status().is(statusCode))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE));
    }

    @And("the client receives server version {string}")
    public void theClientReceivesServerVersion(String response) throws Exception {
        actions.andExpect(content().string("1.0"));
    }


}
