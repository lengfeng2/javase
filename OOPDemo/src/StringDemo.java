/*
 * 注意：常量池在1.7之后放置在了堆空间之中
 *       字符串的使用：
 *           1、创建
 *               String str = "abc";
 *               String str2 = new String("abc");
 *               两种方式都可以用，只不过第一种使用比较多
 *           2、字符串的本质
 *               字符串的本质是字符数组或者叫做字符序列
 *               String类使用final修饰，不可以被继承
 *               使用equals方法比较的是字符数组的每一个位置的值
 *               String是一个不可变对象,不可变是指指向的地址不可变，里面的值还是可以变的。通过反射可以改
 *
 * */
public class StringDemo {

    public static void main(String[] args) {
        String str = "abc";
        String str2 = new String("abc");
        String str3 = "hjfuewhufewifhwhqwqdada";
        String intern = str2.intern();
        //比的是内存地址
        System.out.println(str == str2);
        //intern调用的是native本地方法
        System.out.println(str == intern);
        //查看equals源码，可以发现equals方法比较的是字符数组的每一个位置的值
        System.out.println(str.equals(str2));
        //查看String的hashCode源码 为什么使用31*h,因为31的就是32 16 8 ……，很容易进行位运算，在进行运算的时候很方便
        System.out.println(str.hashCode());
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf("a"));
        System.out.println(str.concat("pp"));
        //截取字符串,截取字符串的时候，需要注意的是区间是：左闭右开
        System.out.println(str3.substring(3,7));

    }
}
