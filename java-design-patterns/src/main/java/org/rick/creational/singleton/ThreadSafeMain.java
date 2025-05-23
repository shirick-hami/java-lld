package org.rick.creational.singleton;

import org.rick.creational.singleton.impl.ThreadSafeSingleton;

import java.util.UUID;

public class ThreadSafeMain {
    public static void main(String[] args) {
        multiThreadedSafeSingleton();
    }

    private static void multiThreadedSafeSingleton() {
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(new MultithreadSafeSingletonThread(UUID.randomUUID().toString()));
            thread.start();
        }
    }

    static class MultithreadSafeSingletonThread implements Runnable {

        private String environment;

        @Override
        public void run() {
            ThreadSafeSingleton safeSingletonInThread = ThreadSafeSingleton.getInstance(environment);
            System.out.println("My Singleton Value : " + safeSingletonInThread.getEnvironment());
        }

        public MultithreadSafeSingletonThread(String environment) {
            this.environment = environment;
        }

        private MultithreadSafeSingletonThread() {}
    }
}
