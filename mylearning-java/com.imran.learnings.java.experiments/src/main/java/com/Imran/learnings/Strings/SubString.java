package com.Imran.learnings.strings;

/**
 * Created by ${User} on 01.11.2016.
 */
public class SubString
{
    // Returns true if str1[] is a subsequence of str2[]. m is
// length of str1 and n is length of str2
    boolean isSubSequence(char str1[], char str2[], int m, int n)
    {
        int j = 0; // For index of str1 (or subsequence

        // Traverse str2 and str1, and compare current character 
        // of str2 with first unmatched char of str1, if matched 
        // then move ahead in str1
        for (int i = 0; i < n && j < m; i++)
            if (str1[j] == str2[i])
                j++;

        // If all characters of str1 were found in str2
        return (j == m);
    }


    public static void main(String[] args)
    {
        SubString mySubString = new SubString();
        String myString = "Lingo";
        char[] myCharArray = myString.toCharArray();
        String myString2 = "go";
        char[] myCharArray2 = myString.toCharArray();
        boolean myvalue = mySubString.isSubSequence(myCharArray, myCharArray2, myString.length(), myString2.length());
        System.out.println(myvalue);
    }
}
