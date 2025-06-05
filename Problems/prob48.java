public class prob48 {
    public static void main(String[] args) {
        int[] a={7,9,8,9,4,1,2,6,6};
        int max=a[0];
        int min=a[0];
        for (int i : a) {
            if(max<i){
                max=i;
            }
            else if(min>i){
                min=i;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
