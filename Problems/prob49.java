public class prob49 {
    public static void main(String[] args) {
        int[] a={7,9,8,9,4,1,2,6,0,6};
        int num = 9;
        boolean found = false;
        for (int i=0;i<a.length;i++) {
            if(num==a[i]){
                System.out.println(a[i]);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("It is not found in the array");
        }
    }
}
