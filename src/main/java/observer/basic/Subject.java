package observer.basic;

/**
 * @author winterfell
 */
public interface Subject {

    /**
     * 新增观察者
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有的观察者
     */
    void notifyAllObserver();

}
