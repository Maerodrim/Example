package ru.ssau.tk.sergunin.practoop.Person;

import org.testng.annotations.Test;
import ru.ssau.tk.sergunin.practoop.Person.Gender.Gender;

import static org.testng.Assert.*;

public class PersonTest {
    @Test(groups = {"unit1"})
    public void testFirstName() {
        Person firstHuman = new Person();
        Person secondHuman = new Person();
        Person thirdHuman = new Person();

        assertEquals(firstHuman.getFirstName(), null);

        firstHuman.setFirstName("Gans");
        secondHuman.setFirstName("Katerin");
        thirdHuman.setFirstName("Piligrim");

        assertEquals(firstHuman.getFirstName(), "Gans");
        assertEquals(secondHuman.getFirstName(), "Katerin");
        assertEquals(thirdHuman.getFirstName(), "Piligrim");


    }

    @Test(groups = {"unit1"})
    public void testLastName() {
        Person firstHuman = new Person();
        Person secondHuman = new Person();
        Person thirdHuman = new Person();

        assertEquals(firstHuman.getLastName(), null);

        firstHuman.setLastName("Chylc");
        secondHuman.setLastName("Malkin");
        thirdHuman.setLastName("Scott");

        assertEquals(firstHuman.getLastName(), "Chylc");
        assertEquals(secondHuman.getLastName(), "Malkin");
        assertEquals(thirdHuman.getLastName(), "Scott");
    }

    @Test(groups = {"unit1"})
    public void testPassportId() {
        Person firstHuman = new Person();
        Person secondHuman = new Person();
        Person thirdHuman = new Person();

        assertEquals(firstHuman.getPassportId(), 0);

        firstHuman.setPassportId(236235444);
        secondHuman.setPassportId(833534346);
        thirdHuman.setPassportId(913463494);

        assertEquals(firstHuman.getPassportId(), 236235444);
        assertEquals(secondHuman.getPassportId(), 833534346);
        assertEquals(thirdHuman.getPassportId(), 913463494);
    }

    @Test(groups = {"unit1"})
    public void testConstrakt() {
        Person firstHuman = new Person(236235444);
        Person secondHuman = new Person("Chylc", "Gans");
        Person thirdHuman = new Person("Chylc", "Gans", 236235444);

        assertEquals(firstHuman.getPassportId(), 236235444);
        assertEquals(secondHuman.getFirstName(), "Chylc");
        assertEquals(secondHuman.getLastName(), "Gans");
        assertEquals(thirdHuman.getPassportId(), 236235444);
        assertEquals(thirdHuman.getFirstName(), "Chylc");
        assertEquals(thirdHuman.getLastName(), "Gans");
    }

    @Test(groups = {"unit1"})
    public void testGender() {
        Person firstHuman = new Person("Chylc", "Gans", 236235444);
        Person secondHuman = new Person("Chylc", "Gans");
        Person thirdHuman = new Person("Chylc", "Gans", 236235444,Gender.MALE);

        firstHuman.setgender(Gender.MALE);
        secondHuman.setgender(Gender.FEMALE);
        thirdHuman.setgender(Gender.AGENDER);

        assertEquals(firstHuman.getgender(), Gender.MALE);
        assertEquals(secondHuman.getgender(), Gender.FEMALE);
        assertEquals(thirdHuman.getgender(), Gender.AGENDER);

    }
}
