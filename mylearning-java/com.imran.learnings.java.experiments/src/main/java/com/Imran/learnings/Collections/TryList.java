package com.Imran.learnings.Collections;

import java.util.ArrayList;
import java.util.List;

public class TryList
{

    public static void main(String[] args)
    {

        //Rememeber always the list maintains an ordering


//        Set<String> mySet = new HashSet<>();


        List<String> myList = new ArrayList<>();

        myList.add("P");
        myList.add("M");
        myList.add("L");

/*
        for (String setter : mySet)
        {
            System.out.println(setter);
        }
          */
        FindDup myDup = new FindDup();
        if (myList.size() > 1)
        {
            System.out.println("Output is :" + myDup.findDuplicates(myList));
        }


    }
}
