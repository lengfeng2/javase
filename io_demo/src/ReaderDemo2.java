import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo2 {
    public static void main(String[] args) {
        FileReader reader = null;
        char[] chars = new char[1024];
        try {
            reader = new FileReader("abc.txt");
            int length = 0;
            while ((length=reader.read(chars))!=-1){
                System.out.println(new String(chars,0,length));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
