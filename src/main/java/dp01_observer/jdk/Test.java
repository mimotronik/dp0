package dp01_observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author winterfell
 */
public class Test {

    public static void main(String[] args) {

        // 被观察者
        Observable subject = new Observable() {
            @Override
            public void notifyObservers(Object arg) {
                // 根据源码的阅读需要主动改变
                this.setChanged();
                super.notifyObservers(arg);
            }
        };

        Observer1 observer1 = new Observer1();

        subject.addObserver(observer1);

        subject.addObserver((o, arg) -> {

            System.out.println("[inner class] 被观察者自身 o ：" + o);

            System.out.println("[inner class] 被观察者主动传递的值 ：" + arg);
        });

        subject.notifyObservers("this is a message");

    }

}
