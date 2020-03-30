package com.company;

import java.io.*;
/*
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName());
    }
}
class MyThread extends Thread {

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("This is new Thread");
        someMethod();
    }
    private void someMethod() {
        throw new RuntimeException();
    }
}
 */

/*
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName());
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run (){
        System.out.println(Thread.currentThread().getName());
    }
}
*/

public class Main {
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i<400; i++) {
            System.out.println("Thread name is + " + Thread.currentThread().getName() + "i=" + i);
        }
    }
}