package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.*;
import ru.avalon.java.dev.j10.labs.commons.*;

public class Main {

    public static void main(String[] args) {


        Passport passIvanov = new Passport("Иван", "Иванов");
        passIvanov.setPatronymic("Иванович");
        Passport passSmith = new Passport("John", "Smith");
        passSmith.setMiddleName("Edvard");

        Address addressIvanov = new Address("Россия","Московская","Москва","Ленина",5,60);
        Address addressSmith = new Address("UK","-","London","Baker",221, 0);

        Person ivanov = new Person(passIvanov,addressIvanov);
        Person smith = new Person(passSmith,addressSmith);

        String fullNameIvanov = ivanov.getFullName();
        String fullNameSmith = smith.getFullName();

        String addressIvanFull = ivanov.getAddress();
        String addressSmithF = smith.getAddress();

        System.out.println(fullNameIvanov);
        System.out.println(addressIvanFull);
        System.out.println(fullNameSmith);
        System.out.println(addressSmithF);

        System.out.println();

    }

}
