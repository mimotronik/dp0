package dp04_strategy.stratege;

import dp04_strategy.StringStrategy;

/**
 * 去除空格的策略
 *
 * @author winterfell
 */
public class RemoveSpaceStrategy implements StringStrategy {
    @Override
    public String action(String old) {
        return old.replaceAll(" ", "");
    }
}
