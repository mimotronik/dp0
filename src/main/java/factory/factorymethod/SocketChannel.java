package factory.factorymethod;

/**
 * @author winterfell
 */
public class SocketChannel implements Channel {
    @Override
    public String name() {
        return "SocketChannel";
    }
}
