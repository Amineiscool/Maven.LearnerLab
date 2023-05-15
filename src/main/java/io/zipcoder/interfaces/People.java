package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People {

    private List<Person> personList = new ArrayList<Person>();

    public void add(Person person) {

        personList.add(person);


    }

    public Person findById(long id) {

        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);

            if (person.getId() == id) {

                return person;
            }

        }
        return null;

    }

    public boolean contains(Person person) {

        if (personList.contains(person)) {

            return true;

        }

        return false;


    }

    public void remove(Person person) {

        personList.remove(person);


    }

    public void remove(long id) {
        Person personToRemove = null;      // Initialize a variable to hold the Person object to remove

        for (Person person : personList) { // Loop through the personList to find the Person object with the matching id
            if (person.getId() == id) {
                personToRemove = person; // Set personToRemove to the Person object with the matching id and exit the loop
                break;
            }
        }
        if (personToRemove != null) {   // If a Person object was found with the matching id, remove it from the personList   != not equal

            remove(personToRemove); // Call the other remove method that takes a Person parameter to remove the Person object
        }
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();


    }

    public Person[] toArray() {
        // Convert the personList to an array of Person objects and return it
        return personList.toArray(new Person[0]);
    }

    public Iterator<Person> iterator() {
        // Return an iterator over the Person objects in the personList
        return personList.iterator();
    }

}