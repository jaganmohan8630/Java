public class prob37 {
    public static void main(String[] args) {
        int n=1234,count=0;
        while (n!=0) {
            n/=10;
            count++;
        }
        n=1234;
        System.out.println(count);
        int waytocount = (int)Math.log10(n)+1;
        System.out.println(waytocount);
        // String str = "This is Jagan";
        // String[] str2=str.split(" ");
        // for(String i:str2){
        //     System.out.println(i);
        // }
    }
}
