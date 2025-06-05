import java.util.Arrays;

public class prob51 {
    public static void main(String[] args) {
        int[] a={7,9,8,9,4,1,2,6,0,6};
        System.out.println("original array: "+Arrays.toString(a));
        System.out.println("Sorted array(using inbuilt function):");
        Arrays.parallelSort(a);
        System.out.println(Arrays.toString(a));

                for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) { // Swap if current element is smaller
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
