package dp08_facade;

/**
 * @author winterfell
 */
public class Computer {

    private Cpu cpu;
    private Memory memory;
    private Screen screen;

    public Computer() {
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.screen = new Screen();
    }

    public void start() {
        cpu.start();
        memory.start();
        screen.start();
    }

    public void stop() {
        screen.stop();
        memory.stop();
        cpu.stop();
    }
}
