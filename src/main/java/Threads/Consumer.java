package Threads;

import java.util.Random;

/**
 * Created by root on 9/24/16.
 */
public class Consumer implements Runnable {

    private Drops drop;

    public Consumer(Drops drop) {
        this.drop = drop;
    }

    @Override
    public void run() {
        Random random = new Random();
        for(String message = drop.take(); !message.equals("DONE"); message = drop.take()){
            System.out.format("MESSAGE RECEIVED: %s%n", message);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {}

        }

    }
}
