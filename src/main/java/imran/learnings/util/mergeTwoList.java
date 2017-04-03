package imran.learnings.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by imran on 13.02.2017.
 */
public class MergeTwoList
{
    public List<Integer> merge(List<Integer> leftList, List<Integer> rightList)
    {
        int iLeft = 0;
        int jRight = 0;

        List<Integer> myMergedList = new ArrayList<>();
        while (iLeft < leftList.size() && jRight < rightList.size())
        {
            if (leftList.get(iLeft) <= rightList.get(jRight))
            {
                myMergedList.add(leftList.get(iLeft));

                iLeft++;
            }
            else
            {
                myMergedList.add(rightList.get(jRight));
                jRight++;
            }
        }

        while (iLeft < leftList.size())
        {
            myMergedList.add(leftList.get(iLeft));
            iLeft++;
        }
        while (jRight < rightList.size())
        {
            myMergedList.add(rightList.get(jRight));
            jRight++;
        }
        return myMergedList;
    }


    public static void main(String args[])
    {
        List<Integer> myLeftList = new ArrayList<>();
        List<Integer> myRightList = new ArrayList<>();
        myLeftList.add(0);
        myLeftList.add(1);
        myLeftList.add(4);
        myLeftList.add(5);

        myRightList.add(2);
        myRightList.add(3);

        MergeTwoList myMergeTwoList = new MergeTwoList();
        System.out.println(Arrays.asList(myMergeTwoList.merge(myLeftList, myRightList)));
    }
}
