package imran.learnings.datastructures.arrays;

/**
 * Created by Imran on 06.10.2016.
 * <p>
 * A simple array in work
 */
public class SimpleArray
{
    private Object[] myObjectArray = {9, 8, 7};

    private static SimpleArray instance = new SimpleArray();

    public static SimpleArray getInstance()
    {
        return instance;
    }

    /**
     * Print the contents of the array
     */
    public void PrintArrayElements()
    {
        System.out.println(myObjectArray.length);


        for (int i = 0; i <= myObjectArray.length - 1; i++)
        {
            System.out.println(myObjectArray[i]);
        }

    }
}
