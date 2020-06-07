import java.util.*;

/*
 *   1、set中存放的是无序，唯一的数据
 *   2、set不可以通过下标获取对应位置的元素的值，因为无序的特点
 *   3、使用treeset底层的实现是treemap,利用红黑树来进行实现
 *   4、设置元素的时候，如果是自定义对象，会查找对象中的equals和hashcode的方法，如果没有，比较的是地址
 *   5、树中的元素是要默认进行排序操作的，如果是基本数据类型，自动比较，如果是引用类型的话，需要自定义比较器
 *       比较器分类：
 *         内部比较器
 *               定义在元素的类中，通过实现comparable接口来进行实现
 *         外部比较器
 *               定义在当前类中，通过实现comparator接口来实现，但是要将该比较器传递到集合中
 *         注意：外部比较器可以定义成一个工具类，此时所有需要比较的规则如果一致的话，可以复用，而
 *               内部比较器只有在存储当前对象的时候才可以使用
 *               如果两者同时存在，使用外部比较器
 *               当使用比较器的时候，不会调用equals方法
 * */
public class SetDemo implements Comparator<Person> {
    public static void main(String[] args) {
        Set<Object> hashSet = new HashSet<>();
        hashSet.add(123);
        hashSet.add("abc");
        hashSet.add(true);
        hashSet.add(123);
        System.out.println(hashSet);

        //循环遍历
        for (Iterator iterator = hashSet.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }

        Set<Object> treeSet = new TreeSet<>();
        treeSet.add(67);
        treeSet.add(25);
        treeSet.add(17);
        System.out.println(treeSet);

        //hashSet
        Set<Person> hashSet1 = new HashSet<>();
        hashSet1.add(new Person("zhangsan",15));
        hashSet1.add(new Person("zhangsan",15));
        hashSet1.add(new Person("wangwu",23));
        System.out.println(hashSet1);

        //treeSet引用对象必须实现比较器，因为树是排序的
//        Set<Person> treeSet1 = new TreeSet<>();
//        treeSet1.add(new Person("zhangsan",15));
//        treeSet1.add(new Person("maxiaoliu",29));
//        treeSet1.add(new Person("wangwu",23));
//        treeSet1.add(new Person("wangwu",23));
//        System.out.println(treeSet1);

        //treeSet外部比较器实现
        TreeSet<Person> treeSet2 = new TreeSet<>(new SetDemo());
        treeSet2.add(new Person("zhangsan",15));
        treeSet2.add(new Person("maxiaoliu",29));
        treeSet2.add(new Person("wangwu",23));
        treeSet2.add(new Person("xuexue",17));
        System.out.println(treeSet2);
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge()>o2.getAge()){
            return 1;
        }else if (o1.getAge()<o2.getAge()){
            return -1;
        }else {
            return 0;
        }
    }
}
