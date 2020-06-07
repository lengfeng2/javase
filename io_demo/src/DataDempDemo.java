import java.io.*;

public class DataDempDemo {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;
        FileOutputStream fileOutputStream = null;
        DataOutputStream dataOutputStream = null;

        try {
            //数据流写出
            fileOutputStream = new FileOutputStream("abc.txt");
            dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeInt(123);
//            dataOutputStream.writeChars(new String("fjweiofjewi"));
            dataOutputStream.writeDouble(3.14);
            dataOutputStream.writeUTF("mashibing.com:马士兵教育");

            //数据流读入
            fileInputStream = new FileInputStream("abc.txt");
            dataInputStream = new DataInputStream(fileInputStream);
            dataInputStream.readBoolean();
            dataInputStream.readInt();
//            dataInputStream.readChar();
            dataInputStream.readDouble();
            dataInputStream.readUTF();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            try {
//                dataInputStream.close();
//                dataOutputStream.close();
//                fileInputStream.close();
//                fileOutputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
    }
}
