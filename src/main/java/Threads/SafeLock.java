package Threads;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by root on 9/24/16.
 */
public class SafeLock {

    static class Friend {
        private final String name;
        private final Lock lock = new ReentrantLock();

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public boolean impendingBow(Friend bower) {
            Boolean myLock = false;
            Boolean yourLock = false;
            try{
                myLock = lock.tryLock();
                yourLock = bower.lock.tryLock();
            }finally {
                if( ! (myLock && yourLock)) {
                    if(myLock){
                        lock.unlock();
                    }
                    if (yourLock){
                        bower.lock.unlock();
                    }
                }
            }

            return myLock && yourLock;
        }

    }
}
