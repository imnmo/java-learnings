package imran.learnings.concurrency;

/**
 * Demonstrates the simple thread using runnable
 */
public class RunnableImpl
{
    public static void main(String args[])
    {
        Runnable runnable = new Runnable()
        {
            public void run()
            {
                String name = Thread.currentThread().getName();
                System.out.println("I am running in thread " + name);
            }
        };


        Thread thread = new Thread(runnable);
        thread.setName("Thread 1");
        thread.start();
//        thread.run();// Should never be used
    }

}
