package io.cucumber.shouty;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int distance = 0;
    private List<String> messagesHeard = new ArrayList<String>();


    private List<String> messagesSaid = new ArrayList<String>();

    public Person(String name) {
        this.name = name;
    }

    public void moveTo(int distance) {
        this.distance += distance;
        System.out.println(this.name + ": distance so far is: " + this.distance);
    }

    public void shout(String message) {
        messagesSaid.add(message);
        System.out.println(this.name + " says:" + message);

    }

    public void hear(String message) {
        messagesHeard.add(message);
        System.out.println(this.name + " heard:" + message);
    }

    private List<String> getMessageHeard() {
        return messagesHeard;
    }

    private List<String> getMessagesSaid() {
        return messagesSaid;
    }

    public boolean iHeardEverythingItSaid(){
        return getMessageHeard().containsAll(getMessagesSaid());
    }
}
