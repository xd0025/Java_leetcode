package com.atguigu;


/**
  *
  * @param
  * @return
  * @author xuda
  * @creed: Talk is cheap,show me the code
  * @date
  */


public class ThredDemo {
    public static void main(String[] args) {
        MyThread1 m1 =  new MyThread1();
        MyThread2 m2 =  new MyThread2();
        m1.start();
        m2.start();
        //创建Thread类的匿名子类的方式
        /**
         new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();
         */
    }
}
class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}