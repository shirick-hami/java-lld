package org.rick.creational.abstract_factory;

import org.rick.creational.abstract_factory.client.Application;
import org.rick.creational.abstract_factory.factory.OSAbstractFactory;
import org.rick.creational.abstract_factory.factory.impl.LinuxFactory;
import org.rick.creational.abstract_factory.factory.impl.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        OSAbstractFactory windowsFactory = new WindowsFactory();
        Application windowsApplication = new Application(windowsFactory);
        windowsApplication.clickButton();
        windowsApplication.clickCheckbox();

        OSAbstractFactory linuxFactory = new LinuxFactory();
        Application linuxApplication = new Application(linuxFactory);
        linuxApplication.clickButton();
        linuxApplication.clickCheckbox();
    }
}
