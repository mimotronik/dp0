package dp09_template;

/**
 * @author winterfell
 */
public abstract class OneDayWorkTemplate implements Work {

    protected void wakeUp() {
        System.out.println("起床 。。。");
    }

    protected void sleep() {
        System.out.println("睡觉 。。。");
    }

    public void workDetail() {
        this.wakeUp();
        this.work();
        this.sleep();
    }

}
