package dp01_observer.basic2;

/**
 * @author winterfell
 */
public class Test {

    public static void main(String[] args) {

        Subject subject = new MySubject();

        Listener listener1 = new MyListener1();

        subject.addListener(listener1);
        subject.addListener(s -> {
            if (s.status().equals(Status.END)) {
                System.out.println("内部类监听器监听到状态关闭");
            }
        });


        subject.publishStatus(Status.START);

        subject.publishStatus(Status.START);

        subject.publishStatus(Status.END);

    }

}
