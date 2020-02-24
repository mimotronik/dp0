package factory.abstractFactory;

import factory.abstractFactory.components.Cpu;
import factory.abstractFactory.components.GraphicsCard;
import factory.abstractFactory.components.Motherboard;
import factory.abstractFactory.components.Power;

/**
 * @author winterfell
 */
public interface Computer {

    /**
     * cpu
     *
     * @return
     */
    Cpu createCpu();

    /**
     * 显卡
     *
     * @return
     */
    GraphicsCard createGraphicsCard();

    /**
     * 主板
     *
     * @return
     */
    Motherboard createMotherboard();


    /**
     * 电源
     *
     * @return
     */
    Power createPower();

}
