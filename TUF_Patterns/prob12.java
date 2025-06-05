public class prob12 {
    public static void main(String[] args) {
        int n=4;
        for (int i = 0; i<n; i++) {
            for (int k = 0; k <=i; k++) {
                System.out.print(k+1);
            }
            for (int j = 1; j <n-i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print(i+1-k);
            }
            System.out.println();
        }
    }
}
