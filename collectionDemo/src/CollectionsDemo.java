import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("afgewf");
        list.add("jfeiw");
        list.add("abc");
        Collections.addAll(list,"jdiw","hvfuew","fewfwefewwq");
        System.out.println(list);
        //排序
        Collections.sort(list);
        System.out.println(list);
        //自定义按照长度进行排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()>o2.length()){
                    return 1;
                }else if (o1.length()<o2.length()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println(list);
        //必须先进行排序才能进行二分查找
        System.out.println(Collections.binarySearch(list, "abc"));

        //填充
//        Collections.fill(list,"mashibing");
//        System.out.println(list);

        //逆序
        Collections.reverse(list);
        System.out.println(list);

        //随机排序
        Collections.shuffle(list,new Random(5));
        System.out.println(list);



    }
}
