package factory.abstractFactory.components.detail;

import factory.abstractFactory.components.Cpu;

/**
 * @author winterfell
 */
public class I3Cpu implements Cpu {
    @Override
    public String cpuName() {
        return "i3";
    }
}
