package ru.ssau.tk.sergunin.practoop.Person;

import ru.ssau.tk.sergunin.practoop.Person.Gender.Gender;

public class Person {
    private int passportId;
    private String firstName;
    private String lastName;
    private Gender gender;

    int getPassportId() {
        return passportId;
    }

    ;

    public String getFirstName() {
        return firstName;
    }

    ;

    public String getLastName() {
        return lastName;
    }

    ;

    public void setgender(Gender gender) {
        this.gender = gender;
    }

    ;

    public Gender getgender() {
        return gender;
    }

    ;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    ;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    ;

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    ;

    public Person(int passportId) {
        this.passportId = passportId;
    }

    ;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName, int passportId, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.gender = gender;
    }
}
