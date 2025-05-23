package org.rick.creational.singleton;

import org.rick.creational.singleton.impl.NaiveSingleton;

public class NaiveMain {
    public static void main(String[] args) {
        naiveSingleton();
    }

    private static void naiveSingleton() {
        NaiveSingleton naiveSingleton = NaiveSingleton.getInstance("Windows");
        NaiveSingleton anotherNaiveSingleton = NaiveSingleton.getInstance("Linux");

        if (!naiveSingleton.getEnvironment().equals(anotherNaiveSingleton.getEnvironment())) {
            System.out.println("In a Naive Singleton when a Single thread is Running, only one object is created with the initial value in the first getInstance call.");
        }

        Thread thread1 = new Thread(new NaiveSingletonThread1());
        Thread thread2 = new Thread(new NaiveSingletonThread2());

        thread1.start();
        thread2.start();
    }

    static class NaiveSingletonThread1 implements Runnable {
        @Override
        public void run() {
            NaiveSingleton naiveSingletonInThread = NaiveSingleton.getInstance("Windows");
            System.out.println("My Singleton Value : " + naiveSingletonInThread.getEnvironment());
        }
    }

    static class NaiveSingletonThread2 implements Runnable {
        @Override
        public void run() {
            NaiveSingleton naiveSingletonInThread = NaiveSingleton.getInstance("Linux");
            System.out.println("My Singleton Value : " + naiveSingletonInThread.getEnvironment());
        }
    }
}
