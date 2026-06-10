package org.prog.session3;
import org.prog.session3.phones.AndroidPhone;
import org.prog.session3.phones.ICamera;
import org.prog.session3.phones.IPhone;
import org.prog.session3.poly.Renault;
import org.prog.session3.poly.ICar;
import org.prog.session3.poly.BMW;
import org.prog.session3.poly.Mazda;

public class Session3 {
    public static void main(String[] args) {
        Mazda mazda = new Mazda();
        BMW bmw = new BMW();
        Renault renault = new Renault();
        mazda.driveTo("Kyiv");
        System.out.println("================");
        mazda.driveTo("Odessa", "Lviv");
        System.out.println("================");
        mazda.driveTo("Odessa", "Lviv", "Cherkasy");
        System.out.println("================");


        ICamera camera1 = new AndroidPhone();
        ICamera camera2 = new IPhone();
        camera1.takePhoto();
        camera2.takePhoto();

        System.out.println("================");
        mazda.driveTo("Kyiv", 3);
        System.out.println("================");
        mazda.driveTo("Lviv", 4, true);


            }
        }


