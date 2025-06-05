package Right_Triangle;

public class type {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {
            int a=i;
            for (int j = 1; j <=i; j++) {
                System.out.print(a);
                a=a+n-j;
            }
            System.out.println();
        }
    }
}
