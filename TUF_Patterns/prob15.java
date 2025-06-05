public class prob15 {
    public static void main(String[] args) {
        int n=5;
        for (int i = n-1; i>=0; i--) {
            char ch = 'A';
            for (int k = 0; k <=i; k++) {
                System.out.print((char)(ch+k)+" ");
            }
            System.out.println();
        }
    }
}
