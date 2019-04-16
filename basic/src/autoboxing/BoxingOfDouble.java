package autoboxing;

import util.BasicTestUtil;

public class BoxingOfDouble {

    public static void main(String[] args) {
        BasicTestUtil util = new BasicTestUtil();

        // Double和Integer的包装方式不一样，Double没有类似的缓存。
        // 1. Double a = 123.0 每次都会创建新的对象
        // 2. 与基本变量类型比较时，也会自动unboxing
        Double double_1 = 100.0;
        Double double_2 = 100.0;
        double double_3 = 100.0;
        util.print("double_1 == double_2: " + (double_1 == double_2));
        util.print("double_1 == double_3: " + (double_1 == double_3));



    }
}
