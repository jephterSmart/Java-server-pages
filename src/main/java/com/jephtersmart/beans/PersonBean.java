package com.jephtersmart.beans;

public class PersonBean {
    private String firstName;
    private String lastName;

    public PersonBean() {
        firstName = "Jephter";
        lastName = "Smart";
    }

    public String getName() {
        return firstName + ",  " + lastName;
    }

    public void setName(String name) {
        String[] names = name.split(" ");
        if (names.length > 1) {
            firstName = names[0];
            lastName = names[1];
        }

    }

}
