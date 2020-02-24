package factory.abstractFactory.components.detail;

import factory.abstractFactory.components.Power;

/**
 * @author winterfell
 */
public class GoldenPower implements Power {
    @Override
    public String powerType() {
        return "golden";
    }
}
