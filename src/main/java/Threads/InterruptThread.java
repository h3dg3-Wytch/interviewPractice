package Threads;

/**
 * Created by root on 9/21/16.
 */
public class InterruptThread extends Thread {

    private final static String[] TEXT = {"I", "slept", "in", "dreamless", "sleep"};

    @Override
    public void run() {
        super.run();

        for(int i = 0 ; i < TEXT.length; i++){
            try {
                sleep(400);
                if(Thread.interrupted() || i == 3)
                    throw new InterruptedException();
                System.out.println(TEXT[i]);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Something is wrong, we must cease this process");
                return;
            }
            System.out.println();
        }
    }
}
