package base.classloader;

import java.net.URL;

/**
 * ClassPath 和 ClassLaoder 的关系
 */
public class ClassPathAndClassLoaderDemo {
    public static void main(String[] args) {
        // 通过在设置 VM 参数 -verbose:class 显示加载的 ClassPath

        // 通过以下代码获取 ClassPath，可以看出 ClassPath 跟 URL 是有关系的
        // 看 URL#openConnection() 通过不同 handler 打开不同的 connection 去获取分布在不同地方的资源
        URL url = ClassPathAndClassLoaderDemo.class.getProtectionDomain().getCodeSource().getLocation();
        System.out.printf(url.getPath());
    }
}
