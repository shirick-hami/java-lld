package org.rick.creational.singleton;

import org.rick.creational.singleton.impl.NaiveSingleton;

public class ThreadUnsafeNaiveMain {
    public static void main(String[] args) {
        multiThreadedNaiveSingleton();
    }

    private static void multiThreadedNaiveSingleton() {
        Thread thread1 = new Thread(new NaiveSingletonThread("Windows"));
        Thread thread2 = new Thread(new NaiveSingletonThread("Linux"));

        thread1.start();
        thread2.start();
    }

    static class NaiveSingletonThread implements Runnable {

        private String environment;

        @Override
        public void run() {
            NaiveSingleton naiveSingletonInThread = NaiveSingleton.getInstance(environment);
            System.out.println("My Singleton Value : " + naiveSingletonInThread.getEnvironment());
        }

        public NaiveSingletonThread(String environment) {
            this.environment = environment;
        }

        private NaiveSingletonThread() {}
    }
}
