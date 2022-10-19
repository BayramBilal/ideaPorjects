package day39_Recap.deviiceTask;

public class Phone extends Device {

    public Phone( String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Phone", model, price, hasBattery, hasPowerButton);
    }


    public void  turnOn() {
        System.out.println(brand + " "+model+" is opening" );
    }

    public void  turnOff() {
        System.out.println(brand + " "+model+" is closing");
    }






}
