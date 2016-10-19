package com.Imran.learnings.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by ${User} on 14.10.2016.
 */
public class StringProcessing
{

    public static void main(String args[])
    {
        String myString = "finance/business/v1/financialTask/";

        List<String> split = new ArrayList<>();
        split.addAll(Arrays.asList(myString.split("/")));

        int myItemSIze = split.size();

        //Everything with iterator
        ListIterator myIterator = split.listIterator();
        while (myIterator.hasNext())
        {
            if (myItemSIze % 2 == 0)
            {
                int position = split.size();
                Object element = myIterator.next();
                if (myIterator.nextIndex() == position)
                {
                    myIterator.set("v2" + element);
                }
            }
        }
        System.out.println(split);


        for (String item : split)
        {
            if (item.startsWith("financialTask"))
            {
                int addIndex = split.indexOf("financialTask");
                String addItem = item.replaceFirst("financialTask", "createFinancialTask");
                split.remove(addIndex);
                split.add(addIndex, addItem);
            }

        }

        //Substring operation to uppercase
        String myProcessId = "lingo";
        String Bingo = myProcessId.substring(0, 1).toUpperCase() + myProcessId.substring(1);
        System.out.println(Bingo);

        //checks if the particular char is upper or lower
        Character.isLowerCase(myString.charAt(0));
        //reconstruc´t the string 
        StringBuilder stringBuilder = new StringBuilder();
        for (String item : split)
        {
            stringBuilder.append(item).append("/");
        }

        System.out.println(stringBuilder);

    }
}
