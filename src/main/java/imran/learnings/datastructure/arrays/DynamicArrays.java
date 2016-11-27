package imran.learnings.datastructure.arrays;

/**
 * Created by Imran on 10.10.2016.
 */
public class DynamicArrays
{
    private int size;
    private Object[] data; //The dynamic array

    private boolean isFull()
    {
        if (data.length == size)
        {
            return true;
        }
        return false;
    }

    public void append(Object pObject)
    {
        if (isFull())
        {

        }

    }

    public void append(Object pObject, int pIndex)
    {
    }

}
