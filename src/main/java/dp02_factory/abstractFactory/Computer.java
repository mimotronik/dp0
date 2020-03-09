package dp02_factory.abstractFactory;

import dp02_factory.abstractFactory.components.Cpu;
import dp02_factory.abstractFactory.components.GraphicsCard;
import dp02_factory.abstractFactory.components.Motherboard;
import dp02_factory.abstractFactory.components.Power;

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
