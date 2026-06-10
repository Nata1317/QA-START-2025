package org.prog.session3.phones;

public class IPhone extends Phone implements ICamera {

    @Override

    public void call(String subscriber){
        System.out.println("IPhone calling" + subscriber);
    }

    @Override
     public void takePhoto() {
        System.out.println("IPhone takes photo");
    }


}
