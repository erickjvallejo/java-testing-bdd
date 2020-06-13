package com.cucumberspring.cucumber;

import com.cucumberspring.SpringApp;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;


@WebAppConfiguration
@io.cucumber.spring.CucumberContextConfiguration
@SpringBootTest(classes = SpringApp.class)
public class CucumberContextConfiguration {

    private static final Logger LOG = LoggerFactory.getLogger(CucumberContextConfiguration.class);

    @Before
    public void setup_cucumber_spring_context() {
        // Dummy method so cucumber will recognize this class as glue
        // and use its context configuration.
        LOG.info("------------- TEST CONTEXT SETUP -------------");
    }

    @After
    public void tearDown() {
        LOG.info("------------- TEST CONTEXT TEAR DOWN -------------");

    }


}