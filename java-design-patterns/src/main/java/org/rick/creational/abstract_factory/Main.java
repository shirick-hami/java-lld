package org.rick.creational.abstract_factory;

import org.rick.creational.abstract_factory.client.ApplicationClient;
import org.rick.creational.abstract_factory.factory.OSAbstractFactory;
import org.rick.creational.abstract_factory.factory.impl.LinuxFactory;
import org.rick.creational.abstract_factory.factory.impl.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        OSAbstractFactory windowsFactory = new WindowsFactory();
        ApplicationClient windowsApplicationClient = new ApplicationClient(windowsFactory);
        windowsApplicationClient.clickButton();
        windowsApplicationClient.clickCheckbox();

        OSAbstractFactory linuxFactory = new LinuxFactory();
        ApplicationClient linuxApplicationClient = new ApplicationClient(linuxFactory);
        linuxApplicationClient.clickButton();
        linuxApplicationClient.clickCheckbox();
    }
}
