package imran.learnings.datastructure.queue;

import imran.learnings.datastructure.singlylinkedLists.Node;

/**
 * Demonstrates Queue DS can be implemented as stand alone linked list
 */
public class Queue
{
    private int numberOfItems;         // number of elements on queue
    private Node first;    // beginning of queue
    private Node last;     // end of queue


    /**
     * Create an empty queue.
     */
    public Queue()
    {
        first = null;
        last = null;
    }

    /**
     * Is the queue empty?
     */
    public boolean isEmpty()
    {
        return first == null;
    }

    /**
     * Return the number of items in the queue.
     */
    public int size()
    {
        return numberOfItems;
    }

    /**
     * Return the item least recently added to the queue.
     * Throw an exception if the queue is empty.
     */
    public int peek()
    {
        if (isEmpty())
            throw new RuntimeException("Queue underflow");
        return first.data;
    }


    /**
     * Add the item to the queue.
     */
    public void enqueue(int intItem)
    {
        Node current = new Node(intItem);
        if (isEmpty())
        {
            first = current;
            last = current;
        }
        else
        {
            last.next = current;
            last = current;
        }
        numberOfItems++;
    }

    /**
     * Remove and return the item on the queue least recently added.
     * Throw an exception if the queue is empty.
     */
    public int dequeue()
    {
        if (isEmpty())
            throw new RuntimeException("Queue underflow");
        int temp = first.data;
        first = first.next;
        numberOfItems--;
        if (isEmpty())
            last = null;   // to avoid loitering
        return temp;
    }

    /**
     * Displays the contents of the list
     */
    public void displayLink()
    {
        Node temp = first;
        while (temp != null) // until end of list,

        {
            temp.displayLink(); // print data
            temp = temp.next; // move to next link
        }
    }

}


