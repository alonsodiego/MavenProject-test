package com.canvia;

import org.junit.Test;
import static org.junit.Assert.*;

import com.canvia.ClaseAnimal;
public class ClaseAnimalTest {

    @Test
    public void testConcatenate() {
        ClaseAnimal myUnit = new ClaseAnimal();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }

    @Test
    public void testConcatenate2() {
        ClaseAnimal myUnit = new ClaseAnimal();

        String result = myUnit.concatenate2("one", "two");

        assertEquals("onetwo", result);

    }

    @Test
    public void testConcatenate3() {
        ClaseAnimal myUnit = new ClaseAnimal();

        String result = myUnit.concatenate3("one", "two");

        assertEquals("onetwo", result);

    }

    @Test
    public void testConcatenate4() {
        ClaseAnimal myUnit = new ClaseAnimal();

        String result = myUnit.concatenate4("one", "two");

        assertEquals("onetwo", result);

    }
}