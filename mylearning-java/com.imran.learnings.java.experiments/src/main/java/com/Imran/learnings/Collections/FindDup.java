package com.Imran.learnings.Collections;

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

        boolean isPrsent = false;
        for (String myString : listContainingDuplicates)
        {
            if (!mySetWithoutDuplicates.add(myString))
            {
                isPrsent = true;
            }

        }
        return isPrsent;
    }

}
