package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();


        pollobject(queen);
        pollobject(drone);
        pollobject(worker);
    }
    // overloading
    private static void pollobject(Queen object) {
        output(object.doYourJob());
        output(object.fly());
        output("**************");
    } 

    // overloading
    private static void pollobject(Worker object) {
        output(object.doYourJob());
        output(object.fly());
        output("**************");
    } 

    // overloading
    private static void pollobject(Drone object) {
        output(object.doYourJob());
        output(object.fly());
        output("**************");
    } 










    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

