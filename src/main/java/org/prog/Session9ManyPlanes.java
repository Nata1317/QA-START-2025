package org.prog;


public class Session9ManyPlanes {
        public static void main(String[] args) {
            ManyPlanes9 planes9 = new ManyPlanes9();
            planes9.createPlanes();
            planes9.sortPlanes();
            planes9.showPlanes();
            System.out.println("Total planes: " + planes9.getPlanesCount());

    }

}
