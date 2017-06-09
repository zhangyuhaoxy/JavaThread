package com.yuhao.diff;

// 通过继承 Thread 类的方式
class StaticVariableThread extends Thread {

    private static int counter = 0;

    public void run() {
        counter++;
        System.out.println("StaticVariableThread : Counter : " + counter);
    }

}