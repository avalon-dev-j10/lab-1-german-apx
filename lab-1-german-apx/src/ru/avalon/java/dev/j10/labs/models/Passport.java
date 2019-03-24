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

    // имя+фамилия+паспорт конструктор
    public Passport(String firstName,
                    String lastName,
                    int passSerial,
                    int passNumber,
                    Date birthday,
                    Date dateOfIssue,
                    String department) {

        this.firstName   = firstName  ;
        this.lastName    = lastName   ;
        this.passSerial  = passSerial ;
        this.passNumber  = passNumber ;
        this.birthday    = birthday   ;
        this.dateOfIssue = dateOfIssue;
        this.department  = department ;
    }            

    // метод, который возвращает паспортные данные за вычетом имени/фамилии и адреса
    public String getPassportInfo() {
        return  "Серия и номер паспорта: " + passSerial + " " + passNumber + "\n" +
                "Кем выдан: " + department + "\n" +
                "Дата выдачи: " + dateOfIssue + "\n" +
                "День рождения: " + birthday;
    }

    //getters + setters
    public int getPassSerial()      { return passSerial;}
    public int getPassNumber()      { return passNumber;}
    public String getFirstName()    { return firstName;}
    public String getLastName()     { return lastName;}
    public String getPatronymic()   { return patronymic;}
    public String getMiddleName()   { return middleNam;}
    public String getDepartment()   { return department;}
    public Date getDateOfIssue()    { return dateOfIssue;}
    public Date getBirthday()       { return birthday;}

    public void setPassSerial(int assSerial)            { this.passSerial = passSerial; }
    public void setPassNumber(int passNumber)           { this.passNumber = passNumber; }
    public void setFirstName(String firstName)          { this.firstName = firstName; }
    public void setLastName(String lastName)            { this.lastName = lastName; }
    public void setPatronymic(String patronymic)        { this.patronymic = patronymic; }
    public void setMiddleName(String middleName)        { this.middleName = middleName; }
    public void setDepartment(String departmen)         { this.department = department; }
    public void setDateOfIssue(Date dateOfIssue)        { this.dateOfIssue = dateOfIssue; }
    public void setBirthday(Date birthday)              { this.birthday = birthday; }

    //метод, который возвращает имя человека
    public String getFullName() {
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
