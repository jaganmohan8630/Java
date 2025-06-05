public class prob98 {
    public static void main(String[] args) {
        int[] arr1={7,9,8,9,4,1,2,6,0,5};
        int num=9;
        for (int i = 0; i < arr1.length; i++) {
            if(num==arr1[i]){
                System.out.println("Index is "+i);
                break;
            }
        }
    }
}
