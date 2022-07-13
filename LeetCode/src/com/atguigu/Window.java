package com.atguigu;

public class Window {
    public static void main(String[] args) {
        MThread m = new MThread();
        Thread t1 = new Thread(m);
        t1.start();

    }
}
class MThread implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}