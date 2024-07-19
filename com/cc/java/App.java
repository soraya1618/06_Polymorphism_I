package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drohne drohne = new Drohne();

        output(queen.doYourJob());
        output(queen.fly());

        output(worker.doYourJob());
        output(worker.fly());

        output(drohne.doYourJob());
        output(drohne.fly());
        


        
    }

   
   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

