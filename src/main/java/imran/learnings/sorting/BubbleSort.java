package imran.learnings.sorting;

import java.util.Arrays;

/**
 * This class demonstrates the bubble sort algorithm
 */
public class BubbleSort
{
    public int[] BubbleSort(int[] arrayToSort)
    {
        for (int in = arrayToSort.length - 1; in != 0; in--)
        {
            for (int j = 0; j < in; j++)
            {
                if (arrayToSort[j] > arrayToSort[j + 1])
                {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;
                }
            }
        }
        return arrayToSort;
    }

    public static void main(String args[])
    {
        int[] myArray = {1, 4, 5, 2, 3, 7, 42, 5,};
        BubbleSort myBubbleSort = new BubbleSort();
        System.out.print(Arrays.toString(myBubbleSort.BubbleSort(myArray)));
    }
}
