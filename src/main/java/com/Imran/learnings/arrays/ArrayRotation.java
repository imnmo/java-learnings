package com.Imran.learnings.arrays;

/**
 * Created by Imran on 12.10.2016.
 */

public class ArrayRotation
{
    public void rotateArray(int[] pArray)
    {
        int rotateArray[] = new int[pArray.length];

        int size = rotateArray.length - 1;
        for (int start = 0; start <= pArray.length - 1; start++)
        {
            rotateArray[size] = pArray[start];
            size--;
        }
        for (int i = 0; i <= pArray.length - 1; i++)
        {
            System.out.println(rotateArray[i]);

        }
    }

    public static void main(String args[])
    {
        ArrayRotation myTestArray = new ArrayRotation();
        int myArray[] = {1, 2, 3, 4};
        myTestArray.rotateArray(myArray);
    }
}
