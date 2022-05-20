package com.company;

public class Flat extends Person implements Action{

    public Flat(String name) {
        super(name);
    }
    public Flat(){

    }

    @Override
    public void money() {
        System.out.println("Kom-usluga kvartiry 3000 som");
    }

    @Override
    public void address() {
        System.out.println("Verhnyi djal");
    }

    @Override
    public String toString() {
        return "Flat{} " + super.toString();
    }
}
