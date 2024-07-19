package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();


        pollobject(queen);
        pollobject(drone);
        pollobject(worker);

        HoneyBee bee = new HoneyBee();
        pollobject(bee);
    }
    // Polymorphism example
    private static void pollobject(HoneyBee object) {
        output(object.doYourJob());
        output(object.fly());
        output("**************");
    } 

   





    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

