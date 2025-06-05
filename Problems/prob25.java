public class prob25 {
    public static void main(String[] args) {
        int n=7;
        int fib = 0;
        int a=1,b=1;
        System.out.print(fib);   
        System.out.print(a);   
        System.out.print(b);   
        while (fib<=n) {
            fib = a+b;
            System.out.print(fib);   
            a=b;
            b=fib;
        }
    }
}
