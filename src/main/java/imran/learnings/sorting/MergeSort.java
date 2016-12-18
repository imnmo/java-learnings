package imran.learnings.sorting;

import java.util.Arrays;

/*
* This class demonstrates the merge sort
 */
public class MergeSort
{
    private int[] merge(int[] arrayToMerge, int[] leftArray, int[] rightArray)
    {
        int iLeft = 0;
        int jRight = 0;
        int kArray = 0;

        while (iLeft < leftArray.length - 1 && jRight < rightArray.length - 1)
        {
            if (leftArray[iLeft] <= rightArray[jRight])
            {
                arrayToMerge[kArray] = leftArray[iLeft];
                iLeft++;
            }
            else
            {
                arrayToMerge[kArray] = rightArray[jRight];
                jRight++;
            }
            kArray++;
        }

        while (iLeft < leftArray.length - 1)
        {
            arrayToMerge[kArray] = leftArray[iLeft];
            iLeft++;
            kArray++;
        }
        while (jRight < rightArray.length - 1)
        {
            arrayToMerge[kArray] = rightArray[jRight];
            jRight++;
            kArray++;
        }
        return arrayToMerge;
    }

    public void mergeSort(int[] arrayToSort)
    {
        int size = arrayToSort.length;
        if (size < 2)
            return;
        int mid = size / 2;
        int left[] = new int[mid];
        int right[] = new int[size - left.length];

        System.arraycopy(arrayToSort, 0, left, 0, left.length);
        System.arraycopy(arrayToSort, left.length, right, 0, right.length);
//        for (int i = 0; i < mid; i++)
//            left[i] = arrayToSort[i];
//
//        for (int j = mid; j < size; j++)
//            right[j - mid] = arrayToSort[j];

        mergeSort(left);
        mergeSort(right);
        merge(arrayToSort, left, right);
    }

    public static void main(String args[])
    {
        int[] myArray = {1, 4, 5, 2, 3, 0};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
