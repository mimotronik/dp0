package adapter;

/**
 * @author winterfell
 */
public class Adaptee implements Target {

    @Override
    public String getValue() {
        return "原来接口的返回值";
    }

}
