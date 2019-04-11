package com.canvia;

import org.junit.Test;
import static org.junit.Assert.*;

import com.canvia.ClaseTres;
public class ClaseTresTest {

    @Test
    public void testConcatenate() {
        ClaseTres myUnit = new ClaseTres();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }

    @Test
    public void testConcatenate2() {
        ClaseTres myUnit = new ClaseTres();

        String result = myUnit.concatenate2("one", "two");

        assertEquals("onetwo", result);

    }

    @Test
    public void testConcatenate3() {
        ClaseTres myUnit = new ClaseTres();

        String result = myUnit.concatenate3("one", "two");

        assertEquals("onetwo", result);

    }

    @Test
    public void testConcatenate4() {
        ClaseTres myUnit = new ClaseTres();

        String result = myUnit.concatenate4("one", "two");

        assertEquals("onetwo", result);

    }
}