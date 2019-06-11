package base.classloader;

/**
 * Class 和 ClassLoader 关系
 */
public class ClassAndClassLoaderDemo {
    public static void main(String[] args) {
        // Object 是被 Bootstrap ClassLoader 加载，在 Java 中表现为 null
        getClassLoader(Object.class);
        // 原生类型是被 Bootstrap ClassLoader 加载，在 Java 中表现为 null
        getClassLoader(int.class);
        // 类对象是被 SystemClassLoader 加载的
        getClassLoader(ClassAndClassLoaderDemo.class);

        // 加载类对象的 ClassLoader 和 系统的 ClassLoader 同一个 ClassLoader
        System.out.println(ClassAndClassLoaderDemo.class.getClassLoader() == ClassLoader.getSystemClassLoader());
    }

    private static void getClassLoader(Class clazz){
        System.out.printf("类 %s 被 %s 加载\n",clazz,clazz.getClassLoader());
    }
}
