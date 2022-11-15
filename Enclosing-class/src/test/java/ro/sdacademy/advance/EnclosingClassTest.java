package ro.sdacademy.advance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnclosingClassTest {


    @Test
    void testEnclosingClass(){

        EnclosingClass instance = new EnclosingClass();
        EnclosingClass.EnclosedClass innerClass = instance.new EnclosedClass();   // am creeat o instanta a innerClass numai daca creem o instatna mai intai a EnclosingClass si ne folosim de accea instanta.

        innerClass.incrementCounter();

        assertEquals(1, instance.getCounter());
    }

}
