package io.zipcoder.interfaces;

public class TestPerson {
    Person firstPerson; //has access
    public void testConstructor (){

        firstPerson = new Person(1234,"amine"); // Create a testConstructor method which ensures that a Person object's id and name field are being set upon construction.

    }
    public void testSetName (){

        firstPerson.setName("Mohammed");  // stname         //Create a testSetName method which ensures that a Person object's name variable is being set by invoking the .setName method.

    }

}
