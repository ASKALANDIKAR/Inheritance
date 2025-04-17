package com.hierarchical.problem2;

public class Student extends Person {

    void showStudent(){
        System.out.println("RollNo.: 1001 ");
    }


    public static void main(String[] args) {

        Student s = new Student();

        s.showStudent();
        s.shoePerson();

    }

}
