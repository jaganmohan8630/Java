import java.util.Arrays;
import java.util.Collections;

public class prob141 {
    public static void main(String[] args) {
        Integer[] arr = {1,3,5,7,8,2,4,6,8,9};
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

    }
}
