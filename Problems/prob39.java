public class prob39 {
    public static void main(String[] args) {
        int n=12345;
        int oddcount = 0;
        int evencount = 0;
        while (n!=0) {
            int b=n%10;
            if(b%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
            n/=10;
        }
        System.out.println(oddcount);
        System.out.println(evencount);
    }
}
