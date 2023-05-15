package io.zipcoder.interfaces;

public class TestStudent {

    public void tesImplementation(){
        Student student = new Student(1999,"Manny");


  assert(student instanceof Learner);


    }
public  void testInheritance (){

    Student student = new Student(1999,"Manny");


        assert(student instanceof Person);
}
 public void testLearn (){


        Student student2 = new Student(11111,"Mohammedddd");
        student2.learn(10);
 }
}
