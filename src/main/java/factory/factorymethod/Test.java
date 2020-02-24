package factory.factorymethod;

/**
 * @author winterfell
 */
public class Test {

    public static void main(String[] args) {

        Channel serverSocketChannel = new ServerSocketChannelFactory().getChannel();

        Channel socketChannel = new SocketChannelFactory().getChannel();

        System.out.println(serverSocketChannel.name());

        System.out.println(socketChannel.name());

    }

}
