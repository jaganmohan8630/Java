public class prob17 {
    public static void main(String[] args) {
        int n=4;
        for (int i = 0; i<n; i++) {
            char ch = 'A';
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print((char)(ch+k));
            }
            for (int k = 0; k <i; k++) {
                System.out.print((char)(ch+i-k-1));
            }
            System.out.println();
        }
    }
}
