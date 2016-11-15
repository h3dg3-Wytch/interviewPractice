package Threads;

/**
 * Created by root on 9/21/16.
 */
//Gaurded block, polling a condition that must be true before the block
    //can proceed
public class Drops {

    //loop until the shared variable has been set by another thread
//    public void guardedJoy() {
//        // Simple loop guard. Wastes
//        // processor time. Don't do this!
//        while(!joy) {}
//        System.out.println("Joy has been achieved!");
//    }
    //Use object.wait to suspend, it won't return until another thread has issued a notifcation
//    public synchronized void guardedJoy() {
//        // This guard only loops once for each special event, which may not
//        // be the event we're waiting for.
//        while(!joy) {
//            try {
//                wait();
//            } catch (InterruptedException e) {}
//        }
//        System.out.println("Joy and efficiency have been achieved!");
//    }
    //Always invoke wait inside a loop that test for the condition being waited for.

    //invokes that the wait is over
//    public synchronized notifyJoy() {
//        joy = true;
//        notifyAll();
//    }

    // Message sent from producer
    // to consumer.
    private String message;
    // True if consumer should wait
    // for producer to send message,
    // false if producer should wait for
    // consumer to retrieve message.
    private boolean empty = true;

    public synchronized String take(){
        //Wait until message is avaible
        while (empty){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //toggle status
        empty = true;
        // Notify producer that
        // status has changed.
        notifyAll();
        return message;
    }

    public synchronized void put(String message){
        //Wait until message has been retrieved
        while(!empty){
            try{
                wait();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Toggle status.
        empty = false;
        // Store message.
        this.message = message;
        // Notify consumer that status
        // has changed.
        notifyAll();
    }


}
