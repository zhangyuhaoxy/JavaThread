package com.yuhao.thread;

public class HelloThread extends Thread {

    private String name;

    public HelloThread() {
    }

    public HelloThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " print " + i + " times");
        }
    }

    public static void main(String[] args) {
        HelloThread helloThread1 = new HelloThread("A");
        HelloThread helloThread2 = new HelloThread("B");
        helloThread1.run();
        helloThread2.run();
    }

}
