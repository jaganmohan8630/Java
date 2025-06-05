import java.util.Scanner;

public class prob79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int dividend = a/b;
        int remainder = a-(a/b*b);
        System.out.println(remainder);
        sc.close();
    }
}