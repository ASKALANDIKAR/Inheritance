package com.hybrid_inheritance;

public class Daughter extends Aunt {
    public void sis(){
        System.out.println("This is Daughter Property");
    }

    public static void main(String[] args) {
        Daughter d1 = new Daughter();
        d1.grandpa();
        d1.aunt();
        d1.sis();
    }
}


