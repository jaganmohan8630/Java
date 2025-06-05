//to remove duplicetes in a sorted array
public class prob34 {
    public static void main(String[] args) {
        int[] a={1,2,2,3,3,3,4,4,4,5,5,5,5,5};
        int j=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                a[j]=a[i];
                j++;
            }
        }
        a[j]=a[a.length-1];
        for (int i=0;i<=j;i++) {
            System.out.println(a[i]);
        }
    }
}
/*import java.util.HashSet;

public class RemoveDuplicatesUnsortedArray {
    public static void main(String[] args) {
        int[] a = {4, 2, 3, 5, 2, 3, 1, 5, 4, 6}; // Unsorted array
        HashSet<Integer> uniqueElements = new HashSet<>();

        for (int num : a) {
            uniqueElements.add(num); // HashSet ensures uniqueness
        }

        // Print unique elements
        for (int num : uniqueElements) {
            System.out.print(num + " ");
        }
    }
}
 */
