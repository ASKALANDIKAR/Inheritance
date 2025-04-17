package com.tka;

public class Family {

    public static void main(String[] args) {

        Father f = new Father();

        System.out.println("Property are inherited by Other Class");
        f.f1Property();  //can inherit Father Class
        f.g1Property();  //can inherit GrandFather Class

    }

}
