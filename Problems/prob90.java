import java.util.Arrays;

public class prob90 {
    public static void main(String[] args) {
        int[] arr={7,9,8,9,4,1,2,6,0,5};
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
