package org.prog;

public class Car {


        public String color;
        public String model;

        public void goTo() {
            System.out.println(color + " car is going somewhere");}
            public void goTo(String destination) {
                System.out.println(color + " car is going to " + destination);
        }

        public void refuel(int amount, String fuelType) {
            System.out.println(color + " car is refueling " + amount + " liters of " + fuelType);
        }
    }

