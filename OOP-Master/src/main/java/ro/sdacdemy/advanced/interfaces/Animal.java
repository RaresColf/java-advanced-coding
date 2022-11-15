package ro.sdacdemy.advanced.interfaces;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(){

    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
