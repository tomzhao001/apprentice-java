package autoboxing;

import util.BasicTestUtil;

public class BoxingOfInteger {

    public static void main(String[] args) {
        BasicTestUtil util = new BasicTestUtil();

        // 1. new Integer() 是简单创建对象，和Boxing没有丝毫的关系
        Integer int_1 = new Integer(100);
        Integer int_2 = new Integer(100);
        util.print("int_1 == int_2: " + (int_1 == int_2));

        // 2. Integer a = 123 等价于 Integer.valueOf(123)
        Integer int_3 = 100;
        Integer int_4 = 100;
        Integer int_5 = Integer.valueOf(100);
        util.print("int_3 == int_4: " + (int_3 == int_4));
        util.print("int_3 == int_5: " + (int_3 == int_5));

        // 3. 对于Integer.valueOf()来说，-128 到 127 (闭区间) 会放在 IntegerCache 里面
        Integer int_6 = 128;
        Integer int_7 = 128;
        Integer int_8 = Integer.valueOf(128);
        util.print("int_6 == int_7: " + (int_6 == int_7));
        util.print("int_6 == int_8: " + (int_6 == int_8));

        // 4. 当一个Integer对象和普通对象类型进行比较的时候，会自动unboxing。
        Integer int_9 = 200;
        Integer int_10 = new Integer(200);
        int int_11 = 200;
        util.print("int_9 == int_10: " + (int_9 == int_10));
        util.print("int_9 == int_11: " + (int_9 == int_11));
        util.print("int_10 == int_11: " + (int_10 == int_11));

        // 5. 在遇到加减乘除之类的运算符时，会自动unboxing。
        Integer int_12 = new Integer(200);
        Integer int_13 = new Integer(200);
        int int_14 = 400;
        Integer int_15 = 400;
        util.print("int_14 == int_12 + int_13: " + (int_14 == int_12 + int_13));
        util.print("int_15 == int_12 + int_13: " + (int_15 == int_12 + int_13));

        // 6. equals() 方法在判断内容之前，如果类型不匹配，直接返回false (此处有类型提升的行为)
        Integer int_16 = 200;
        Integer int_17 = 200;
        Long long_1 = 200L;
        Long long_2 = 400L;
        util.print("long_2.equals(int_16 + int_17): " + (long_2.equals(int_16 + int_17)));
        util.print("long_2.equals(int_16 + long_1): " + (long_2.equals(int_16 + long_1)));

    }

}
