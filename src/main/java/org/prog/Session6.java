package org.prog;

public class Session6 {


        /**
         * ###############################
         * ###[aliceCar@Car]##############
         * #######s3->[]##################
         * #####[s1->"some string"]#######
         * ######[s2->""]#################
         * ##################[bobCar@Car]#
         * ###############################
         * ###############################
         */

        public static void main(String[] args) {
            Car aliceCar = new Car();
            Car bobCar = new Car();

            aliceCar.color = "blue";
            aliceCar.model = "3";
            bobCar.color = "red";

//        System.out.println(aliceCar.color);
//        System.out.println(bobCar.color);

            aliceCar.goTo();
            bobCar.goTo();

            aliceCar.refuel(25, "diesel");
            bobCar.refuel(15, "gasoline");
            aliceCar.goTo("Kyiv");
            bobCar.goTo("Cherkasy");

//        System.out.println(aliceCar.model);
//        System.out.println(bobCar.model);




//
//        String s1 = "some string";
//        String s2 = "";
//        String s3 = null;
        }
    }



