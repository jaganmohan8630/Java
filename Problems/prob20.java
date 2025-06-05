public class prob20 {
    public static void main(String[] args) {
        int n=1234;
        int sum=0;
        while (n!=0) {
            int b=n%10;
            sum+=b;
            n/=10;
        }
        System.out.println(sum);
    }
}
