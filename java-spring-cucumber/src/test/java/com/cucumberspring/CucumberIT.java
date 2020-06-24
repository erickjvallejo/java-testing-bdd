package com.cucumberspring;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary", "html:target/cucumber.html", "json:target/cucumber.json"},
        features = {"classpath:features/controller/post.feature" , "classpath:features/controller/version.feature"})
public class CucumberIT {

}