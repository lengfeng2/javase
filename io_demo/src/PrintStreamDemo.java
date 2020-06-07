import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) {
        PrintStream printStream = null;
        printStream = new PrintStream(System.out);
        try {
            printStream.write("hello world".getBytes());
            printStream.println(true);
            //格式花输出 %s 字符串 %d 整数 %f 浮数点
            System.out.printf("%s--%d--%2f","jfeifj",123,123.22333);
            System.err.println("mashibing");
        } catch (IOException e) {
            e.printStackTrace();
        }
        printStream.close();
    }
}
