package oop;

import java.util.Random;
import java.util.UUID;

public class Session7BigPlane7 {
    public static void main(String[] args) {

        Random random = new Random();
        BigPlane7[] planes = new BigPlane7[5];
        int planesWithHalfOrLess = 0;
        String[] destinations = {
                "London", "Paris", "Rome", "Berlin", "Madrid"};
        for (int i = 0; i < planes.length; i++) {
            int maxPassengers = random.nextInt(101) + 100;
            int currentPassengers = random.nextInt(maxPassengers + 1);

            String flightId = UUID.randomUUID().toString();
            String destination = destinations[random.nextInt(destinations.length)];
            planes[i] = new BigPlane7(currentPassengers, maxPassengers, flightId, destination);
            if (currentPassengers <= maxPassengers / 2) {
                planesWithHalfOrLess++;
            }
        }
        for (BigPlane7 plane : planes) {
            plane.showInfo();
        }
        System.out.println("Planes wiht half or less seats taken:" + planesWithHalfOrLess);

    }
}


