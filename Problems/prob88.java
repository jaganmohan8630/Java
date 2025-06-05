public class prob88 {
    public static void main(String[] args) {
        int[] arr={7,9,8,9,4,1,2,6,0,5};
        int size = arr.length;
        int first = arr[0];
        for(int i=0;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        arr[size-1]=first;
        for (int i : arr) {
            System.out.println(i); 
        }
    }
}
