package com.company;

public class Hotel extends Person implements Action{

    public Hotel(String name) {
        super(name);
    }
    public Hotel(){

    }

    @Override
    public void money() {
        System.out.println("Arenda");
    }

    @Override
    public void address() {
        System.out.println("Srednyi djal");
    }

    @Override
    public String toString() {
        return "Hotel{} " + super.toString();
    }
}
