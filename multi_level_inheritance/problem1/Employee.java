
//  Create classes:
//  Person → Employee → Manager.
//  Each class should have one method:
//  displayPerson(), displayEmployee(), displayManager().


package com.multi_level_inheritance.problem1;


//This is Child Class (SubClass)

public class Employee extends Person {
    public void displayEmployee(){
        System.out.println("\nThis is Employee Class");
        System.out.println("Employee ID: 101");

    }
}
