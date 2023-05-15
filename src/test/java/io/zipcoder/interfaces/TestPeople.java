package io.zipcoder.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestPeople {

    @Test
    public void testAdd() {
        People people = new People();


        Person person1 = new Person(1, "John");
        Person person2 = new Person(2, "Jane");

        people.add(person1);
        people.add(person2);

        assertEquals(2, people.count());
        assertTrue(people.contains(person1));
        assertTrue(people.contains(person2));
    }

    @Test
    public void testRemove() {

        People people = new People();

        Person person1 = new Person(1, "mikaila");

        Person person2 = new Person(2, "Jane");
        people.add(person1);

        people.add(person2);
        assertEquals(2, people.count());


        people.remove(person1);
        assertEquals(1, people.count());

        assertFalse(people.contains(person1));
        assertTrue(people.contains(person2));
    }

    @Test
    public void testFindById() {

        People people = new People();

        Person person1 = new Person(1, "mkaila");


        Person person2 = new Person(2, "Jane");

        people.add(person1);


        people.add(person2);


        Person foundPerson = people.findById(1);
        assertEquals(person1, foundPerson);                        //assert= checking

    }
}
