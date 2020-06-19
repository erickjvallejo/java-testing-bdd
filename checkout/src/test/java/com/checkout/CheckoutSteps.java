package com.checkout;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
import static org.junit.Assert.assertEquals;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "summary"},
        snippets = CAMELCASE,
        features = "src/test/resources/checkout.feature")
public class CheckoutSteps {

    private Checkout checkout;

    @Before
    public void setUp() throws Exception {
        checkout = new Checkout();
    }

    @Given("the price of a {string} is {int}")
    public void thePriceOfAIs(String name, int price) {
        checkout.definePriceProduct(name, price);
    }

    @When("I checkout {int} {string}")
    public void iCheckout(int itemCount, String itemName) {
        checkout.addProductToShoppingCar(itemCount, itemName);

    }

    @Then("the total price should be {int}")
    public void theTotalPriceShouldBe(int total) {
        assertEquals(total, checkout.getTotal());
    }


}