package com.company;

public class Main {

    public static void main(String[] args) {

        Action[] person = {new Flat("Aza"),new Flat("Jazgul")};
        int count = 0;
        for (Action persons : person) {
            count++;
            System.out.println(persons);
        }
        Flat flat = new Flat();
        System.out.print("Address: ");
        flat.address();
        System.out.print("Кол-во людей: ");
        System.out.println(count);
        System.out.println("------------------------------");

        Action[] person1 = {new Hostel("Nurba"),new Hostel("Jazgul"),new Hostel("Aizat")};
        int count1 = 0;
        for (Action persons2 : person1) {
            count1++;
            System.out.println(persons2);
        }
        Hostel hostel = new Hostel();
        System.out.print("Adress: ");
        hostel.address();
        System.out.print("Кол-во людей: ");
        System.out.println(count1);
        System.out.println("---------------------------------");

        Action[]  person3 = {new Hotel("Shuma"),new Hotel("Zara"),new Hotel("Kuba"),new Hotel("Peri")};
        int count2 = 0;
        for (Action persona : person3) {
            count2++;
            System.out.println(persona);
        }
        Hotel hotel = new Hotel();
        System.out.print("Adress: ");
        hotel.address();
        System.out.print("Кол-во людей:");
        System.out.println(count2);
        System.out.println("----------------------------------");
    }
}
