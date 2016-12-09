package imran.learnings.collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo
{

    public void putAndPrintValuesInQueue()
    {
        Queue<Integer> queue = new LinkedList<>();
        //FIFO

        queue.add(1);
        queue.add(3);
        queue.add(900);

        queue.remove();
        for (Integer e : queue)
        {
            System.out.println(e);
        }

        System.out.println(queue.peek());

    }


    public void putAndPrintValuesInDeQueue()
    {
        Deque<Integer> dequeue = new LinkedList<>();
        //LIFO or FIFO
        dequeue.addLast(96);
        dequeue.addFirst(106);
        dequeue.addLast(56);

        dequeue.removeLast();

        for (Integer e : dequeue)
        {
            System.out.println(e);
        }

    }

    public void putAndPrintValuesInPrioityQueue()
    {
        Queue<Integer> pQueue = new PriorityQueue<>();
        //Min heap property is maintained
        //The head of this queue is the least element with respect to the specified ordering

        pQueue.add(100);
        pQueue.add(50);
        pQueue.add(200);

        for (Integer e : pQueue)
        {
            System.out.println(e);
        }
    }

}
