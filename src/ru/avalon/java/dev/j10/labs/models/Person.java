package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

public class Person {

    private Passport passport;
    private Address address;

    public Person(Passport passport, Address address) {
        this.passport = passport;
        this.address = address;
    }

    public String getFullName() {
        return passport.getFullName();
    }

    public String getAddress() {
        return address.getFullAddress();
    }
}