package imran.learnings.strings.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * author: mohamedi
 * <p>
 * This program reverses the given input
 * string
 * <p>
 * Problem : Reverse a String - Enter a string and the
 * program will reverse it and print it out.
 */

public class StringReverse
{

    private String _inputValue = "";
    Scanner input = new Scanner(System.in);
    String output = "";

    /**
     * Handles the given input
     * from the console
     */

    public void inputHandler()
    {

        try
        {
            System.out.println("Please Enter a value:");
            _inputValue = input.next();
        }
        catch (Exception ex)
        {
            System.out.println("NO OR WRONG USER INPUT");
        }
        finally
        {
            input.close();
        }

        stringReverser(_inputValue); // A given string reverser
//        stringReverserAsList(); // Bunch of string �reverser

    }

    /**
     * Reverses the given input based on
     * the user input
     * <p>
     * implementation based on the naive attempt
     * using for loop reverse iteration
     */
    public void stringReverser(String pInput)
    {

        for (int i = pInput.length() - 1; i >= 0; i--)
        {
            String tempOutput = pInput.substring(i, i + 1);
            output += tempOutput;
        }

        System.out.println(output);

    }

    /**
     * Reverses the given input based on
     * the set or bunch of strings
     * <p>
     * implementation based on the list reverse
     */

    public void stringReverserAsList()
    {

        List<String> StringList = new ArrayList<String>();
        StringList.add("one");
        StringList.add("two");
        StringList.add("ka");
        StringList.add("four");
        Collections.reverse(StringList);
        for (String s : StringList)
        {
            System.out.println(s);

        }


    }


}
