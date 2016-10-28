package com.Imran.learnings.demos;

import java.util.List;

/**
 */


public class MaximumFinder
{


    /**
     * @author enomoha
     * <p>
     * This class finds the maximum of anything(arrays, lists or plugin your collections)
     */

    public void maxFinder(List<Integer> myList)
    {

        int maximumValue = 0;

        for (int ListObj : myList)
        {
            if (ListObj > maximumValue)
            {
                maximumValue = ListObj;
            }
        }
        System.out.println("the maximal value is " + maximumValue);
    }
}
