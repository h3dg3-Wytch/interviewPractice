package Threads;

/**
 * Created by root on 9/21/16.
 */
public class SleepThread extends Thread{

    private final static String[] TEXT = {"I", "slept", "in", "dreamless", "sleep"};

    @Override
    public void run() {
        super.run();
        for(int i  = 0; i < TEXT.length; i++){
            try {
                Thread.sleep(4000);
                System.out.println(TEXT[i]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
