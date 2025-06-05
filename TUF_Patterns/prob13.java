public class prob13 {
    public static void main(String[] args) {
        int n=5;
        int count =1;
        for (int i = 0; i<n; i++) {
            for (int k = 0; k <=i; k++) {
                System.out.printf("%3d",count);
                count++;
            }
            System.out.println();
        }
    }
}
