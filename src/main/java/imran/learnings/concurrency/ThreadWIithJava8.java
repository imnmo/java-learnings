package imran.learnings.concurrency;

/**
 * Created by enomoha on 14.05.2017.
 */
public class ThreadWIithJava8
{

    /*
    static class MyThreadFactory implements ThreadFactory
    {
        static AtomicInteger counter = new AtomicInteger();

        @Override
        public Thread newThread(Runnable r) {
            String name = "MyThread-" + counter.getAndIncrement();
            Thread t = new Thread(r, name);
            return t;
        }
    }

    public static void main(String[] args) throws Exception {
        new ThreadDemo2().runThreads();
    }

    public void runThreads() throws Exception {

        // Create a Thread using a method reference and start it
        // Thread t = new Thread(this::doTheTask);
        // t.start();

        // Delegate creation and start of threads to an executor
        ExecutorService executor = Executors.newFixedThreadPool(3, new MyThreadFactory());

        // submit Runnables or Callables to the executor
        Future<?> future1 = executor.submit(this::doTheTask);
        Future<String> future2 = executor.submit(this::doTheTaskWithResult);
        Future<?> future3 = executor.submit(this::doTheTask);

        System.out.println("Is task 1 finished? " + future1.isDone());

        // get(...) is a blocking call trying to retrieve a result
        // future1.get(100, TimeUnit.MILLISECONDS);
        // System.out.println("Is task 1 finished? " + future1.isDone());

        // next line would cancel task2
        // future2.cancel(true);

        executor.shutdown();

        // Once shutdown() has been called, we cannot submit more tasks
        // to the executor => next line will result in an exception
        // executor.submit(this::doTheTask);

        executor.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("Result of task2: " + future2.get());
        System.out.println("Done");
    }

    // this method implicitly implements Runnable

    public void doTheTask() {
        IntStream.range(1, 100)
                .forEach(i -> System.out.println(Thread.currentThread().getName() + " " + i));
        System.out.println();
    }

    // this method implicitly implements Callable
    public String doTheTaskWithResult() {
        this.doTheTask();
        return "Finished";
    }
    */
}

