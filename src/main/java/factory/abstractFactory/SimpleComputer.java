package factory.abstractFactory;

import factory.abstractFactory.components.Cpu;
import factory.abstractFactory.components.GraphicsCard;
import factory.abstractFactory.components.Motherboard;
import factory.abstractFactory.components.Power;
import factory.abstractFactory.components.detail.AmdGraphicsCard;
import factory.abstractFactory.components.detail.B365Motherboard;
import factory.abstractFactory.components.detail.I5Cpu;
import factory.abstractFactory.components.detail.SilveryPower;

/**
 * @author winterfell
 */
public class SimpleComputer implements Computer {
    @Override
    public Cpu createCpu() {
        return new I5Cpu();
    }

    @Override
    public GraphicsCard createGraphicsCard() {
        return new AmdGraphicsCard();
    }

    @Override
    public Motherboard createMotherboard() {
        return new B365Motherboard();
    }

    @Override
    public Power createPower() {
        return new SilveryPower();
    }
}
