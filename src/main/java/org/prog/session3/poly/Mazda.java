package org.prog.session3.poly;

public class Mazda implements ICar {

    public void driveTo(String destination) {
        driveTo(destination, "here and now");
    }
    public void driveTo(String destination, String from) {
        driveTo(destination, from, "nowhere");

}
public void driveTo(String destination, String from, String stoppingAt) {

    System.out.println("Mazda drives from " + from + " to " + destination);
    System.out.println("Mazda stopping at " + stoppingAt);
        }
        public void driveTo(String destination, int passengers)  {
    System.out.println("Mazda drives to " + destination);
    System.out.println("Passenger: " + passengers);
    System.out.println("Gas split: no");
        }
        public void driveTo(String destination, int passengers, boolean gasSplit) {
        System.out.println("Mazda drives to " + destination);
        System.out.println("Passenger: " + passengers);
        System.out.println("Gas split: " + gasSplit);
        }
        public void manualGearSwich(int gear){
    System.out.println("Swich to " + gear);
        }
        @Override

    public void turn(String direction) {
    System.out.println("Mazda turns " + direction);
        }
        @Override
    public void accelerate(){
    System.out.println("Mazda asselerates");
        }
        @Override
    public void brake(){
    System.out.println("Mazda brakes");
        }
        }



