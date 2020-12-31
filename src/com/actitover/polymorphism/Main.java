package com.actitover.polymorphism;
// poly => many morph => form ====> many forms

public class Main {

    public static void main(String[] args){
    drawShapes(new Circle());
    drawShapes(new Square());
    }

    public static void drawShapes(Shapes shape) {
        shape.draw();
    }

}

