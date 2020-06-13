package io.cucumber.shouty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class PersonaStepDefs {

    private Person lucy;
    private Person sean;

    @Given("Lucy is located \\{int} metres from Sean")
    public void lucy_is_located_metres_from_Sean(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        lucy = new Person("Lucy");
        sean = new Person("Sean");

        List<Integer> rows = dataTable.asList(Integer.class);

        for (Integer column : rows) {
            lucy.moveTo(column);
        }
    }

    @Given("Lucy is located {int} metres from Sean")
    public void lucy_is_located_metres_from_Sean(int distance) {

        lucy = new Person("Lucy");
        sean = new Person("Sean");

        lucy.moveTo(distance);

    }

    @When("Sean shouts message below")
    public void sean_shouts_message_below(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        List<String> rows = dataTable.asList(String.class);

        for (String message : rows) {
            this.sean.shout(message);
            this.lucy.hear(message);
        }


    }

    @When("Sean shouts {string}")
    public void sean_shouts(String message) {

        this.sean.shout(message);
        this.lucy.hear(message);
    }

    @Then("Lucy hears Sean's message")
    public void lucy_hears_Sean_s_message() {

        assertTrue("Everything it said I heard" , lucy.iHeardEverythingItSaid() );
    }


}
