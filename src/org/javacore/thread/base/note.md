多线程笔记
--------
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
> this.interrupted(): 测试当前线程是否已经中断
>
> this.isInterrupted(): 测试线程是否已经中断
