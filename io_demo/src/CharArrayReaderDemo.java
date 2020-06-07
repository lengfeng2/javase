import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderDemo {
    public static void main(String[] args) {
        CharArrayReader charArrayReader = null;
        char[] chars = new char[1024];
        chars="马士兵教育".toCharArray();
        int read = 0;
        try {
            charArrayReader = new CharArrayReader(chars);
            while ((read=charArrayReader.read())!=-1){
                System.out.print((char)read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            charArrayReader.close();
        }
    }
}
