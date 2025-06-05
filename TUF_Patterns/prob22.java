public class prob22 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int ans = Math.min(Math.min(i,j),Math.min(2*n-i-2, 2*n-j-2));
                System.out.print(n-ans);
            }
            System.out.println();
        }
    }
}
