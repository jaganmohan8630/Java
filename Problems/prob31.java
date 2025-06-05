public class prob31 {
    public static void main(String[] args) {
        int n = 153;
        int sum= 0,count=0;
        int j=n;
        while (n!=0) {
            n/=10;
            count++;
        }
        n=j;
        while (n!=0) {
            int b=n%10;
            sum+=(int)(Math.pow(b, count));
            n/=10;
        }
        if(sum==j){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not");
        }

    }
}
