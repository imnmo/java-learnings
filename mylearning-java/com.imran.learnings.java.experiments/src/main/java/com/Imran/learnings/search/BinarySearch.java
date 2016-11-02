package com.Imran.learnings.search;

/**
 * Created by ${User} on 02.11.2016.
 */
public class BinarySearch
{

    public boolean binarySearch(char key, char[] data)
    {
        int start = 0;
        int end = data.length - 1;

        while (start <= end)
        {
            int middle = (end + start) / 2;
            if (data[middle] == key)
            {
                return true;

            }
            if (data[middle] < key)
            {
                start = middle + 1;

            }
            if (data[middle] > key)
            {
                end = middle - 1;

            }

        }
        return false;
    }

    public static void main(String args[])
    {
        BinarySearch myBinarySearch = new BinarySearch();
        char[] myCharArray = {'a', 'b'};
        System.out.println(myBinarySearch.binarySearch('b', myCharArray));
    }

}
