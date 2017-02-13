package imran.learnings.datastructure.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Imran on 06.10.2016.
 */
public class ArrayDriver
{

    public static void main(String... args)
    {
//        SimpleArray mySimpleArray = SimpleArray.getInstance();
//        mySimpleArray.PrintArrayElements();


        List<String> myList = new ArrayList<>();


        List<Integer> myList2 = new ArrayList<>();


        Integer myBoxedIntger = 18;

        int myUnboxed = 1;
        myBoxedIntger = myUnboxed;

        myUnboxed = myBoxedIntger;


        myList = Arrays.asList("one", "two");

        myList.add("three");
        myList.add("three");
        myList.remove(0);
        System.out.println(myList);


    }

}

