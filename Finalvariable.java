package com.java;

public class Finalvariable {
    final int carspeed = 60;
    void run(){
//        carspeed = 90;
    }

    public static void main(String[] args) {
        Finalvariable a = new Finalvariable();
        a.run();
    }
}
