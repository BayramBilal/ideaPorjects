package day37_Inheritance.animalTask;

public class Test2 {
    public static void main(String[] args) {


        Animal animal = new Dog ("Bob","huskky", 'M', 2, "small", "Gray");

        if( animal instanceof Cat){
            System.out.println("animal is Cat " );
        }else{
            System.out.println("animal is not Cat " );

        }
    }





}
