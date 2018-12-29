package java8;

import java.util.concurrent.CompletableFuture;

import static java.lang.Thread.sleep;

public class MyCompleteFuture {

    private static String fun1() {
        try {
            sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "fun1";
    }

    private static String fun2() {
        try {
            sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "fun2";
    }

    private static String fun3() {
        try {
            sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "fun3";
    }


    private static void test() {
        long startTime = System.currentTimeMillis();
        String s1 = fun1();
        String s2 = fun2();
        String s3 = fun3();
        System.out.println(Thread.currentThread().getName() + "线程耗时：" + (System.currentTimeMillis() - startTime));
        System.out.println(s1 + s2 + s3);
    }

    private static void testCompletableFuture() {
        long startTime = System.currentTimeMillis();
        CompletableFuture cf1 = CompletableFuture.supplyAsync(MyCompleteFuture::fun1);
        CompletableFuture cf2 = CompletableFuture.supplyAsync(MyCompleteFuture::fun2);
        CompletableFuture cf3 = CompletableFuture.supplyAsync(MyCompleteFuture::fun3);
        String result = (String) cf1.thenCombine(cf2, (s1, s2) -> s1 + "" + s2).thenCombine(cf3, (s1, s2) -> s1 + "" + s2).join();

        System.out.println(Thread.currentThread().getName()+"线程耗时："+(System.currentTimeMillis() - startTime));
        System.out.println(result);
    }

    public static void main(String[] args) {
        //MyCompleteFuture.test();
        MyCompleteFuture.testCompletableFuture();
    }
}
