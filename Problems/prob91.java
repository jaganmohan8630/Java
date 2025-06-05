import java.util.Arrays;

public class prob91 {
    public static void main(String[] args) {
        int[] arr1={7,9,8,9,4,1,2,6,0,5};
        int[] arr2={4,1,2,6,0,5,7,9,8,9};
        int[] arr = new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            arr[i]=arr1[i]*arr2[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
