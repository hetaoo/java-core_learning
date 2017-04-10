package org.javacore.thread.object.synLockIn.synLockIn1;

/**
 * Created by hetaoo on 2017/4/10.
 */
public class Service {
    synchronized public void service1(){
        System.out.println("service1");
        service2();
    }

    synchronized  public void service2() {
        System.out.println("service2");
        service3();
    }

    synchronized public void service3() {
        System.out.println("service3");
    }
}
