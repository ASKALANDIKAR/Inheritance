
//  Class Device has method powerOn().
//  Inherit it in Computer which adds method boot().
//  Further inherit in Laptop, adding method carry().
//  Demonstrate all methods.



package com.multi_level_inheritance.problem2;

public class Laptop extends Computer {
    void carry(){

        System.out.println("This is Laptop Class");
        System.out.println("Laptop is portable and easy to carry.");

    }


    public static void main(String[] args) {
        Laptop lap = new Laptop();


        lap.powerON();
        lap.boot();
        lap.carry();
    }

}
