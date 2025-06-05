public class prob87 {
    public static void main(String[] args) {
        int[] arr={7,9,8,9,4,1,2,6,0,5};
        int size = arr.length;
        // int secondlast = arr[size-2];
        // int thirdlast = arr[size-3];
        for(int j=0;j<3;j++){
            int last = arr[size-1];
            for(int i=size-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=last;
        }
        // arr[0]=thirdlast;
        // arr[1]=secondlast;
        // arr[2]=last;
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
