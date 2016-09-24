package Threads;

import java.util.Random;

/**
 * Created by root on 9/21/16.
 */
public class Producer implements Runnable {
    private Drops drop;

    public Producer(Drops drops) {
        this.drop = drops;
    }

    @Override
    public void run() {
        String[] TEXT = {"All", "New", "Faded", "For", "Her"};
        Random random = new Random();
        for(int i = 0; i < TEXT.length; i++ ){
            try{
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        drop.put("DONE");
    }
}
