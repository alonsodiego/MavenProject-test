package com.canvia;

import org.junit.Test;
import static org.junit.Assert.*;

import com.canvia.ClaseDos;
public class ClaseDosTest {

    @Test
    public void testConcatenate() {
        ClaseDos myUnit = new ClaseDos();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
}