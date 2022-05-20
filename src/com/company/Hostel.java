package com.company;

public class Hostel extends Person implements Action{
    public Hostel(String name) {
        super(name);
    }
    public Hostel(){

    }

    @Override
    public void money() {
        System.out.println("Arenda");
    }

    @Override
    public void address() {
        System.out.println("Nejnyi djal");

    }

    @Override
    public String toString() {
        return "Hostel{} " + super.toString();
    }
}
