package com.java;

public class Copycons {
    private String name;
    private double marks;
    // constructor
    Copycons(String name, double marks){
        this.name = name;
        this.marks = marks;
    }

    // copy constructor
    Copycons(Copycons c){
        //getters & setters
        this.name = c.getName();
        this.marks = c.getMarks();
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getMarks() {
        return marks;
    }
    public void setMarks(double marks){
        this.marks = marks;
    }

}

class Test{
    public static void main(String[] args) {
    Copycons c1 = new Copycons("Sayan",85.33);
        System.out.println("First student name is:- " + c1.getName());
        System.out.println("First student marks is:- " + c1.getMarks());
    Copycons cloneofc1 = new Copycons(c1);
    c1.setName("Rick");
    c1.setMarks(77.33);


        System.out.println("Clone student name is:- " + cloneofc1.getName());
        System.out.println("Clone student marks is:- " + cloneofc1.getMarks());
    }
}




