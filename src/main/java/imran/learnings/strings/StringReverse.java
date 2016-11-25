package imran.learnings.strings;

import java.util.Arrays;


public class StringReverse
{

    public static void main(String[] args)
    {
        ReverseString();
        PalindromeString();
    }

    /**
     * An inplace string reversal
     */
    private static void ReverseString()
    {
        String myString = "Lingo";
        char[] myCharArray = myString.toCharArray();

        char myTemp;
        int start = 0;
        int end = myCharArray.length - 1;

        System.out.println(Arrays.toString(myCharArray));

        while (start < end)
        {
            myTemp = myCharArray[start];
            myCharArray[start] = myCharArray[end];
            myCharArray[end] = myTemp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(myCharArray));
    }

    /**
     * Finds if the given string is palindrome or not
     */
    private static void PalindromeString()
    {
        String myString = "kayak";
        char[] myCharArray = myString.toCharArray();

        char myTemp;
        int start = 0;
        int end = myCharArray.length - 1;

        while (start < end)
        {
            if (myCharArray[start] == myCharArray[end])
            {
                System.out.println("Is a Palindrome");
                start++;
                end--;

            }
            else
            {
                break;
            }

        }

    }
}
