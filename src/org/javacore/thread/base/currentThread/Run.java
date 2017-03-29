package org.javacore.thread.base.currentThread;

/**
 * Created by hetaoo on 2017/3/29.
 */
public class Run {
    public static void main(String[] args){
        CountOperate countOperate = new CountOperate();
        countOperate.setName("A");
        countOperate.start();
    }
}
