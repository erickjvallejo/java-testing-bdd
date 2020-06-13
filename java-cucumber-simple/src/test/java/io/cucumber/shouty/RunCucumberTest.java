package io.cucumber.shouty;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"} ,
        features = "src/test/resources",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RunCucumberTest {
}
