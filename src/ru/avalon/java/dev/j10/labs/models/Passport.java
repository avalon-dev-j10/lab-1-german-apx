package ru.avalon.java.dev.j10.labs.models;

import java.util.Date;

public class Passport {

    // атрибуты класса
    private int passSerial;
    private int passNumber;
    private String firstName; // имя
    private String lastName; // фамилия
    private String patronymic; // отчество
    private String middleName; // второе имя
    private Date dateOfIssue = new Date();
    private String department;
    private Date birthday = new Date();



    // имя+фамилия конструктор
    public Passport(String firstName,
                    String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

        }


    // метод, который возвращает паспортные данные за вычетом имени/фамилии и адреса

    public String getPassportInfo() {
        return  "Серия и номер паспорта: " + passSerial + " " + passNumber + "\n" +
                "Кем выдан: " + department + "\n" +
                "Дата выдачи: " + dateOfIssue + "\n" +
                "День рождения: " + birthday;
    }

    //getters + setters

    public void setPatronymic(String patronymic)        { this.patronymic = patronymic; }
    public void setMiddleName(String middleName)        { this.middleName = middleName; }

    //метод, который возвращает имя человека
    String getFullName() {
        if (middleName != null) {
            // есть второе имя
            return firstName + " " + middleName.charAt(0) + ". " + lastName;
        } else if (patronymic != null){
            // есть отчество
            return lastName + " " + firstName + " " + patronymic;
        } else if (middleName == null && patronymic == null) {
            // нет второго имени и отчества
            return lastName + " " + firstName;
        } else {
            return lastName + " " + firstName;
        }
    }
}
