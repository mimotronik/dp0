package factory.abstractFactory.components.detail;

import factory.abstractFactory.components.Power;

/**
 * @author winterfell
 */
public class SilveryPower implements Power {

    @Override
    public String powerType() {
        return "silvery";
    }
}
