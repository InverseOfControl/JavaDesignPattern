package concurrent;

/**
 * join
 * 阻塞主线程，直到子线程运行完毕
 * 通过interrupt中断join，和sleep一样
 */
public class JoinThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();
        Thread t = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("子线程状态" + Thread.currentThread().getState());
                System.out.println("主线程状态" + mainThread.getState());
                Thread.currentThread().interrupt();
            }
        });
        t.start();
        t.join();
        System.out.println("主线程状态" + mainThread.getState());
    }
}
