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
}