package factory.abstractFactory;

/**
 * @author winterfell
 */
public class Test {

    public static void main(String[] args) {

        Computer excellent = new ExcellentComputer();

        System.out.println(excellent.createCpu().cpuName());


        Computer simple = new SimpleComputer();

        System.out.println(simple.createGraphicsCard().graphicsCardName());
    }

}
