多线程笔记
---------------
* currentThread()方法
 >  Thread.currentThread().getName()与this.getName()区别
 >
 >  this 指的是当前线程
 >
 >  Thread.currentThread() 指得到的当前线程

* isAlive()方法
> 方法isAlive()的作用是测试线程是否处于活动状态。活动状态就是线程已经启动且尚未终止。线程处于正在运行或准备开始运行的状态，就认为线程是存活的。

* sleep()方法
> sleep()指毫秒数内让当前“正在执行的线程”休眠（暂停执行）。这个“正在执行的线程”是指this.currentThread()返回的线程。

* interrupted() 和 isInterrupted() 区别
> this.interrupted(): 用来检测“当前线程”的中断状态，且会将中断状态标志清除。
>
> this.isInterrupted(): 用来检测“this”的中断状态，且不会改变线程的状态标志。


