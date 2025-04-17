package com.single_inheritance;

public class Dog extends Animal {
    public void bark(){
        System.out.println("Dog's can Bark...");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
