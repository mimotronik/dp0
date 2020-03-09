package dp06_command.requester;

import dp06_command.command.Command;

/**
 * 封装的请求者
 *
 * @author winterfell
 */
public class Keypad {

    private Command play;
    private Command rewind;
    private Command stop;

    public Keypad(Command play, Command rewind, Command stop) {
        this.play = play;
        this.rewind = rewind;
        this.stop = stop;
    }

    public void play() {
        // 这里已经把原始的对象调用封装成了 类的调用
        play.execute();
    }

    public void rewind() {
        rewind.execute();
    }

    public void stop() {
        stop.execute();
    }
}
