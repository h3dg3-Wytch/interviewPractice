package Threads;

/**
 * Created by root on 9/21/16.
 */
public class MsLunch {
    //The snychronized merhod creates a lock that blocks other threads from
    //using it

    //reads nad writes are amotic for variables and for primitices (minus long and double)
    //reads for atomic and for all variables declared
    private long c1 = 0;
    private long c2 = 0;
    private Object lock1 = new Object();
    private Object lock2 = new Object();


    //Using objects for locks allows other threads to interleave
    public void inc1(){
        synchronized (lock1){
            c1++;

        }
    }
    public void inc2(){
        synchronized (lock2){
            c2++;

        }
    }
}
