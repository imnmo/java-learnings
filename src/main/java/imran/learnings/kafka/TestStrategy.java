package imran.learnings.kafka;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ${User} on 09.02.2017.
 */
public class TestStrategy
{


    public void TestMethod(int pass)
    {

        throw new RuntimeException();

    }


    public static void main(String... args)
    {
        TestStrategy testStrategy = new TestStrategy();
        List<Integer> myMergedList = new ArrayList<>();

        myMergedList.add(1);
        myMergedList.add(2);
        myMergedList.add(3);

        System.out.println(myMergedList.size());
        System.out.println(myMergedList.size() - 1);


//        Comparator<Integer> myIntgerComparator;
//        myIntgerComparator.compare(myMergedList, myMergedList);


    }
}

