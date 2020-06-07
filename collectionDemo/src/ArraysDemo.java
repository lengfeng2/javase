import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,3,4,5};
//        List<int[]> ints = Arrays.asList(arr);
        List<Integer> asList = Arrays.asList(1, 2, 3, 5, 6);

        Object[] objects = asList.toArray();
    }
}
