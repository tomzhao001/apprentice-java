package string;

import util.BasicTestUtil;

public class StringHoldingPlace {

    public static void main(String[] args) {
        BasicTestUtil util = new BasicTestUtil();

        // 我们知道有两个地方可以存放String，常量池和内存(堆区)
        // 那么什么情况下放在常量池，什么情况下放在堆区呢？

        // 1. new String() 因为使用了构造函数，每次必然放入堆区，不会进常量池
        String str_1 = new String("aaa");
        String str_2 = new String("aaa");
        String str_3 = "aaa";
        util.print("str_1 == str_2: " + (str_1 == str_2));
        util.print("str_1 == str_3: " + (str_1 == str_3));

        // 2. 使用 String a = "xxx" 会查找常量池，没有的时候才新建 (String创建之后不能被修改)
        String str_4 = "bbb";
        String str_5 = "bbb";
        util.print("str_4 == str_5: " + (str_4 == str_5));

        // 3. 使用intern()方法，可以把堆区的String对象放入常量池
        String str_6 = new String("ccc");
        String str_7 = "ccc";
        String str_8 = str_6.intern();
        util.print("str_6 == str_7: " + (str_6 == str_7));
        util.print("str_6 == str_8: " + (str_6 == str_8));
        util.print("str_7 == str_8: " + (str_7 == str_8));

        // 4. 如果使用了加号运算符，会在堆区创建新的对象
        //    在常量池中使用加号运算符，需要在堆区创建临时变量，所以频繁改变的String建议使用StringBuffer或者StringBuilder
        String str_9 = new String("dd");
        String str_10 = new String("d");
        String str_11 = "dd";
        String str_12 = "d";
        String str_13 = "ddd";
        util.print("str_13 == str_9 + str_10: " + (str_13 == str_9 + str_10));
        util.print("str_13 == str_11 + str_12: " + (str_13 == str_11 + str_12));

    }
}
