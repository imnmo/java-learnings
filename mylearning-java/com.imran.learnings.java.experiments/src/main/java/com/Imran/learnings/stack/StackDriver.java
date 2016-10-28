package com.Imran.learnings.stack;

/**
 * Main driver for the Stack implemenetation
 *
 * @author enomoha
 */
public class StackDriver
{

    public static void main(String... args)
    {
        AbstractStackI myStack = new AbstractStackImpl<>(1);
        myStack.pushElements("apple");
        myStack.pushElements("banana");
        myStack.pushElements("banana");
        myStack.pushElements("apple");
        myStack.pushElements("banana");
        myStack.pushElements("apple");
        myStack.pushElements("ornge");
        myStack.pushElements("pizza");
        myStack.pushElements("choclate");

        while (!myStack.isEmpty())
        {
            System.out.println(myStack.popElements());
        }

    }

}
