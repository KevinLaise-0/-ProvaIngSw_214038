package org.example;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class FunnyAlgorithmsTest
{
    private static String sTi;
    FunnyAlgorithms f = new FunnyAlgorithms();

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("inizio con i test");

    }

    @Test
    public void shouldStringAllNumber(){
        assertEquals(290,f.stringToIntConverter("290"));
    }
    
}
