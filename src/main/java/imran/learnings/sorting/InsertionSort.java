package imran.learnings.sorting;

import java.util.Arrays;

/**
 * this class demonstrates the insertion sort
 */
public class InsertionSort
{
    public int[] insertionSort(int[] arrayToSort)
    {
        for (int in = 1; in < arrayToSort.length - 1; in++)
        {
            int value = arrayToSort[in];
            int hole = in;
            while (hole > 0 && arrayToSort[hole - 1] > value)
            {
                arrayToSort[hole] = arrayToSort[hole - 1];
                --hole;
            }
            arrayToSort[hole] = value;
        }

        return arrayToSort;
    }

    public static void main(String args[])
    {
        int[] myArray = {1, 4, 5, 2, 3, 0};
        InsertionSort insertionSort = new InsertionSort();
        System.out.print(Arrays.toString(insertionSort.insertionSort(myArray)));
    }
}
