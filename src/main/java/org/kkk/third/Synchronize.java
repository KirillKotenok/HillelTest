package org.kkk.third;

import java.util.concurrent.locks.ReentrantLock;

public class Synchronize {
    private int val = 0;
    private final Object lock = new Object();
    private final ReentrantLock reentrantLock = new ReentrantLock();


    public synchronized void firstWay() {
        this.val++;
    }

    public void secondWay() {
        synchronized (lock) {
            val++;
        }
    }

    public void thirdWay() {
        reentrantLock.lock();
        try {
            this.val++;
        } finally {
            reentrantLock.unlock();
        }
    }
}
