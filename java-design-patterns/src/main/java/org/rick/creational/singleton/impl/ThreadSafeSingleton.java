package org.rick.creational.singleton.impl;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private String environment;

    private ThreadSafeSingleton() {}

    private ThreadSafeSingleton(String environment) {
        this.environment = environment;
    }

    public static ThreadSafeSingleton getInstance(String environment) {
        ThreadSafeSingleton copy = instance;
        if (copy != null) {
            return copy;
        }
        synchronized (ThreadSafeSingleton.class) {
            if (instance == null) {
                instance = new ThreadSafeSingleton(environment);
            }
            return instance;
        }
    }

    public String getEnvironment() {
        return environment;
    }
}
