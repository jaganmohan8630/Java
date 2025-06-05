import java.util.Scanner;

public class prob93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        char c= sc.next().charAt(0);
        double b=sc.nextInt();
        double result=0;
        switch (c) {
            case '+':
                result=a+b;
                break;
            case '-':
                result=a-b;
                break;
            case '*':
                result=a*b;
                break;
            case '/':
                result=a/b;
                break;
            case '%':
                result=a%b;
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        System.out.println(a+" "+c+" "+b+" ="+" "+result);
        sc.close();
    }
}
