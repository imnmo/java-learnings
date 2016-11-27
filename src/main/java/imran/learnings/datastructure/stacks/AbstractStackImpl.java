package imran.learnings.datastructure.stacks;

/**
 * Generic parametrized stack implementation of the stack using the
 * <p>
 * For test now its with the String based implementation
 * kind of bare bone with no JavaDocs
 * This class has implements Iterable interface
 */
//TODO the pop with loitering and GC stuff na
@SuppressWarnings("hiding")
public class AbstractStackImpl<E>
{

    protected E[] elements;
    protected int size = 0;

    public AbstractStackImpl(int stackCapacity)
    {
        elements = (E[]) new Object[stackCapacity];
    }

    public void pushElements(E pitem)
    {
        if (isFull())
        {
            //do stack resizing
            resize(4 * elements.length);
        }
        elements[size++] = pitem;
    }

    public E popElements()
    {
        if (isEmpty())
        {
            throw new RuntimeException("Stack underflow dude!! ");
        }
        E temp = (E) elements[--size];
        elements[size] = null;
        return temp;
    }

    public Boolean isEmpty()
    {
        if (size == 0)
            return true;
        return false;
    }

    public void displayElements()
    {
    }


    public E peekElements()
    {
        int maximumStackValue = elements.length;
        return (E) elements[maximumStackValue];
    }

    public Boolean isFull()
    {
        if (elements.length == size)
            return true;
        return false;
    }

    /**
     * returns the size of the stack
     */

    public int sizeOfStack()
    {
        return size;
    }

    /**
     * Resizes the Array to use for extended length
     */
    public void resize(int maximumReSizeValue)
    {
        //Allocate a new array and copy the contents to new temp
        //array
        E[] temp = (E[]) new Object[maximumReSizeValue];
        for (int i = 0; i < size; i++)
        {
            temp[i] = elements[i];
        }
        //put back the reference to myStack itself
        elements = temp;
    }

}
