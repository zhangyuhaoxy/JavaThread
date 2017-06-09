package com.yuhao.thread;

class MyThread extends Thread {
    private int ticket = 5;

    String s;
    int i;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public MyThread(String s, int i) {
        setS(s);
        setI(i);
    }

    public void run() {
        System.out.println("i = " + i);
        System.out.println("s = " + s);

        for (int i = 0; i < 10; i++) {
            if (ticket > 0) {
                System.out.println("ticket = " + ticket--);
            }
        }
    }
}
