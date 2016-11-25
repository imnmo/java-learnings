package com.Imran.learnings.excercises;

import java.util.Stack;

public class BalancedBrackets
{
    public static boolean validate(String text)
    {
        char[] myArray = text.toCharArray();
        Stack myStackInward = new Stack<>();
        Stack myStackOutward = new Stack<>();
        boolean isBalanced = true;

        if (text == null)
        {
            throw new NullPointerException();
        }
        if (text.isEmpty())
        {
            return true;
        }

        //push items to two stack
        for (int i = 0; i <= myArray.length - 1; i++)
        {
            //add all symbols
            if (myArray[i] == '{' || myArray[i] == '(' || myArray[i] == '[')
            {
                myStackInward.push(myArray[i]);
            }
            if (myArray[i] == ')' || myArray[i] == '}' || myArray[i] == ']')
            {
                myStackOutward.push(myArray[i]);
            }
        }

        if (myStackInward.size() != myStackOutward.size())
        {
            return false;
        }
        //Do comparison on peeked elements
        for (int i = 0; i <= myArray.length - 1; i++)
        {
            if (myArray[i] == ')' || myArray[i] == '}' || myArray[i] == ']')
            {
                //on exact position
                if (myStackInward.peek() == myArray[i])
                {
                    myStackInward.pop();
                    isBalanced = true;

                }
                //on arbitraray position
                else if (myStackInward.peek() == '{' && myArray[i] == '}' ||
                        myStackInward.peek() == '[' && myArray[i] == ']' ||
                        myStackInward.peek() == '(' && myArray[i] == ')')
                {
                    isBalanced = true;
                    myStackInward.pop();
                }
                else
                {
                    isBalanced = false;
                }
            }
        }
        return isBalanced;
    }

    public static void main(String[] args)
    {
        BalancedBrackets myBalancedBrackets = new BalancedBrackets();
        boolean myValue = myBalancedBrackets.validate("(foo)");
        System.out.println(myValue);

    }
}
