package imran.learnings.concurrency;


/**
 * A simple case where a race condition is occuring
 */
class RaceCondition
{

    public static void main(String[] args) throws InterruptedException
    {
        final LongWrapper longWrapper = new LongWrapper(0L);
        Runnable r = new Runnable()
        {
            public void run()
            {

                for (int i = 0; i < 1000; i++)
                {
                    longWrapper.incrementValue();
                }
            }
        };

        /**
         * Create about 1000 thread inside and call the start them to
         * execute the increment value 
         */
        Thread[] threads = new Thread[1000];
        for (int i = 0; i < threads.length; i++)
        {
            threads[i] = new Thread(r);
            threads[i].start();
        }

        /**
         * The join method allows one thread to wait for the completion of another.
         */
        for (int i = 0; i < threads.length; i++)
        {
            threads[i].join();
        }
        //Although the increment value goes upt0 1000 times, here we never see that
        //A classy situation for race condition
        System.out.println("Value = " + longWrapper.getValue());
    }
}
