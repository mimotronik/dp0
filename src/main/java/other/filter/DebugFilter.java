package other.filter;

/**
 * DebugFilter
 *
 * @author zhuzhenjie
 * @since 2021/4/16
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
