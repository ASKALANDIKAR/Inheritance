
//  Create classes:
//  Person → Employee → Manager.
//  Each class should have one method:
//  displayPerson(), displayEmployee(), displayManager().


package com.multi_level_inheritance.problem1;

public class Manager extends Employee{
    public void displayManager(){
        System.out.println("\nThis is Manager Class");
        System.out.println("Salary: ₹40,000 ");
    }

    public static void main(String[] args) {
        Manager m = new Manager();

        m.displayPerson();      //For Person Class
        m.displayEmployee();    //For Employee Class
        m.displayManager();     //For Manager Class




    }


}
