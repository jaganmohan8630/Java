public class outerdiamond {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i<n; i++) {
                for (int j = 0; j < n-i; j++) {
                    System.out.print("*");
                }
                for (int k = 0; k < 2*i; k++) {
                    System.out.print(" ");
                }
                for (int l = 0; l < n-i; l++) {
                    System.out.print("*");
                }
                System.out.println();
        }
        for (int i = 1; i<=n; i++) {
                for (int j = 0; j <i; j++) {
                    System.out.print("*");
                }
                for (int k = 2*(n-i); k>0; k--) {
                    System.out.print(" ");
                }
                for (int l = 0; l <i; l++) {
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}
