package Animalrescue;

public class Catel extends Animal{

    @Override
    public void speak() {
        System.out.println("whoof");
    }

    @Override
    public void sleep() {
        System.out.println("snorre");
    }

    @Override
    public void runs() {
        System.out.println("run");
    }

    @Override
    public void jump() {
        System.out.println("bounce");
    }

    @Override
    public void eat() {
        System.out.println("gulps");
    }

    @Override
    public void moove() {
        System.out.println("walk");
    }
}
