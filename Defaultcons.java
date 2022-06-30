package com.java;

public class Defaultcons {
    public static void main(String[] args) {
    Defaultcons obj = new Defaultcons();
        System.out.println("The name is" + obj.name);
    }

    String name;
    Defaultcons(){
        name = "Java";
        System.out.println("Default Constructor called:- ");
    }
}
