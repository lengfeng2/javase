/**
 * 问题：
 */
public class StringDemo2 {

    public static void main(String[] args) {
        String a = "abc";
        String b = "def";
        String c = "abcdef";
        String d = a+b;
        String e = "abc" + "def";
        String f = (a+b).intern();//明确指向堆里的常量池
        System.out.println(c==d);//为什么是false,因为编译器在编译的时候a+b指向的地址空间，无法判断是指向哪
        System.out.println(c==e);
        System.out.println(c==f);
    }
}
