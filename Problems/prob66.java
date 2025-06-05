public class prob66 {
    public static void main(String[] args) {
        int n=24;
        int count = 0;
        for(int i=1;i<=24;i++){
            if(n%i==0){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\nNumber of factors are "+count);
    }
}
