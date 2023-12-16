import java.util.Date;
import java.util.Random;

/**
 * Test It
 * 测试类
 * <p>
 * Chinese char view, hello China!
 * 中文测试, 你好, 中国!
 *
 * @author L_J
 * @since 2022/10/7 21:19
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(MainExample.sfs);

        System.out.println(MainExample.deprecatedProp);
        // Deprecated method
        MainExample.deprecateMethod();
        // Deprecated and for removal
        // MainExample.deprecatedForRemoval();

        MainExample mainExample = new MainExample("field value");
        System.out.println(mainExample.getField());

        // ligatures 效果
        System.out.println("a == b ? c >= d ? === => ==> ===> --------------> O(∩_∩)O~");

        Integer unusedVar = 123;
        Integer usedVar = new Random().nextInt(100);
        System.out.println(usedVar);

        if (usedVar <= 50) {
            System.out.println("usedVar <= 50");
        }

        Integer ohttps = 0;
        System.out.println(ohttps);
    }
}
