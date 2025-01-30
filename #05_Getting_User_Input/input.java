import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sce = new Scanner(System.in);
        System.out.println(sce);
        System.out.println("Enter a number");
        int a =sce.nextInt();
        System.out.println(a);
        System.out.println("Enter a number");
        int b =sce.nextInt();
        System.out.println(b);

        System.out.println(a+b);
    }
}