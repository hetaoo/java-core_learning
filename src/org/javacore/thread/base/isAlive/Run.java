package org.javacore.thread.base.isAlive;

/**
 * Created by hetaoo on 2017/3/29.
 */
public class Run {
    public static void main(String[] args){
        CountOperate countOperate = new CountOperate();
        Thread thread = new Thread(countOperate);
        System.out.println("main begin thread isAlive=" + thread.isAlive());
        thread.start();
        System.out.println("main end thread isAlive=" + thread.isAlive());
    }
}
