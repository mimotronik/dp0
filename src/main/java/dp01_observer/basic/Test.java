package dp01_observer.basic;

/**
 * @author winterfell
 */
public class Test {

    public static void main(String[] args) {

        // 定义一个主题
        MySubject subject = new MySubject();

        // 定义多个观察者
        MyObserver1 ob1 = new MyObserver1();
        MyObserver2 ob2 = new MyObserver2();

        subject.registerObserver(ob1);
        subject.registerObserver(ob2);
        subject.registerObserver(msg -> {
            System.out.println("内部类观察者得到消息" + msg);
        });

        subject.publishMsg("first message ...");

        System.out.println("###################################");

        subject.removeObserver(ob1);
        subject.publishMsg("second message ...");

    }

}
