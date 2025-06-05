import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class prob74 {
    public static void main(String[] args) {
        Integer[] a={1,2,3,4,5,6,7};
        List<Integer> list = Arrays.asList(a);
        Collections.reverse(list);
        System.out.println(list);
    }
}
