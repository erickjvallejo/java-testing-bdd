package com.calculator;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary", "html:target/report.html", "json:target/report.json"},
        snippets = CAMELCASE,
        features = {"classpath:features/calculator/calculator.feature"},
        //glue = "com.calculator.steps", //Optional
        tags = "@sum or @subtract or @multiplication or @division"

)
public class RunCalculatorSteps {
}
