package Animalrescue;

public class Veterinar extends Human {

    @Override
    public void work() {
        System.out.println("examines animals");
    }

    @Override
    public void moove() {
        System.out.println("walk through the room");
    }

    @Override
    public void eat() {
        System.out.println("have a nice meal");
    }

    @Override
    public void relax() {
        System.out.println("take a break");
    }

    @Override
    public void callTheAnimal() {
        System.out.println("get the animal");
    }
}
