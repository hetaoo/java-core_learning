package org.javacore.thread.object.dirtyRead;

/**
 * Created by hetaoo on 2017/4/10.
 */
public class ThreadA extends Thread {
    private PublicVar publicVar;
    public ThreadA(PublicVar publicVar) {
        this.publicVar = publicVar;
    }

    public void run(){
        publicVar.setValue("B","BB");
    }
}
