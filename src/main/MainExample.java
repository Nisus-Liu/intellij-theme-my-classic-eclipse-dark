/**
 * 测试类
 * <p>
 * 中文测试, 你好, 中国!
 *
 * @author L_J
 * @since 2022/10/7 21:19
 */
public class MainExample {
    public static final String sfs = "abc";
    private String field;
    @Deprecated
    public static Boolean deprecatedProp;

    public MainExample(String field) {
        System.out.println(field);
    }

    public static void main(String[] args) {
        System.out.println("hello world" + (1 != 2));
        Integer localVar = 1;
        System.out.println("localVar = " + localVar);
        if (6 >= 5) {
        }
        System.out.println("abc = " + sfs);
        System.out.println(false);
        // 0OoIJijk961l1L


    }

    @Deprecated
    public static void deprecateMethod() {

    }

    // @Deprecated(forRemoval = true)
    // public static void deprecatedForRemoval() {
    //
    // }

}
