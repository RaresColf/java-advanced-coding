package ro.sdacdemy.advanced.interfaces;

public class Parrot extends Bird{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("eat something");
    }
}
