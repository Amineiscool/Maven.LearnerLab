package io.zipcoder.interfaces;

public class TestInstructor {

    public void testImplementation(){

        Instructor instructor = new Instructor(111,"paquio");

        assert(instructor instanceof Teacher);

    }

    public void testInheritance (){

        Instructor instructor = new Instructor(1222,"amino");

        assert (instructor instanceof Person);

    }

    public void testTeach (){

        Instructor instructor = new Instructor(3333,"mando");
        Student student = new Student(432,"may");
        instructor.teach(student, 2);
        assert (student.getTotalStudyTime()==2);

    }
    public void testLecture (){

        Instructor instructor = new Instructor(23232,"monday");
        Student student1 = new Student(2222,"danny");
        Student student2 = new Student(2232,"danniel");
        Student[] students = {student2,student1};
        instructor.lecture(students, 6);

        assert (student1.getTotalStudyTime()==3);
        assert (student2.getTotalStudyTime()==3);
    }

}
