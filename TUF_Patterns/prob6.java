public class prob6 {
    public static void main(String[] args) {
        int n=5;
        for (int i = n; i>0; i--) {
            for (int j = 0; j <i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
