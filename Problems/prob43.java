public class prob43 {
    public static void main(String[] args) {
        int n=1234;
        int rev=0;
        while (n!=0) {
            int b=n%10;
            rev = rev*10 + b;
            n/=10;
        }
        System.out.println(rev);
    }
}
