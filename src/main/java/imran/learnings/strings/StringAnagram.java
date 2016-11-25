package imran.learnings.strings;


import java.util.Arrays;

/**
 * Created by ${User} on 21.10.2016.
 */
public class StringAnagram
{
    public static String numberNeeded(String first, String Second)
    {
        // initializing unsorted int array
        char iArr[] = first.toCharArray();
        // sorting array
        Arrays.sort(iArr);

        char jArr[] = Second.toCharArray();

        Arrays.sort(jArr);

        if (new String(iArr).equals(new String(jArr)))
        {
            return "All Anagram";
        }

        return "No Anana";

    }

    public static void main(String[] args)
    {
        String mystring = numberNeeded("bingo", "ingbo");
        System.out.println(mystring);
    }
}
