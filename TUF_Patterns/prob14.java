public class prob14 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i<n; i++) {
            char ch = 'A';
            for (int k = 0; k <=i; k++) {
                System.out.print((char)(ch+k)+" ");
            }
            System.out.println();
        }
    }
}
