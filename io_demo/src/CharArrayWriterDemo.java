import java.io.CharArrayWriter;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        charArrayWriter.write(97);
        charArrayWriter.write(98);
        charArrayWriter.write(99);
        charArrayWriter.append("zhangsan");
        System.out.println(charArrayWriter);
        charArrayWriter.close();
    }
}
