package imran.learnings.datastructure.queue;

import imran.learnings.datastructure.singlylinkedLists.Node;

/**
 * Demonstrates Queue DS can be implemented as stand alone linked list
 */
public class Queue
{
    private int numberOfItems;         // number of elements on queue
    private Node head;    // beginning of queue
    private Node tail;     // end of queue
    
    /**
     * Create an empty queue.
     */
    public Queue()
    {
        head = null;
        tail = null;
    }

    /**
     * Is the queue empty?
     */
    public boolean isEmpty()
    {
        return head == null;
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
        return head.data;
    }


    /**
     * Add the item to the queue(here everything is added in tail or tail).
     */
    public void enqueue(int intItem)
    {
        Node newLink = new Node(intItem);
        if (isEmpty())
        {
            head = newLink;
            tail = newLink;
        }
        else
        {
            tail.next = newLink;
            tail = newLink;
        }
        numberOfItems++;
    }

    /**
     * Remove and return the item on the queue
     * Throw an exception if the queue is empty.
     */
    public int dequeue()
    {
        if (isEmpty())
            throw new RuntimeException("Queue underflow");
        int temp = head.data;
        head = head.next;
        numberOfItems--;
        if (isEmpty())
            tail = null;   // to avoid loitering
        return temp;
    }

    /**
     * Displays the contents of the list
     */
    public void displayLink()
    {
        Node temp = head;
        while (temp != null) // until end of list,

        {
            temp.displayLink(); // print data
            temp = temp.next; // move to next link
        }
    }

}


