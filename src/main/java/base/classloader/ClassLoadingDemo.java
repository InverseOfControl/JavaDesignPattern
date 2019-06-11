package base.classloader;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ClassLoadingDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        String className = "base.classloader.Person";
        String classPath = System.getProperty("user.dir") + "/target/classes/" + className.replace(".", "/").concat(".class");
        File file = new File(classPath);

        // 当前 main 线程的 ClassLoader
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class clazzFromClassLoader = classLoader.loadClass(className);

        // 自定义的 MyClassLoader
        MyClassLoader myClassLoader = new MyClassLoader();
        Class clazzFromMyClassLoader = myClassLoader.defineClass(className, file);
        System.out.println("clazzFromClassLoader == clazzFromMyClassLoader ? " +
                (clazzFromClassLoader == clazzFromMyClassLoader));

        // 切换 main 线程的 ClassLoader 为 MyClassLoader
        Thread.currentThread().setContextClassLoader(myClassLoader);
        Class clazzFromChangeMyClassLoader = classLoader.loadClass(className);
        System.out.println("clazzFromMyClassLoader == clazzFromChangeMyClassLoader ? " +
                (clazzFromMyClassLoader == clazzFromChangeMyClassLoader));

        // 双亲委派 父 ClassLoader 加载了， 子 ClassLoader 不需要重复加载
        System.out.println("clazzFromClassLoader == clazzFromNewMyClassLoader ? " +
                (clazzFromClassLoader == clazzFromChangeMyClassLoader));

    }

    static class MyClassLoader extends ClassLoader {

        public MyClassLoader() {
            super(Thread.currentThread().getContextClassLoader());
        }


        public final Class<?> defineClass(String name, File file) {
            Class<?> clazz = null;
            try {
                byte[] bytes = FileUtils.readFileToByteArray(file);
                clazz = super.defineClass(name, bytes, 0, bytes.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return clazz;
        }
    }
}

class Person {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
