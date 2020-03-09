package dp01_observer.basic2;

/**
 * @author winterfell
 */
public interface Subject {

    void addListener(Listener listener);

    void removeListener(Listener listener);

    void notifyAllListener();

    void publishStatus(Status status);

    Status status();

}
