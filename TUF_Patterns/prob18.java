public class prob18 {
    public static void main(String[] args) {
        int n=5;
        char ch = 'E';
        for (int i = 0; i<n; i++) {
            for (int k = 0; k <=i; k++) {
                System.out.print((char)(ch+k)+" ");
            }
            System.out.println();
            ch = (char)(ch-1);
        }
    }
}
