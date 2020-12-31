package com.actitover.polymorphism;

public class Circle extends Shapes {

    // When extending an abstract class, implement all methods in it
    @Override
    public void draw() {
        System.out.println("Drawing a circle.......");
    }
}
