package org.rick.structural.bridge.__abstraction;

import org.rick.structural.bridge.__interface.device.Device;
import org.rick.structural.bridge.implementation.remote.BasicRemote;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void pressSelfDestructButton() {
        System.out.println("Pressing self destruct button...");
        super.device.destroy();
    }
}
