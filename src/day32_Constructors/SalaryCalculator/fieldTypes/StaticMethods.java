package SalaryCalculator.fieldTypes;

public class StaticMethods {
    public int num=10;

    public static int count = 5;

    public static void displayMessage(String message){
        System.out.println("message = " + message);

        // System.out.println("num = " + num); non-static field

        System.out.println("count = " + count);
    }


public void instanceMethod(){
        System.out.println("instance method called");
        System.out.println("num = " + num);
        System.out.println("count = " + count);
        displayMessage("hello from instance method");

        }
}