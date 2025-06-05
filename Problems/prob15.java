import java.util.Scanner;
public class prob15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum=0;
        for(int i=1;i<=6;i++){
            float a = sc.nextInt();
            sum+=a;
        }
        System.out.println(sum);
        System.out.println(sum/6);
        sc.close();
    }
}
