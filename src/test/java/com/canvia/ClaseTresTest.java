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
}