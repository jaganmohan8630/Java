public class prob86 {
    public static void main(String[] args) {
        int[] arr={7,9,8,9,4,1,2,6,0,6};
        int size =arr.length;
        int last = arr[size-1];
        for(int i=size-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
