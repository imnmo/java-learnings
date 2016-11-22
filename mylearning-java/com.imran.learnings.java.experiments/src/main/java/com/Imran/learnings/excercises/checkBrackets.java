package com.Imran.learnings.excercises;

import java.util.Stack;

/**
 * Created by ${User} on 22.11.2016.
 */
public class checkBrackets
{
    public static boolean validate(String text)
    {
        char[] myArray = text.toCharArray();
        Stack myStackInward = new Stack<>();
        Stack myStackOutward = new Stack<>();
        boolean isBalanced = false;
        if (text == null)
        {
            throw new NullPointerException();
        }
        //push items to two stack
        for (int i = 0; i <= myArray.length - 1; i++)
        {
            //add all symbols
            if (myArray[i] == '{' || myArray[i] == '(' || myArray[i] == '[')
            {
                myStackInward.push(myArray[i]);
            }
        }

        for (int i = 0; i <= myArray.length - 1; i++)
        {
            if (myArray[i] == ')' || myArray[i] == '}' || myArray[i] == ']')
            {
                if (myStackInward.peek() == '{' && myArray[i] == '}' ||
                        myStackInward.peek() == '[' && myArray[i] == ']' ||
                        myStackInward.peek() == '(' && myArray[i] == ')')
                {
                    isBalanced = true;
                    myStackInward.pop();
                }
            }
        }

        //TODO unbalanced case and other cases!!
        if (myStackInward.size() != myStackOutward.size())
        {
            return isBalanced;
        }

        return isBalanced;
    }

    public static void main(String[] args)
    {
        checkBrackets myCheckBrackets = new checkBrackets();
        boolean myValue = myCheckBrackets.validate("(foo)");
        System.out.println(myValue);

    }
}
