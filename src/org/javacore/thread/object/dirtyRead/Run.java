package org.javacore.thread.object.dirtyRead;

/**
 * Created by hetaoo on 2017/4/10.
 */
public class Run {
    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
            ThreadA threadA = new ThreadA(publicVar);
            threadA.start();
            Thread.sleep(200);
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
