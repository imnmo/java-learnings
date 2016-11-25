package imran.learnings.excercises;

import java.util.LinkedList;
import java.util.List;

public class MaximumFinderTester
{


    public static void main(String[] args)
    {

        MaximumFinder myMaximumFinder = new MaximumFinder();
        // ArrayList version
//        List<Integer> myList = new ArrayList<Integer>();
        //LinkedList
        List<Integer> myList = new LinkedList<Integer>();

        myList.add(1);
        myList.add(100);
        myList.add(156);
        myList.add(1000);
        myList.add(159);
        myList.add(100);

        myMaximumFinder.maxFinder(myList);

    }
}
