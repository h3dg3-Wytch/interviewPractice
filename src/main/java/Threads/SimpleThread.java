package Threads;

/**
 * Created by root on 9/21/16.
 */
public class SimpleThread {

    // Display a message, preceded by
    // the name of the current thread
    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n", threadName, message);
    }

    private static class MessageLoop implements Runnable{

        private final static String[] TEXT = {"I", "slept", "in", "dreamless", "sleep"};

        @Override
        public void run() {
            try {
                for(int i = 0; i < TEXT.length; i++){
                    Thread.sleep(4000);
                    threadMessage(TEXT[i]);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
            // Delay, in milliseconds before
            // we interrupt MessageLoop
            // thread (default one hour).
            long patience = 1000 * 60 * 60;

            // If command line argument
            // present, gives patience
            // in seconds.
            if (args.length > 0) {
                try {
                    patience = Long.parseLong(args[0]) * 1000;
                } catch (NumberFormatException e) {
                    System.err.println("Argument must be an integer.");
                    System.exit(1);
                }
            }
            threadMessage("Starting the Message Loop");
            long startTime = System.currentTimeMillis();
            Thread t = new Thread( new MessageLoop());
            t.start();
            threadMessage("Waiting for the MessageLoop thread to finish");
            while(t.isAlive()) {
                threadMessage("Still waiting...");
                t.join(1000);
                if((System.currentTimeMillis() - startTime) > patience && t.isAlive()){
                    threadMessage("Tired of this, TERMINATING PROCESS");
                    t.interrupt();
                    t.join();

                }
            }
            threadMessage("finally!");
    }

}
