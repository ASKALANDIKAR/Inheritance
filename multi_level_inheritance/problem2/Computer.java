

//  Class Device has method powerOn().
//  Inherit it in Computer which adds method boot().
//  Further inherit in Laptop, adding method carry().
//  Demonstrate all methods.


package com.multi_level_inheritance.problem2;

public class Computer extends Device{
    void boot(){

        System.out.println("\nThis is Computer Class");
        System.out.println("Computer is Booting UP");

    }
}
