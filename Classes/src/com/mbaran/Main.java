package com.mbaran;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car audi = new Car();

        porsche.setModel("Carrera");
        audi.setModel("holden");
        System.out.println("Model is " + porsche.getModel());
        System.out.println("Model is " + audi.getModel());
    }
}
