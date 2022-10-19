package day39_Recap.deviiceTask;

public class Device {


   private String brand, model;
    private double price;
    private boolean  hasBattery, hasPowerButton;




    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if(brand == null){
            System.err.println("Brand can not be null");
            System.exit(1);
        }

        if(brand.isEmpty() || brand.isBlank()){
            System.err.println("Invalid brand");
            System.exit(1);
        }

        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model == null){
            System.err.println("Model can not be null");
            System.exit(1);
        }

        if(model.isEmpty() || model.isBlank()){
            System.err.println("Invalid model");
            System.exit(1);
        }
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.err.println("Price can not be zero and under 0");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public Device(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public void  turnOn() {
        System.out.println(brand + " "+model+" is opening" );
    }
    public void  turnOff() {
        System.out.println(brand + " "+model+" is closing");
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
