package org.rick.structural.bridge;

import org.rick.structural.bridge.__abstraction.AdvancedRemote;
import org.rick.structural.bridge.implementation.device.Radio;
import org.rick.structural.bridge.implementation.device.Television;
import org.rick.structural.bridge.implementation.remote.BasicRemote;

public class Main {
    public static void main(String[] args) {
        BasicRemote basicRemote = new BasicRemote(new Television());
        basicRemote.pressPowerOnButton();
        basicRemote.pressDeviceStatusButton();
        basicRemote.pressPowerOffButton();
        basicRemote.pressDeviceStatusButton();

        basicRemote = new BasicRemote(new Radio());
        basicRemote.pressPowerOnButton();
        basicRemote.pressDeviceStatusButton();
        basicRemote.pressPowerOffButton();
        basicRemote.pressDeviceStatusButton();

        AdvancedRemote advancedRemote = new AdvancedRemote(new Television());
        advancedRemote.pressSelfDestructButton();
        advancedRemote.pressDeviceStatusButton();
        advancedRemote.pressPowerOnButton();
        advancedRemote.pressDeviceStatusButton();

        advancedRemote = new AdvancedRemote(new Radio());
        advancedRemote.pressSelfDestructButton();
        advancedRemote.pressDeviceStatusButton();
        advancedRemote.pressPowerOnButton();
        advancedRemote.pressDeviceStatusButton();
    }
}
