/**
 * * 可变字符串
 * *   StringBuffer：线程安全，效率低
 * *   StringBuilder: 线程不安全，效率高
 * StringBuffer 可变字符串，线程安全的,具体查看源码 append方法加了syc
 * StringBuilder 线程不安全的
 * @author ww
 * @date 2020/4/27 10:43
 */
public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(1).append("abc").append("hello");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.capacity());

        StringBuilder stringBuilder = new StringBuilder();

    }

}
