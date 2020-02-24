package observer.basic;

import java.util.HashSet;
import java.util.Set;

/**
 * @author winterfell
 */
public class MySubject implements Subject {

    /**
     * 观察者的集合
     */
    private Set<Observer> observers;

    /**
     * 消息，消息一旦更新 需要通知给观察者
     */
    private String msg;

    public MySubject() {
        this.observers = new HashSet<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

    /**
     * 发布消息
     */
    public void publishMsg(String msg) {
        this.msg = msg;

        // 主动通知所有的观察者
        this.notifyAllObserver();
    }

}
