package com.dizai.thread;

public class SimpleTime {
    public static void main(String[] args) {
        int time=10;
        while (time > 0){
            System.out.println("倒计时:"+time);
            time--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Done!!");
    }
}
