package com.cucumberspring.cucumber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-html-reports", "json:target/cucumber-html-reports/cucumber.json"},
        features = "src/test/features")
public class CucumberIT {

}