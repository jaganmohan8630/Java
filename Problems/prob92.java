import java.util.HashSet;

public class prob92 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,6,7,8,9};
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hash.add(arr1[i]);
            hash.add(arr2[i]);
        }
        System.out.println(hash);
    }
}
