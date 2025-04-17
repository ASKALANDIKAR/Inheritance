package com.hybrid_inheritance;

public class Uncle extends  Gradpa{
    public void uncle(){
        System.out.println("This is uncle Property");

    }

    public static void main(String[] args) {
        Uncle u1 =new Uncle();
        u1.grandpa();
        u1.uncle();
    }
}
