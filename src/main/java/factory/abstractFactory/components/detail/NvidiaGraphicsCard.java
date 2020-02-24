package factory.abstractFactory.components.detail;

import factory.abstractFactory.components.GraphicsCard;

/**
 * @author winterfell
 */
public class NvidiaGraphicsCard implements GraphicsCard {
    @Override
    public String graphicsCardName() {
        return "Nvidia";
    }
}
