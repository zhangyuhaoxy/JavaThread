package com.yuhao.diff;

// 通过继承 Thread 类的方式
class NormalThread extends Thread {

    private int counter = 0;

    public void run() {
        counter++;
        System.out.println("NormalThread : Counter : " + counter);
    }

}