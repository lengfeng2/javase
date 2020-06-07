import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        //循环遍历方式一
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        System.out.println("--------------------");

        //循环遍历方式二
//        Iterator<Object> iterator = list.iterator();
//        while (iterator.hasNext()){
//            //删除操作会报一个著名的异常
//            /**
//             * Exception in thread "main" java.util.ConcurrentModificationException
//             * 	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
//             * 	at java.util.ArrayList$Itr.next(ArrayList.java:859)
//             * 	at IteratorDemo.main(IteratorDemo.java:21)
//             */
//            Object o = iterator.next();
//            if (o.equals("a")){
//                list.remove(o);
//            }
//            System.out.println(o);
//        }

        /**
         * 正确删除元素的方式
         */
        ListIterator<Object> iterator = list.listIterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            if (o.equals("a")){
                iterator.remove();
            }
        }

        System.out.println("--------------------");
        //循环遍历方式三
        for (Object o : list) {
            System.out.println(o);
        }
        /**
         * 指针向前移动
         */
        System.out.println("--------------------");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

    }
}
