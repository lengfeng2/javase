import java.io.*;

/**
 * 使用reader字符流会导致复制的文件打不开，
 * 这里应该使用字节流
 */
public class CopyFile {
    public static void main(String[] args) {
//        FileReader reader = null;
//        FileWriter writer = null;
//        char[] chars = new char[1024];
//        int lenth = 0;
//        try {
//            reader = new FileReader("电脑配置.xlsx");
//            writer = new FileWriter("电脑配置副本.xlsx");
//            while ((lenth=reader.read(chars))!=-1){
//                writer.write(chars);
//                writer.flush();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                writer.close();
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        int length = 0;
        byte[] buffer = new byte[1024];
        try {
            fileInputStream = new FileInputStream("1.jpg");
            fileOutputStream = new FileOutputStream("2.jpg");
            while ((length=fileInputStream.read(buffer))!=-1){
                fileOutputStream.write(buffer);
                fileOutputStream.flush();
            }
            System.out.println("复制成功，2.jpg已生成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
