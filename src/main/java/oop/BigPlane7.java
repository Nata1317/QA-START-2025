package oop;

public class BigPlane7 {
    int currentPassengers;
    int maxPassengers;
    String flightId;
    String destination;

    public BigPlane7(int currentPassengers, int maxPassengers, String flightId, String destination) {
        this.currentPassengers = currentPassengers;
        this.maxPassengers = maxPassengers;
        this.flightId = flightId;
        this.destination = destination;
    }
     public int getAvailableSeats() {
         return maxPassengers - currentPassengers;
     }

    public void showInfo() {
        System.out.println("Current passengers: " + currentPassengers);
        System.out.println("Max passengers: " + maxPassengers);
        System.out.println("Flight ID: " + flightId);
        System.out.println("Destination: " + destination);
        System.out.println("Available seats:" + getAvailableSeats());
        System.out.println("---------------");


    }
}
