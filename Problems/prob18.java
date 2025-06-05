public class prob18 {
    public static void main(String[] args) {
        int a=28;
        int b=23;
        // M1
        a=a^b;
        b=a^b;
        a=a^b;
        
        //M2
        // a=a+b;
        // b=a-b;
        // a=a-b;
        
        //M3
        // int temp = a;
        // a=b;
        // b=temp;
        System.out.println(a);
        System.out.println(b);
    }
}
