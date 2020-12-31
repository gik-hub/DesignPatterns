package com.actitover;

public class User {
    // Fields
    public String name;

    public User(String name) {
        this.name = name;
    }

    // Methods
    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("My name is: " + name);
    }
}
