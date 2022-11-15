package ro.sdacademy.advance;

/**
 * /*
 * Create a maven project
 * <p>
 * Create a class called EnclosingClass - this class should have a single field called counter (initialized with 0)
 * The class should have a single method which is a getter for this counter.
 * <p>
 * The class should contain an inner class named EnclosedClass
 * Enclosed class should have only one method named incrementCounter() which will increment the instance variable of the EnclosingClass
 * <p>
 * <p>
 * Write a test, in the test section of the maven project.
 * <p>
 * The test should create an instance of EnclosingClass and using that instance the test should create an instance of
 * EnclosedClass
 * <p>
 * call the increment method on the EnclosedClass instance
 * <p>
 * assert if EnclosingClass field counter is now 1
 */

public class EnclosingClass {

    private int counter = 0;

    public int getCounter() {
        return counter;
    }


    public class EnclosedClass{

         void incrementCounter() {            // nu am mai pus nimic inainte de void deci l-am facut default( package - private)
            EnclosingClass.this.counter++;

        }
    }
}