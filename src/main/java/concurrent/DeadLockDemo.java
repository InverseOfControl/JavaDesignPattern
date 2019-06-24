package concurrent;

/**
 * 死锁 两个线程互相等待对方释放锁
 */
public class DeadLockDemo {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) {

        new Thread(() -> {
            synchronized (lock1) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("t1->lock2");
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (lock2) {
                synchronized (lock1){
                    System.out.println("t2->lock2");
                }
            }
        }).start();
    }
}
