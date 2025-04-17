package com.hierarchical.problem1;

public class Cat extends Animal {

    void makeSound(){
        System.out.println("Cat's Makes Sound.....Meow ! ");
    }


    public static void main(String[] args) {
        Cat c =new Cat();
        c.makeSound();

    }
}
