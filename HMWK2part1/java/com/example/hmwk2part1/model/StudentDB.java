package com.example.hmwk2part1.model;

import java.util.ArrayList;

public class StudentDB {
    private static final StudentDB ourInstance = new StudentDB();

    private ArrayList<Student> mStudents;

    static public StudentDB getInstance() {return ourInstance;}

    private StudentDB(){createStudentObjects();}

    public ArrayList<Student> getStudents(){return mStudents;}

    public void setStudents(ArrayList<Student> students){mStudents = students;}

    private void createStudentObjects(){

        Student studetObject;
        ArrayList<CourseEnrollment> courses = new ArrayList<CourseEnrollment>();
        mStudents = new ArrayList<Student>();

        studetObject  = new Student("Aarib", "Abdullah", 889889473);
        courses.add(new CourseEnrollment("CPSC 411", "A+"));
        courses.add(new CourseEnrollment("CPSC 440", "C"));
        studetObject.setmCourses(courses);

        mStudents.add(studetObject);


        studetObject  = new Student("Aatib", "Abdullah", 889617473);
        courses = new ArrayList<CourseEnrollment>();
        courses.add(new CourseEnrollment("CPSC 411", "A"));
        courses.add(new CourseEnrollment("CPSC 440", "A-"));
        studetObject.setmCourses(courses);

        mStudents.add(studetObject);
    }
}
