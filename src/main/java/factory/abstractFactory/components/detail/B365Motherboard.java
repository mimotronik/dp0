package factory.abstractFactory.components.detail;

import factory.abstractFactory.components.Motherboard;

/**
 * @author winterfell
 */
public class B365Motherboard implements Motherboard {
    @Override
    public String modelName() {
        return "b365";
    }
}
