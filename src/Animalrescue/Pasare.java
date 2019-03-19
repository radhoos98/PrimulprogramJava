package Animalrescue;

public class Pasare extends Animal {

    @Override
    public void eat() {
        System.out.println("gulp");
    }

    @Override
    public void jump() {
        System.out.println("hop");
    }

    @Override
    public void runs() {
        System.out.println("move quickly");
    }

    @Override
    public void sleep() {
        System.out.println("close eyes" + "put head between feathers");
    }

    @Override
    public void speak() {
        System.out.println("chirps");
    }

    @Override
    public void moove() {
        System.out.println("fly");
    }
}

