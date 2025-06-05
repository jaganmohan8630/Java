public class prob28 {
    public static void main(String[] args) {
        int n=1221;
        int c=n;
        int rev=0;
        while (n!=0) {
            int b=n%10;
            rev = rev*10 + b;
            n/=10;
        }
        System.out.println(rev);
        n=c;
        if(n==rev){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not");
        }
    }
}
