package org.prog;

public class Plane {
    int currentPassengers;
    int maxPassengers;
    String flightId;
    String destination;
    public void setDestination(String destination){
        this.destination = destination;}

     public Plane(int currentPassengers, int maxPassengers, String flightId, String destination) {
        this.currentPassengers = currentPassengers;
        this.maxPassengers = maxPassengers;
        this.flightId = flightId;
        this.destination = destination;
    }

    public void showInfo() {
        System.out.println("Current passengers: " + currentPassengers);
        System.out.println("Max passengers: " + maxPassengers);
        System.out.println("Flight ID: " + flightId);
        System.out.println("Destination: " + destination);



    }
}
