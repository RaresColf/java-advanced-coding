package ro.sdacdemy.advanced.polymorphism;

/**
 * // Create a base class called Car
 * // It should have a few fields that would be appropriate for a generic car class.
 * // engine, cylinders, wheels, etc.
 * // Constructor should initialize cylinders (number of) and name, and set wheels to 4
 * // and engine to true. Cylinders and names would be passed parameters.
 * //
 * // Create appropriate getters
 * //
 * // Create some methods like startEngine, accelerate, and brake
 * //
 * // show a message for each in the base class
 * // Now create 3 subclasses for your favorite vehicles.
 * // Override the appropriate methods to demonstrate polymorphism in use.
 * // put all classes in the one java file (this one).
 */
public class Main {

    public static void main(String[] args) {

        Car car = new Car(4,"basic car");

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());


        Mitsubishi mitsubishi = new Mitsubishi(6,"Mitsubishi");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());

        Car car2 = new Ford(8,"Ford");
        System.out.println(car2.startEngine());
        System.out.println(car2.accelerate());
    }
}

class Car {
    private boolean hasEngine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.hasEngine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate";
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name){
        super(cylinders,name);

    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine() ";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate";
    }
}

class Ford extends Car{
    public Ford(int cylinders, String name){
        super(cylinders,name);

    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine() ";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate";
    }
}
