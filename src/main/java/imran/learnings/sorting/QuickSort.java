package imran.learnings.sorting;

import java.util.Arrays;

/**
 * This class demonstrates quick sort(all-round common implementations in many lang)
 */
public class QuickSort
{
    public void quickSort(int[] arrayToSort, int start, int end)
    {
        if (start >= end)
        {
            return;
        }
        int index = partition(arrayToSort, start, end);
        quickSort(arrayToSort, start, index - 1);
        quickSort(arrayToSort, index + 1, end);
    }

    /*
     * @return the correct pivot point
     */
    private int partition(int[] arrayToSort, int start, int end)
    {
        int pivot = arrayToSort[end];
        int partitionIndex = start;

        for (int i = start; i < end; i++)
        {
            if (arrayToSort[i] <= pivot)
            {
                int temp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[partitionIndex];
                arrayToSort[partitionIndex] = temp;
                partitionIndex++;
            }
        }
        int temp2 = arrayToSort[partitionIndex];
        arrayToSort[partitionIndex] = arrayToSort[end];
        arrayToSort[end] = temp2;

        return partitionIndex;
    }

    public static void main(String args[])
    {
        int[] myArray = {1, 4, 5, 2, 3, 0};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(myArray, 0, myArray.length - 1);
        System.out.println(Arrays.toString(myArray));

    }
}
