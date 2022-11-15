package ro.sdacdemy.advanced.interfaces;

public class Bird extends Animal implements CanFly{


    public Bird(String name) {
        super(name);
    }


    @Override
    public void eat() {
        System.out.println("eat nuts");
    }

    @Override
    public void breathe() {
        System.out.println("breathe in - out");
    }

    @Override
    public void fly() {
        System.out.println("flu flu");
    }
}
