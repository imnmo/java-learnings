package Algorithms;

import java.util.Map;
import java.util.TreeMap;

/**
 * Main driver for the Stack implemenetation
 *
 * @author enomoha
 */
public class StackDriver
{

    public static void main(String... args)
    {
        AbstractStackI myStack = new AbstractStackImpl<>(10);
//        myStack.pushElements("apple");
//        myStack.pushElements("banana");


//        while (!myStack.isEmpty())
//        {
        System.out.println(myStack.popElements());
//        }


        Map<String, String> myMap = new TreeMap<>();

    }

}
