import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DogCollectionDemo {
    public static void main(String[] args) {
        List<Dog> list = new ArrayList<>();
        Dog dog1 = new Dog("欧欧", 90);
        Dog dog2 = new Dog("美美",100);
        Dog dog3 = new Dog("丽丽",89);
        Dog dog4 = new Dog("亚亚",99);
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        list.add(dog4);
        //删除操作
        ListIterator<Dog> iterator = list.listIterator();
        while (iterator.hasNext()){
            Dog dog = iterator.next();
            if (dog.equals(dog2) || dog.equals(dog3)){
                iterator.remove();
            }
        }
        for (Dog o : list) {
            System.out.println(o);
        }
        Dog dog5 = new Dog("欧欧", 90);
        System.out.println(list.contains(dog5));


    }
}
