import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {
    public static void main(String[] args) {
        File file = new File("writer.txt");
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
            writer.write("mashibing.com");
            writer.write("马士兵教育");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
