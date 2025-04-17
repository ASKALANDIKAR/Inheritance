package com.hybrid_inheritance;

public class Son extends Father{
    public void fSon(){
        System.out.println("This is Son's Property");
    }

    public static void main(String[] args) {
        Son s1 =new Son();
        s1.grandpa();
        s1.father();
        s1.fSon();
    }
}
