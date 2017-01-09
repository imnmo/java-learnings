package imran.learnings.concurrency;

/**
 * Wrapper for long
 */
public class LongWrapper
{
    private long myLong;
    private final Object key = new Object();

    public LongWrapper(long pLong)
    {

        this.myLong = pLong;
    }

    public long getValue()
    {
        return myLong;

    }

    public void incrementValue()
    {
        /**
         * A synchronized method, to see race condition comment this out 
         */
        synchronized (key)
        {
            myLong++;
        }
    }

}
