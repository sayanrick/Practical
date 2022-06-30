package com.java;

public class Paramecons {
    public static void main(String[] args) {
    Paramecons obj = new Paramecons("java");
        System.out.println("Course name " + obj.name);
        Paramecons obj1 = new Paramecons("C++");
        System.out.println("Course name " +obj1.name);
        Paramecons obj2 = new Paramecons("C");
        System.out.println("Course name " + obj2.name);
    }

    String name;
    Paramecons(String n){
        name = n;
        System.out.println("Parameterized constructor called:- ");
    }
}
