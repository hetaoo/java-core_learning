package org.javacore.thread.object.synBlock.staticSyn;

/**
 * Created by hetaoo on 2017/4/10.
 */
public class Service {
    synchronized  public static void printA() {
        try {
            System.out.println("Thread name = " + Thread.currentThread().getName() + " 进入printA");
            Thread.sleep(2000);
            System.out.println("Thread name = " + Thread.currentThread().getName() + " 离开printA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized  public static void printB() {
        try {
            System.out.println("Thread name = " + Thread.currentThread().getName() + " 进入printB");
            Thread.sleep(2000);
            System.out.println("Thread name = " + Thread.currentThread().getName() + " 离开printB");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void printC(){
        try {
            System.out.println("Thread name = " + Thread.currentThread().getName() + " 进入printC");
            Thread.sleep(2000);
            System.out.println("Thread name = " + Thread.currentThread().getName() + " 离开printC");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
