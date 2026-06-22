package org.prog.session6;

import org.testng.annotations.Test;
import org.prog.session1.Car;

import java.util.*;

public class MapDemoTest {
    @Test
     public void mapDemoTest(){

        Map<String, List<String>> map = new HashMap<>();
        map.put("17253761525", new ArrayList<>());

        map.get("17253761525").add("FOP #1");
        map.get("17253761525").add("FOP #2");
        map.get("17253761525").add("FOP #3");
        map.get("17253761525").add("FOP #4");

        List<String> list1 = map.get("17253761525");

        for (String someString : list1) {
            System.out.println("Citizen 17253761525 has : " + someString);}


        Map<String, List<Car>> carsMap = new HashMap<>();

        carsMap.put("Jon", new ArrayList<>());
        carsMap.put("Jane", new ArrayList<>());
        Car car1 = new Car();
        car1.model = "BMW";
        car1.color = randomColor();

        Car car2 = new Car();
        car2.model = "Audi";
        car2.color = randomColor();

        Car car3 = new Car();
        car3.model = "Mazda";
        car3.color = randomColor();

        carsMap.get("Jon").add(car1);
        carsMap.get("Jon").add(car2);
        carsMap.get("Jane").add(car3);

        for (String owner : carsMap.keySet()) {
            System.out.println(owner + " owns :");
            for (Car car : carsMap.get(owner)) {
                System.out.println(car);

            }
        }
    }


    public static String randomColor() {
        Random random = new Random();
        return switch (random.nextInt(5)) {
            case 0 -> "red";
            case 1 -> "green";
            case 2 -> "blue";
            case 3 -> "yellow";
            case 4 -> "pink";
            default -> "black";
        };
    }
}



