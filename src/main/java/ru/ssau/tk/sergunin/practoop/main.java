package ru.ssau.tk.sergunin.practoop;

import ru.ssau.tk.sergunin.practoop.Operation.IdenticalOperation;
import ru.ssau.tk.sergunin.practoop.Person.Person;

public class main {

    public static void main(String[] args) {
        IdenticalOperation firstOperation = new IdenticalOperation();
        Person person = new Person();
        person.setFirstName("Arkadiy");
        checkAnotherPerson(person);
        System.out.println(person.getFirstName());
        System.out.println(firstOperation.apply(5));
    }

    private static void checkAnotherPerson(Person person) {
        person = new Person();
        person.setFirstName("Ignat");
        System.out.println(person.getFirstName());
    }
}
