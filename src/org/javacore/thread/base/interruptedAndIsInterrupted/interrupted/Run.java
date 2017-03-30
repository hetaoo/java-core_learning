package org.javacore.thread.base.interruptedAndIsInterrupted.interrupted;

/**
 * Created by hetaoo on 2017/3/30.
 * 检测“当前线程”的中断状态
 */
public class Run {
    public static void main(String[] args){
        try {
            Mythread mythread = new Mythread();
            Thread t = new Thread(mythread);
            t.start();
            Thread.sleep(1000);
            t.interrupt();
            System.out.println("当前线程为：" + Thread.currentThread().getName());
            System.out.println("是否停止1？ = " + t.interrupted());
            System.out.println("是否停止2？ = " + t.interrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
