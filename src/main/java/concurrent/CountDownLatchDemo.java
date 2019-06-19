package concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; ++i) {
            executorService.execute(new MyWork(countDownLatch, i));
        }

        // 主线程阻塞，等待线程池中的所有任务执行完毕
        countDownLatch.await();

        // 关闭线程池
        executorService.shutdown();
    }

    static class MyWork implements Runnable {
        private final CountDownLatch doneSignal;
        private final int i;

        public MyWork(CountDownLatch doneSignal, int i) {
            this.doneSignal = doneSignal;
            this.i = i;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.printf("%s\n", Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
