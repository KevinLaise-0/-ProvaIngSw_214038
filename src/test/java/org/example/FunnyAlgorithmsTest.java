package org.example;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class FunnyAlgorithmsTest
{
    private static int[] array = new int[]{1,4,5,8,12,34,65,78,89,99};
    private int[] anorderA = null;
    private static int[] orderArrayOne = new int[]{1,4,6,9,10};
    private static int[] orderArrayZero =new int[]{10,9,6,4,1};
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

    @Before
    public void beforeAnorderArray(){
        anorderA = new int[]{4,1,6,9,10};
        for(int i=0;i< anorderA.length;i++) {
            System.out.print(anorderA[i]+" ");
        }
        System.out.println();
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

    @Test(expected = IllegalArgumentException.class)
    public void shouldSelectionSortOrderWrongInsert(){
        System.out.println("ExceptionInsertOrder");
        f.selectionSort(array,2);
    }

    @Test
    public void shouldOrderOne(){
        f.selectionSort(anorderA,1);
        assertArrayEquals(orderArrayOne,anorderA);
    }

    @Test
    public void shouldOrderZero(){
        f.selectionSort(anorderA,0);
        for(int i=0;i< orderArrayZero.length;i++){
            System.out.println(orderArrayZero[i]+ " = " +anorderA[i]);
        }
        assertArrayEquals(orderArrayZero,anorderA);
    }
}
