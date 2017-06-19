import Threads.*;
import org.junit.Test;

/**
 * Created by root on 9/21/16.
 */
public class ThreadTest {

    @Test
    public void testBasic(){
        new HelloThread().run();
    }

    @Test
    public void sleepTest(){
        new SleepThread().run();
    }

    @Test
    public void testInterrupted(){
        new InterruptThread().run();
    }

    @Test
    public void ProducerConsumerTest(){
        Drops drops = new Drops();
        (new Thread(new Producer(drops))).start();
        (new Thread(new Consumer(drops))).start();
    }


    @Test
    public void basicThreadTest(){


      new HelloThread().run();
    }



}
