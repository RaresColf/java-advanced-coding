package ro.sdacdemy.advanced.interfaces;

public class Dog extends Animal{

    public Dog(){
        super();
    }

    void printName(){
        //beacuse the field is private in base class(animal) - we cannot access it here without an getter
        System.out.println("Name is " + getName());
    }

    public Dog(String name) {
        super(name);
        System.out.println("Animal Constructor has been called");
    }

    @Override
    public void eat() {
        System.out.println(getClass() + ": Eat bones");
    }

    @Override
    public void breathe() {
        System.out.println("Dog breathe");
    }
}
