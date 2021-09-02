package com.dizai.thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("子线程："+this.isAlive());
    }
}
