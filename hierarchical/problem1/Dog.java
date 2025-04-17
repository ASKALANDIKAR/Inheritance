package com.hierarchical.problem1;

public class Dog extends Animal {


//  Override Rules:-
//  1.same method name
//  2.same parameters
//  3.different class(inherit)


    @Override
    void makeSound(){
        System.out.println("Dog's  Bark ! ");
    }

    public static void main(String[] args) {

        Dog d = new Dog();
        d.makeSound();

    }


}
