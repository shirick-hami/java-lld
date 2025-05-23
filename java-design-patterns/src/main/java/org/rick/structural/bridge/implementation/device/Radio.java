package org.rick.structural.bridge.implementation.device;

import org.rick.structural.bridge.__interface.device.Device;

public class Radio implements Device {

    boolean isPoweredOn = false;
    boolean isDestroyed = false;

    @Override
    public void powerOn() {
        if (isDestroyed) {
            System.out.println("Radio is destroyed. Can't be powered on.");
        } else {
            System.out.println("Powering on Radio...");
            isPoweredOn = true;
        }
    }

    @Override
    public void powerOff() {
        System.out.println("Powering off Radio...");
        isPoweredOn = false;
    }

    @Override
    public void destroy() {
        if (isDestroyed) {
            System.out.println("Radio is already destroyed. Can't be destroyed again.");
        } else {
            System.out.println("Destroying Radio permanently...");
            isDestroyed = true;
        }
    }

    @Override
    public void printStatus() {
        if (isDestroyed) {
            System.out.println("Radio is destroyed.");
        } else {
            if (isPoweredOn) {
                System.out.println("Radio is powered on.");
            } else {
                System.out.println("Radio is powered off.");
            }
        }
    }
}
