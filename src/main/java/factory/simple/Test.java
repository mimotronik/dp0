package factory.simple;

/**
 * @author winterfell
 */
public class Test {

    public static void main(String[] args) {

        NioServerSocketChannel nioServerSocketChannel = new ChannelFactory(NioServerSocketChannel.class).getChannel();

        System.out.println(nioServerSocketChannel);

        NioSocketChannel nioSocketChannel = new ChannelFactory(NioSocketChannel.class).getChannel();

        System.out.println(nioSocketChannel);

    }

}
