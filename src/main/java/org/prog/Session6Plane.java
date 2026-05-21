package org.prog;

public class Session6Plane {
    public static void main(String[] args) {

            Plane plane1 = new Plane(120, 180, "AA-1001", "London");
            Plane plane2 = new Plane(95, 150, "BB-5555", "Paris");

            plane1.showInfo();
            plane1.setDestination("Rome");
            plane1.showInfo();
            System.out.println("------------------");
            plane2.showInfo();

        }
    }





