package com.Imran.learnings.Collections;

// Counts the frequency of each of the words in a file given in the command-line,
// and saves in a map of {word, freq}.

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ${User} on 23.10.2016.
 */
public class CountingWordFrequencyWithHash
{
    // build hash table with count
    Map<String, Integer> nameAndCount = new HashMap<>();

    public void countTheElements(List<String> names)
    {
        for (String name : names)
        {
            Integer count = nameAndCount.get(name);
            if (count == null)
            {
                nameAndCount.put(name, 1);
            }
            else
            {
                nameAndCount.put(name, ++count);
            }
        }
    }


    public static void main(String args[])
    {
        CountingWordFrequencyWithHash myCountingWordFrequencyWithHash = new CountingWordFrequencyWithHash();
        List<String> mystring = new ArrayList<>();
        Collections.addAll(mystring, "bingo", "lingo", "bingo");
        myCountingWordFrequencyWithHash.countTheElements(mystring);
    }
}
