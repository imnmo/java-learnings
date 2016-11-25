package imran.learnings.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by enomoha on 24.08.2016.
 */
public class FindDup
{


    public boolean findDuplicates(List<String> listContainingDuplicates)
    {

        Set<String> mySetWithoutDuplicates = new HashSet<>();
        List<String> myListHasDuplicates = new ArrayList<>();

        boolean isPrsent = false;
        for (String myString : listContainingDuplicates)
        {
            if (!mySetWithoutDuplicates.add(myString))
            {
                myListHasDuplicates.add(myString);
                isPrsent = true;
            }

        }
        System.out.println(Arrays.toString(myListHasDuplicates.toArray()));
        return isPrsent;
    }


    public Set<Character> findRepetables(String pString)
    {

        Set<Character> mySetWithoutDuplicates = new HashSet<>();

        boolean isPrsent = false;
        char temp = ' ';
        for (char myString : pString.toCharArray())
        {
            if (!mySetWithoutDuplicates.add(myString))
            {
                temp = myString;
                isPrsent = true;

            }

        }
        return mySetWithoutDuplicates;
    }
}
