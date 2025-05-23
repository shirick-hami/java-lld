package org.rick.structural.bridge.implementation.remote;

import org.rick.structural.bridge.__interface.device.Device;
import org.rick.structural.bridge.__interface.remote.Remote;

public class BasicRemote implements Remote {

    protected Device device;

    private BasicRemote() {}

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void pressPowerOnButton() {
        System.out.println("Pressing power on button...");
        device.powerOn();
    }

    @Override
    public void pressPowerOffButton() {
        System.out.println("Pressing power off button...");
        device.powerOff();
    }

    @Override
    public void pressDeviceStatusButton() {
        System.out.println("Pressing device status button...");
        device.printStatus();
    }
}
