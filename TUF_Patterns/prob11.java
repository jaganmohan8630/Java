public class prob11 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i<n; i++) {
            int count=1;
            if(i%2!=0){
                count=0;
            }
            for (int k = 0; k <=i; k++) {
                System.out.print(count);
                count = 1-count;
                // count = count==1?0:1;
                // count = count==1?count-1:count+1;
            }
            System.out.println();
        }
    }
}
