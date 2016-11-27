package imran.learnings.datastructure.arrays;

import java.util.Arrays;

/**
 * Created by ${User} on 03.11.2016.
 */
public class MergeTwoSortedArray
{
    public void merge(int A[], int B[], int m, int n)
    {
        while (m > 0 && n > 0)
        {
            if (A[m - 1] > B[n - 1])
            {
                A[m + n - 1] = A[m - 1];
                m--;
            }
            else
            {
                A[m + n - 1] = B[n - 1];
                n--;
            }
        }

        while (n > 0)
        {
            A[m + n - 1] = B[n - 1];
            n--;
        }

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }


    public static void main(String[] args)
    {
        MergeTwoSortedArray myMergeTwoSortedArray = new MergeTwoSortedArray();
        int[] myArray = {1, 5, 7};
        int[] mySArray = {2, 6};
        myMergeTwoSortedArray.merge(myArray, mySArray, myArray.length - 1, mySArray.length - 1);
    }
}
