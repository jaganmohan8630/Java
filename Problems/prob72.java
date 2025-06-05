public class prob72 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 50;
        int min = num1<=num2?num1:num2;
        int gcd=1;
        for(int i=1;i<=min;i++){
            if(num1%i==0 && num2%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
