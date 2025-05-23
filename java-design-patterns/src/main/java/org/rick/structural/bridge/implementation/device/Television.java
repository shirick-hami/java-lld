package org.rick.structural.bridge.implementation.device;

import org.rick.structural.bridge.__interface.device.Device;

public class Television implements Device {

    boolean isPoweredOn = false;
    boolean isDestroyed = false;

    @Override
    public void powerOn() {
        if (isDestroyed) {
            System.out.println("Television is destroyed. Can't be powered on.");
        } else {
            System.out.println("Powering on Television...");
            isPoweredOn = true;
        }
    }

    @Override
    public void powerOff() {
        System.out.println("Powering off Television...");
        isPoweredOn = false;
    }

    @Override
    public void destroy() {
        if (isDestroyed) {
            System.out.println("Television is already destroyed. Can't be destroyed again.");
        } else {
            System.out.println("Destroying Television permanently...");
            isDestroyed = true;
        }
    }

    @Override
    public void printStatus() {
        if (isDestroyed) {
            System.out.println("Television is destroyed.");
        } else {
            if (isPoweredOn) {
                System.out.println("Television is powered on.");
            } else {
                System.out.println("Television is powered off.");
            }
        }
    }
}
