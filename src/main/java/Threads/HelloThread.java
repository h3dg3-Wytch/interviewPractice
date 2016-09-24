package Threads;

/**
 * Created by root on 9/21/16.
 */
public class HelloThread extends Thread {

    private final static String[] TEXT = {"This", "is", "it"};

    @Override
    public void run() {
        super.run();
        System.out.println("Hello, Night!");
    }

}
