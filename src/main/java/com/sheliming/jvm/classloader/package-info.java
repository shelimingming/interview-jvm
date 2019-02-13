package com.sheliming.jvm.classloader;
/**
 * 类的加载指的是将类的.class文件中的二进制数据读入到内存中，将其放在运行时数据区的方法区内，
 * 然后在堆区创建一个java.lang.Class对象，用来封装类在方法区内的数据结构。
 * 类的加载的最终产品是位于堆区中的Class对象，Class对象封装了类在方法区内的数据结构，
 * 并且向Java程序员提供了访问方法区内的数据结构的接口。
 **/