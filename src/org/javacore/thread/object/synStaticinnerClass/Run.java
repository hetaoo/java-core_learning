package org.javacore.thread.object.synStaticinnerClass;

import org.javacore.thread.object.synStaticinnerClass.TestClass.InnerClass1;
import org.javacore.thread.object.synStaticinnerClass.TestClass.InnerClass2;
/**
 * Created by hetaoo on 2017/4/11.
 */
public class Run  {
    public static void main(String[] args) {
        final InnerClass1 innerClass1 = new InnerClass1();
        final InnerClass2 innerClass2 = new InnerClass2();
        final InnerClass2 innerClass3 = new InnerClass2();

       Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass1.method1(innerClass2);
            }
        },"T");

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass1.method2();
            }
        },"T1");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass2.method1();
            }
        },"T2");

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass3.method2();
            }
        },"T3");

//        thread.start();
//        thread1.start();
        thread2.start();
        thread3.start();
    }
}
