package com.yuhao.diff;

class Diff {

    public static void main(String args[]) throws Exception {
        // 多线程共享同一个变量（rc）
        ImplementsRunnable rc = new ImplementsRunnable();
        Thread t1 = new Thread(rc);
        t1.start();
        Thread.sleep(1000); // 启动下一个线程前，等待一秒钟
        Thread t2 = new Thread(rc);
        t2.start();
        Thread.sleep(1000); // 启动下一个线程前，等待一秒钟
        Thread t3 = new Thread(rc);
        t3.start();

        // 通过normal Thread只能为每一个线程创建新的对象
        NormalThread tc1 = new NormalThread();
        tc1.start();
        Thread.sleep(1000);
        NormalThread tc2 = new NormalThread();
        tc2.start();
        Thread.sleep(1000);
        NormalThread tc3 = new NormalThread();
        tc3.start();

        // 通过StaticVariable Thread只能为每一个线程创建新的对象 但是是static的 (输出结果同runnable)
        StaticVariableThread sv1 = new StaticVariableThread();
        sv1.start();
        Thread.sleep(1000);
        StaticVariableThread sv2 = new StaticVariableThread();
        sv2.start();
        Thread.sleep(1000);
        StaticVariableThread sv3 = new StaticVariableThread();
        sv3.start();
    }
}
