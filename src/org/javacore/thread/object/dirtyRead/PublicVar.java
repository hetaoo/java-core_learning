package org.javacore.thread.object.dirtyRead;

/**
 * Created by hetaoo on 2017/4/10.
 */
public class PublicVar {
    public String username = "A";
    public String password = "AA";

    synchronized public void setValue(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method thread name = " + Thread.currentThread().getName() + " username = " + username +
            " password = "+ password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //未加synchronized 会出现脏读
   synchronized public void getValue() {
        System.out.println("setValue method thread name = " + Thread.currentThread().getName() + " username = " + username +
                " password = "+ password);
    }
}
