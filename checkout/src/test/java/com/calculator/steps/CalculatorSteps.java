package com.calculator.steps;

import com.calculator.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculatorSteps {

    private Calculator calculator;
    private int operationResult;

    @Given("I have a calculator")
    public void iHaveACalculator() {
        calculator = new Calculator();
    }

    @When("I add {int} plus {int}")
    public void iAddPlus(int number1, int number2) {
        operationResult = calculator.add(number1 , number2);
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int result) {
        assertEquals( result , this.operationResult);

    }

    @When("I subtract {int} and  {int}")
    public void iSubtractAnd(int number1, int number2) {
        this.operationResult = calculator.subtract(number1, number2);
    }

    @When("I multiply {int} and {int}")
    public void iMultiplyAnd(int number1, int number2) {
        this.operationResult = calculator.multiply(number1, number2);
    }
}
