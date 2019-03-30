package ru.avalon.java.dev.j10.labs.commons;

public class Address {

    // атрибуты класса
    private String country;
    private String district;
    private String city;
    private String street;
    private int numHome;
    private int flat;

    // конструктор класса
    public Address (String country,
            String district,
            String city,
            String street,
            int numHome,
            int flat) {

                this.country = country;
                this.district = district;
                this.city = city;
                this.street = street;
                this.numHome = numHome;
                this.flat = flat;

    }

    // getters + setters

//    public String getCountry()  { return country; }
//    public String getDistrict() { return district; }
//    public String getCity()     { return city; }
//    public String getStreet()   { return street; }
//    public int getNumHome()     { return numHome; }
//    public int getFlat()        { return flat; }
//
//    public void setCountry(String country)     { this.country = country; }
//    public void setDistrict(String district)   { this.district = district; }
//    public void setCity(String city)           { this.city = city; }
//    public void setStreet(String street)       { this.street = street; }
//    public void setNumHome(int numHome)        { this.numHome = numHome; }
//    public void setFlat(int flat)              { this.flat = flat; }

    public String getFullAddress() {

        return country + ", "
                + district + "обл., г."
                + city + ", ул."
                + street + ", д."
                + numHome + ", кв."
                + flat;
    }
}