package com.actitover.polymorphism;

// Abstract class - a half baked cake
//      => cannot be used directly
//      => cannot create a new instance of it (!instanciated)
// ******** can only be extend (work like an interface)*******
public abstract class Shapes {

    // we don't know how to draw at this point - different shapes have different draws
    // abstract method must be in an abstract class
    public abstract void draw();
}
