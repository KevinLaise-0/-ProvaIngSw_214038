package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FunnyAlgorithms f = new FunnyAlgorithms();
        int[] array = new int[]{4,1,6,9,10};
        //System.out.println(f.stringToIntConverter("295555"));
        f.selectionSort(array,0);
        for(int i=0;i< array.length;i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        f.selectionSort(array,1);
        for(int i=0;i< array.length;i++) {
            System.out.print(array[i]+" ");
        }

    }

}
