package org.prog.session1;

//TODO: HW4: add String model and make equals & hashCode work by model and color
public class Car {

    public String color;
    public String model;

    public void setColor(String color) {
        this.color = color;
    }

    public void goTo() {
        System.out.println(color + " car is going somewhere");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car = (Car) obj;
            return this.color.equals(car.color) && this.model.equals(car.model);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return color.hashCode() + model.hashCode();
    }

    @Override
    public String toString() {
        return "Car : " + color;
    }

    public String getColor() {
        return color;
    }
}