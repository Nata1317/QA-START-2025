package org.prog;
import oop.BigPlane7;

import java.util.Random;
import java.util.UUID;

public class ManyPlanes9 {
    BigPlane7[] planes = new BigPlane7[50];
    public void createPlanes() {
        Random random = new Random();
        String[] destinations = {
                "London", "Paris", "Rome", "Berlin", "Madrid"};
        for (int i = 0; i < planes.length; i++) {
            int maxPassengers = random.nextInt(101) + 100;
            int currentPassengers = random.nextInt(maxPassengers + 1);

            String flightId = UUID.randomUUID().toString();
            String destination = destinations[random.nextInt(destinations.length)];
            planes[i] = new BigPlane7(currentPassengers, maxPassengers, flightId, destination);
         }
        }
    public int getPlanesCount(){
        return planes.length;
    }
        public void sortPlanes() {
        for (int i = 0; i < planes.length -1; i++){
            for(int j = 0; j < planes.length -1 - i; j++){
                if (planes[j].getSeatsTakenPercentage() > planes[j + 1].getSeatsTakenPercentage()){
          BigPlane7 temp = planes[j];
          planes[j] = planes[j +1];
          planes[j +1] = temp;
                }
                }
        }
        }

                public void showPlanes(){
                for (BigPlane7 plane : planes){
                    plane.showInfo();





        }
    }

}

