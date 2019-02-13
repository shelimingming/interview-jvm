package com.sheliming.jvm.classloader;

/**
 * sun.misc.Launcher$AppClassLoader@18b4aac2
 * sun.misc.Launcher$ExtClassLoader@1b6d3586
 * null
 * <p>
 * 没有获取到ExtClassLoader的父Loader，原因是Bootstrap Loader（引导类加载器）
 * 是用C语言实现的，找不到一个确定的返回父Loader的方式，于是就返回null。
 * <p>
 * 启动类加载器：Bootstrap ClassLoader，
 * 负责加载存放在JDK\jre\lib(JDK代表JDK的安装目录，下同)下，或被-Xbootclasspath参数指定的路径中的，
 * 并且能被虚拟机识别的类库（如rt.jar，所有的java.*开头的类均被Bootstrap ClassLoader加载）。
 * 启动类加载器是无法被Java程序直接引用的。
 * <p>
 * 扩展类加载器：Extension ClassLoader，
 * 该加载器由sun.misc.Launcher$ExtClassLoader实现，它负责加载DK\jre\lib\ext目录中，
 * 或者由java.ext.dirs系统变量指定的路径中的所有类库（如javax.*开头的类），
 * 开发者可以直接使用扩展类加载器。
 * <p>
 * 应用程序类加载器：Application ClassLoader，
 * 该类加载器由sun.misc.Launcher$AppClassLoader来实现，
 * 它负责加载用户类路径（ClassPath）所指定的类，开发者可以直接使用该类加载器，
 * 如果应用程序中没有自定义过自己的类加载器，一般情况下这个就是程序中默认的类加载器。
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println(loader);
        System.out.println(loader.getParent());
        System.out.println(loader.getParent().getParent());
    }
}
