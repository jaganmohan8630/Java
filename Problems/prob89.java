import java.util.Arrays;

public class prob89 {
    public static void main(String[] args) {
        int[] arr={7,9,8,9,4,1,2,6,0,5};
        int size = arr.length;
        for(int i=0;i<3;i++){
            int first = arr[0];
            for(int j=0;j<size-1;j++){
                arr[j]=arr[j+1];
            }
            arr[size-1]=first;
        }
        for (int i : arr) {
            System.out.println(i);        
        }
        System.out.println(Arrays.toString(arr));
    }    
}
