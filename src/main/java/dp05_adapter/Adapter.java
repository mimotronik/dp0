package dp05_adapter;

/**
 * @author winterfell
 */
public class Adapter implements Target {

    private Target adaptee;

    @Override
    public String getValue() {

        System.out.println("old --> " + adaptee.getValue());

        return "这个是新的适配值";
    }

    public Adapter(Target adaptee) {
        this.adaptee = adaptee;
    }
}
