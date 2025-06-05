public class prob19 {
    public static void main(String[] args) {
        int n=5;
        for (int i = n; i>0; i--) {
            for (int k = 0; k <i; k++) {
                System.out.print("*");
            }
            for (int j = 0; j <n-i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i<=n; i++) {
            for (int k = 0; k <i; k++) {
                System.out.print("*");
            }
            for (int j = 0; j <n-i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
