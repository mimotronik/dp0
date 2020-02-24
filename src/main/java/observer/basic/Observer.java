package observer.basic;

/**
 * @author winterfell
 */
public interface Observer {

    /**
     * 当主题更新的时候，通过msg传递消息
     *
     * @param msg
     */
    void update(String msg);

}
