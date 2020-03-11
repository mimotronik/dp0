package dp07_decorator;

/**
 * 统一的抽象描述
 *
 * @author winterfell
 */
public abstract class Sweet {

    protected String description = "Sweet";

    public String getDescription() {
        return description;
    }

    /**
     * cost
     *
     * @return
     */
    public abstract double cost();
}
