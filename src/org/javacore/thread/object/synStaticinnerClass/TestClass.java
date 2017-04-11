package org.javacore.thread.object.synStaticinnerClass;

/**
 * Created by hetaoo on 2017/4/11.
 */
public class TestClass {
    static class InnerClass1{

        public void method1(InnerClass2 innerClass2){
            String threadName = Thread.currentThread().getName();
            synchronized (innerClass2) {

                System.out.println(threadName + "进入innerClass1类method1方法");
                for (int i=0;i<3;i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(i);
                }
                System.out.println(threadName + "离开innerClass1类method1方法");
            }
        }

        public synchronized void method2() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "进入innerClass1类method2方法");
            for (int i=0;i<3;i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
            System.out.println(threadName + "离开innerClass1类method2方法");
        }
    }

    static class InnerClass2{

         public synchronized void method1(){
             String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "进入innerClass2类method1方法");
            for (int i=0;i<3;i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
            System.out.println(threadName + "离开innerClass2类method1方法");
        }

        public synchronized void method2() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "进入innerClass2类method2方法");
            for (int i=0;i<3;i++) {
                System.out.println(i);
            }
            System.out.println(threadName + "离开innerClass2类method2方法");
        }
    }
}
