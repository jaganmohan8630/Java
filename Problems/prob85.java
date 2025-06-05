import java.util.ArrayList;
import java.util.HashSet;

public class prob85 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.size());
        int[] arr = {1,2,7,3};
        HashSet<Integer> hash = new HashSet<>();
        for (int i : arr) {
            hash.add(i);
        }
        System.out.println(hash);
    }
}
