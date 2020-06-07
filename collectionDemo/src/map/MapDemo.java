package map;

import java.util.*;

/**
 * map存储的是k-v键值对映射的数据
 *      实现子类：
 *          HashMap：数据+链表（1.7） 数组+链表+红黑树（1.8）
 *          LinkedHashMap：链表
 *          TreeMap:红黑树
 *
 *      基本api操作：
 *          增加：
 *              put（k,v）    添加元素
 *          查找：
 *              isEmpty      判断是否为空
 *              size        返回map的大小
 *              containsKey
 *              containsValue
 *              get
 *          删除：
 *              clear 清空集合中的所有元素
 *              remove:删除指定元素
 *     Map.entry:表示的是K-V组合的一组映射关系，key和value成组出现
 *
 *     hashmap跟hashtable的区别：
 *      1、hashmap线程不安全，效率比较高，hashtable线程安全，效率低
 *      2、hashmap中key和value都可以为空,hashtable不允许为空
 *
 *
 *      hashmap初始值为2的N次幂，
 *          1、方便进行&操作，提高效率，&要比取模运算效率要高
 *              hash & (initCapacity-1)
 *          2、在扩容之后涉及到元素的迁移过程，迁移的时候只需要判断二进制的前一位是0或者是1即可
 *              如果是0，表示新数组和就数组的下标位置不变，如果是1，只需要将索引位置加上旧的数组的长度值即为新数组的下标
 *      1.7源码知识点：  数组+链表
 *          1、默认初始容量
 *          2、加载因子
 *          3、put操作
 *              1、设置值，计算hash
 *              2、扩容操作
 *              3、数据迁移的过程
 *      1.8源码知识点:   数组+链表+红黑树
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);
        map.put(null,null);
        //判断非空
        System.out.println(map.isEmpty());
        //判断是否包含key
        System.out.println(map.containsKey("a"));
        //判断是否包含value
        System.out.println(map.containsValue(1));
        //删除一个元素
        map.remove("a");
        System.out.println(map);
        //清空所有
//        map.clear();
//        System.out.println(map);

        //遍历的几种方式，方式一
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + map.get(key));
        }

        //方式二 只能循环输出map的value值
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }

        //方式三 最常用的
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
//            System.out.println(next.getKey() + "=" + next.getValue());
            System.out.println(next);
        }
        
        //方式四 迭代器
        Set<String> keys2 = map.keySet();
        Iterator<String> iterator1 = keys2.iterator();
        while (iterator1.hasNext()){
            String key = iterator1.next();
            System.out.println(key + ": " + map.get(key));

        }



    }
}