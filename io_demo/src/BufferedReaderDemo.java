import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        BufferedReader reader = null;
        String read = null;
        try {
            reader = new BufferedReader(new FileReader("aaa.txt"));
//            String readLine = reader.readLine();
//            System.out.println(readLine);
            while ((read=reader.readLine())!=null){
                System.out.println(read);
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
