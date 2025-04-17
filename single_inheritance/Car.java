

package com.single_inheritance;

// Car Class inherits the properties of Vehicle Class
public class Car extends Vehicle {
    public void car  (){
        System.out.println("Car is a Vehicle");
    }

    public  static void main(String[] args) {
         Car c =new Car();
        c.start();
         c.car();

    }

}
