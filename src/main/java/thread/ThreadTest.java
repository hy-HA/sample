package thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest implements Runnable {
    public static AtomicInteger num = new AtomicInteger();
    public void run() {
        int t = num.getAndIncrement();
        System.out.println("스레드가 실행됩니다");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new ThreadTest());
        Thread t2 = new Thread(new ThreadTest());
        Thread t3 = new Thread(new ThreadTest());
        Thread t4 = new Thread(new ThreadTest());
        Thread t5 = new Thread(new ThreadTest());
        t.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        Thread.sleep(100);

        System.out.println(num.get());

    }

}
