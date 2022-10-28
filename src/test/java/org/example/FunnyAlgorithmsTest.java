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
    private static int[] array = new int[]{1,4,5,8,12,34,65,78,89,99};
    FunnyAlgorithms f = new FunnyAlgorithms();

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @BeforeClass
    public static void beforeClass(){

        System.out.println("Inizio con i test");
        /*
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }*/
    }

    @Test
    public void shouldStringAllNumber(){
        assertEquals(290,f.stringToIntConverter("290"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldCharInString(){
        System.out.println("shouldCharInStringException");
        f.stringToIntConverter("2s343");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldBigNumber(){
        System.out.println("shouldBigNumberEcxeption");
        f.stringToIntConverter("344444");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldLowNumber(){
        System.out.println("shouldLowNumberEcxeption");
        f.stringToIntConverter("-555555");
    }

    @Test
    public void shouldFindNumber(){
        assertEquals(1,f.binarySearch(array,4));
    }

    @Test
    public void shouldMidWrong(){
        assertEquals(-1,f.binarySearch(array,2));
    }

}
