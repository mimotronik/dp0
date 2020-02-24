package adapter;

/**
 * @author winterfell
 */
public class Test {

    public static void main(String[] args) {

        Target old = new Adaptee();

        Target adapter = new Adapter(old);


        System.out.println(old.getValue());

        System.out.println("#############################");

        System.out.println(adapter.getValue());

    }

}
