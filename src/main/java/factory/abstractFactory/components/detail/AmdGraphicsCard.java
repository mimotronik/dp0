package factory.abstractFactory.components.detail;

import factory.abstractFactory.components.GraphicsCard;

/**
 * @author winterfell
 */
public class AmdGraphicsCard implements GraphicsCard {
    @Override
    public String graphicsCardName() {
        return "amd";
    }
}
