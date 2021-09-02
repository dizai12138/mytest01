package com.dizai.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        Prive prive=new Prive();
        Wread w1=new Wread(prive);
        w1.start();
        Thread.sleep(300);
        prive.getzong();

    }
    static class Wread extends Thread{
        Prive prive=new Prive();
        public Wread(Prive prive){
            this.prive=prive;
        }
        @Override
        public void run() {
            prive.setzong("lisi",19);
        }
    }

    static class Prive{
        private String name="zhangsan";
        private int  age=18;
        public void getzong(){
            System.out.println(Thread.currentThread().getName()+", get-name="+name+",get-age="+age);
        }
        public void setzong(String name,int age){
            System.out.println(Thread.currentThread().getName()+", set-name="+name+",set-age="+age);
        }
    }

}
