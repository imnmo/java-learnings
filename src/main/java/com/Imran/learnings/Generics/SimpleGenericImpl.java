package com.Imran.learnings.Generics;

/**
 * Created by ${User} on 23.10.2016.
 */
public class SimpleGenericImpl
{

    public <E> void printArray(E[] inputArray)
    {
        // Display array elements              
        for (E element : inputArray)
        {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }


    public static void main(String args[])
    {
        SimpleGenericImpl mySimpleGeneric = new SimpleGenericImpl();
        Character[] mycharArray = {'a', 'b', 'c'};
        mySimpleGeneric.printArray(mycharArray);

        Double[] myDoubles = {1.00, 2.00, 3.00};
        mySimpleGeneric.printArray(myDoubles);

    }
}

