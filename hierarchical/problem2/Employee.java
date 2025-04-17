package com.hierarchical.problem2;

public class Employee  extends Person{

    void ShowEmp(){

        System.out.println("Employee Salary: 45000");
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.shoePerson();
        emp.ShowEmp();
    }
}
