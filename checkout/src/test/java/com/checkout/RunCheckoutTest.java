package com.checkout;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "summary"},
        snippets = CAMELCASE,
        features = "classpath:features/checkout/checkout.feature")
public class RunCheckoutTest {

}
