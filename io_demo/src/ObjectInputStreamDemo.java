import java.io.*;

public class ObjectInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("abc.txt");
            ois = new ObjectInputStream(fis);
            String readUTF = ois.readUTF();
            System.out.println(readUTF);
            Object readObject = ois.readObject();
            if (readObject instanceof Person){
                Person person = (Person) readObject;
                System.out.println(person);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
