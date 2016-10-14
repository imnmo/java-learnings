package com.Imran.learnings.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        StringBuilder stringBuilder = new StringBuilder();
        for (String item : split)
        {
            stringBuilder.append(item).append("/");
        }

        System.out.println(stringBuilder.toString());

    }
}
