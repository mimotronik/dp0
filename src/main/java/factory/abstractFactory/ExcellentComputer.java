package factory.abstractFactory;

import factory.abstractFactory.components.Cpu;
import factory.abstractFactory.components.GraphicsCard;
import factory.abstractFactory.components.Motherboard;
import factory.abstractFactory.components.Power;
import factory.abstractFactory.components.detail.GoldenPower;
import factory.abstractFactory.components.detail.I7Cpu;
import factory.abstractFactory.components.detail.NvidiaGraphicsCard;
import factory.abstractFactory.components.detail.Z390Motherboard;

/**
 * @author winterfell
 */
public class ExcellentComputer implements Computer {
    @Override
    public Cpu createCpu() {
        return new I7Cpu();
    }

    @Override
    public GraphicsCard createGraphicsCard() {
        return new NvidiaGraphicsCard();
    }

    @Override
    public Motherboard createMotherboard() {
        return new Z390Motherboard();
    }

    @Override
    public Power createPower() {
        return new GoldenPower();
    }
}
