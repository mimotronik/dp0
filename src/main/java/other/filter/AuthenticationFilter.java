package other.filter;

/**
 * AuthenticationFilter
 *
 * @author zhuzhenjie
 * @since 2021/4/16
 */
public class AuthenticationFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}