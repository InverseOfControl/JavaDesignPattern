package concurrent;


import java.util.ArrayList;
import java.util.List;

/**
 * 线程生命周期：{@link Thread.State}
 */
public class ProducerConsumerThreadDemo {

    private static List<Integer> list = new ArrayList<>();
    private static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadDemo1(lock, list));
        t1.start();

        Thread t2 = new Thread(new ThreadDemo2(lock, list));
        t2.start();
    }
}

class ThreadDemo1 implements Runnable {
    private final Object lock;
    private final List<Integer> list;

    public ThreadDemo1(Object lock, List<Integer> list) {
        this.lock = lock;
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (lock) {
            int i = 0;
            while (true) {
                if (list.size() == 3) {
                    try {
                        i = 0;
                        lock.notifyAll();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    list.add(++i);
                    System.out.println("生产：" + i);
                }
            }
        }
    }
}

class ThreadDemo2 implements Runnable {
    private final Object lock;
    private final List<Integer> list;

    public ThreadDemo2(Object lock, List<Integer> list) {
        this.lock = lock;
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (lock) {
            while (true) {
                if (list.size() == 0) {
                    try {
                        lock.notifyAll();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("消费：" + list.get(0));
                    list.remove(0);
                }
            }
        }
    }
}
