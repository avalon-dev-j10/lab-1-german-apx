package ru.avalon.java.dev.j10.labs.commons;

public class Address {

    // атрибуты класса
    private String country;
    private String district;
    private String city;
    private String street;
    private String numHome;
    private String flat;

    // конструктор класса
    public Address (String country,
            String district,
            String city,
            String street,
            String numHome,
            String flat) {

                this.country = country;
                this.district = district;
                this.city = city;
                this.street = street;
                this.numHome = numHome;
                this.flat = flat;

    }

    public String getFullAddress() {

        return country + ", "
                + district + "обл., г."
                + city + ", ул."
                + street + ", д."
                + numHome + ", кв."
                + flat;
    }
}