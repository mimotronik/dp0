package dp01_observer.basic2;


/**
 * @author winterfell
 */
public class MyListener1 implements Listener {

    @Override
    public void update(Subject subject) {

        Status status = subject.status();

        if (status.equals(Status.START)) {

            System.out.println("listener 1 监听到 状态开启");

        }
    }
}
