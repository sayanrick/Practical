package com.java;

public class Rectangle_Square {
    public static void main(String[] args) {
    Rectangle r = new Rectangle();
    System.out.println("Perimeter of rectangle:- ");
    System.out.println(r.perimeterRectangle(98,42));
        System.out.println("Area of rectangle:- ");
    System.out.println(r.areaRectangle(98,42));
    Square s = new Square();
    System.out.println("Area of square:- ");
    System.out.println(s.areaSquare(12));
    }
}

class Rectangle{
    int length;
    int width;

    static int perimeterRectangle(int l, int w){
        return 2 * (l + w);
    }

    static int areaRectangle(int l, int w){
        return l * w;
    }

}

class Square{
    int a;
    static int areaSquare(int a){
        return a * a;
    }
}
