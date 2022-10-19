package day44_Abstraction.animalTask;

public class Eagle extends Animal implements Flyable, WildAnimal{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void hunt() {

    }
}
