package concurrent;

import java.util.concurrent.TimeUnit;

/**
 * volatile 解决了多线程之间的可见性问题
 * 通过 volatile 编译器级别加了内存屏障 storeload
 * 一个线程的写操作对其它线程的读操作是可见的
 * 满足 happens-before 关系
 */
public class VolatileThreadDemo {

    private static boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while (!stop) {
                System.out.println("VolatileThreadDemo.main");
            }
        });
        t.start();
        TimeUnit.SECONDS.sleep(1);
        stop = true;
    }
}
