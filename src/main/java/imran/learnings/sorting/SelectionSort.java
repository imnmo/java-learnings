package imran.learnings.sorting;

import java.util.Arrays;

/**
 * This class demonstrates the classic selection sort
 */
public class SelectionSort
{
    public int[] SelectionSort(int[] arrayToSort)
    {
        for (int out = 0; out <= arrayToSort.length - 1; out++)
        {
            int min = out;
            for (int in = out + 1; in <= arrayToSort.length - 1; in++)
            {
                if (arrayToSort[in] < arrayToSort[min])
                {
                    min = in;
                }
            }
            int temp = arrayToSort[out];
            arrayToSort[out] = arrayToSort[min];
            arrayToSort[min] = temp;
        }
        return arrayToSort;
    }

    public static void main(String args[])
    {
        int[] myArray = {1, 4, 5, 2, 3, 0, 0};
        SelectionSort selectionSort = new SelectionSort();
        System.out.print(Arrays.toString(selectionSort.SelectionSort(myArray)));
    }
}
