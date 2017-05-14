package imran.learnings.concurrency;
public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo demo = new ThreadDemo();
        // demo.createThreadUsingRunnable();
        demo.createThreadUsingCustomThreadClass();
    }


    /**
     *
     */
    public void createThreadUsingRunnable() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 180; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        System.out.println("interrupted");
                        cleanup();
                        break;
                    }
                }
            }

            public void cleanup() {
                System.out.println("cleaning up");
            }
        };

        Thread t = new Thread(r);
        t.start();
        t.interrupt();
    }



    public void createThreadUsingCustomThreadClass() {
        MyThread t = new MyThread("MyDemoThread");
        t.start();
        // t.requestInterrupt();

        System.out.println("Done");
    }


    class MyThread extends Thread {

        boolean interruptRequested;

        public MyThread(String name) {
            super(name);
        }

        public void requestInterrupt() {
            interruptRequested = true;
        }

        @Override
        public void run() {
            for (int i = 0; i <= 180; i++) {
                System.out.println(i);
                this.setName("MyThread->" + i);
                try {
                    Thread.sleep(1000);

                    if (interruptRequested) {
                        cleanup();
                        break;
                    }

                } catch (InterruptedException e) {
                    System.out.println("interrupted");
                    cleanup();
                    break;
                }
            }
        }

        public void cleanup() {
            System.out.println("cleaning up");
        }
    }
}
