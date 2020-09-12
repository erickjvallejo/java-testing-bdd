package simpletest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/simpletest.feature",
        plugin = {"summary", "pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class SimpleTestRunner {
}
