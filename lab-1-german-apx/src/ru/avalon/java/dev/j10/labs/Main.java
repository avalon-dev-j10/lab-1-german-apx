package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.*;
import ru.avalon.java.dev.j10.labs.commons.*;

public class Main {

    public static void main(Strings[] args) {

        Passport passIvanov = new Passport("Иван", "Иванов");
        passIvanov.setPatronymic("Иванович");
        Passport passSmith = new Passport("John", "Smith");
        passIvanov.setMiddleName("Edvard");

        Address addressIvanov = new Address("Россия","Московская","Москва","Ленина",5,60);
        Address addressSmith = new Address("UK","-","London","Baker",221,);

        Person ivanov = new Person(passIvanov,addressIvanov);
        Person smith = new Person(passSmith,addressSmith);

        String fullNameIvanov = ivanov.getFullName();
        String fullNameSmith = smith.getFullName();

        String addressIvanov = ivanov.getFullAddress();
        String addressSmith = smith.getFullAddress();

        System.out.println(fullNameIvanov);
        System.out.println(addressIvanov);
        System.out.println(fullNameSmith);
        System.out.println(addressSmith);

    }
}
