package base.classloader;

/**
 * ClassLoader 说明
 */
public class ClassLoaderDemo {
    public static void main(String[] args) {
        // AppClassLoader 只读
        ClassLoader.getSystemClassLoader();
        // ContextClassLoader 可读 可写
        Thread.currentThread().getContextClassLoader();

        // 通过 Thread.currentThread().getContextClassLoader() 可实现类隔离

        // 系统或应用的 ClassLoader 都是 URLClassLoader 的子类
        // static class AppClassLoader extends URLClassLoader
        System.out.println(ClassLoader.getSystemClassLoader());
        System.out.println(Thread.currentThread().getContextClassLoader());
    }
}
