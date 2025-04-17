package com.hierarchical.demo;

public class Daughter extends Father {

    public void m1() {
        System.out.println("Daughter inherits Father Property");
    }

    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.m1();
        d.show();

    }
}