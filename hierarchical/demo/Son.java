package com.hierarchical.demo;

public class Son extends Father {

    public void m2() {
        System.out.println("Son inherit Father's Property");
    }

    public static void main(String[] args) {
        Son s = new Son();
        s.m2();
        s.show();
//		s.m1(); // Daughter class method cannot call in Son class
    }
}