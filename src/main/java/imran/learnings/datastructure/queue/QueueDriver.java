package imran.learnings.datastructure.queue;

/**
 * Driver application for the queue
 */
public class QueueDriver
{
    public static void main(String[] args)
    {
        Queue theQueue = new Queue(); // make new list
        theQueue.enqueue(22); // insert four items
        theQueue.enqueue(44);
        theQueue.enqueue(66);
        theQueue.dequeue();
        theQueue.displayLink(); // display list

    }

}
