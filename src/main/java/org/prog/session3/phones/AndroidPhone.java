package org.prog.session3.phones;

public class AndroidPhone extends Phone implements ICamera{

    @Override

    public void takePhoto() {
        System.out.println("Android phone takes photo");

    }
}
