public class prob38 {
    public static void main(String[] args) {
        int n=1234,sum=0;
        while (n!=0) {
            int b=n%10;
            sum+=b;
            n/=10;
        }
        System.out.println(sum);
    }
}
