package org.rick.creational.singleton.impl;

public class NaiveSingleton {
    private static NaiveSingleton instance;

    private String environment;

    private NaiveSingleton() {}

    private NaiveSingleton(String environment) {
        this.environment = environment;
    }

    public static NaiveSingleton getInstance(String environment) {
        if (instance == null) {
            instance = new NaiveSingleton(environment);
        }
        return instance;
    }

    public String getEnvironment() {
        return environment;
    }
}
