package com.yuhao.diff;

class ImplementsRunnable implements Runnable {

    private int counter = 0;

    public void run() {
        while (counter < 10) {
            synchronized (this) {
                counter++;
                System.out.println("ImplementsRunnable : Counter : " + counter);
            }
        }
    }
}