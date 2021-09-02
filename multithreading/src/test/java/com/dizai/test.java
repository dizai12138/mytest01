package com.dizai;

import com.dizai.thread.MyThread;

public class test {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread=new MyThread();
        System.out.println("main begin"+thread.isAlive());
        thread.start();
        Thread.sleep(100);
        System.out.println("main end"+thread.isAlive());
    }
}
