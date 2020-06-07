import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("src/abc.txt");

        //创建文件
        file.createNewFile();

        //判断读写属性
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.exists());

        //获取绝对路径
        System.out.println(file.getAbsolutePath());
        //返回文件绝对路径的规范格式
        System.out.println(file.getCanonicalPath());
        //如果有父级，返回父级
        System.out.println(file.getParent());
        //获取名字
        System.out.println(file.getName());
        //返回操作系统分隔符 windows和linux不一样
        System.out.println(File.separator);

        //无论当前文件是否存在，只要给定具体路径，都能返回相应的绝对路径
        File file2 = new File("d:/mashibing.txt");
        System.out.println(file2.getAbsolutePath());

        //判断是文件还是目录
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());

        System.out.println("--------------");
        //列出目录下相关信息
        File file3 = new File("c:/");
        String[] list = file3.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------");
        File[] files = file3.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
        System.out.println("-----------");
        //列出盘符
        File[] files1 = file.listRoots();
        for (File file1 : files1) {
            System.out.println(file1);
        }

//        file3.mkdir();
//        file3.mkdirs();

        System.out.println("----------------");
        printFile(new File("E:\\Github"));

    }

    /**
     * 递归列出目录下的所有文件
     * @param file
     */
    public static void printFile(File file){
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File f : files) {
                printFile(f);
            }
        }else {
            System.out.println(file.getAbsolutePath());
        }
    }

}
