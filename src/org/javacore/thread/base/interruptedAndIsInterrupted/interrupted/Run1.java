package org.javacore.thread.base.interruptedAndIsInterrupted.interrupted;

/**
 * Created by hetaoo on 2017/3/30.
 * 清楚中断标志
 */
public class Run1 {
    public static void main(String[] args){
        Thread.currentThread().interrupt();
        System.out.println("是否停止1？ = " + Thread.interrupted());
        System.out.println("是否停止2？ = " + Thread.interrupted());
    }
}
