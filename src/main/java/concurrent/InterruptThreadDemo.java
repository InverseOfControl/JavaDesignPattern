package concurrent;

/**
 * interrupt 线程中断
 */
public class InterruptThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            int i = 0;
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println(i);
            }
            System.out.println(Thread.currentThread().isInterrupted());
            // 恢复中断线程
            Thread.interrupted();
            System.out.println(Thread.currentThread().isInterrupted());
        });
        t.start();
        Thread.sleep(1000);
        // 中断t线程
        t.interrupt();
    }
}
