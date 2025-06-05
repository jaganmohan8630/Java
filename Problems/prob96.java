public class prob96 {
    public static void main(String[] args) {
        int n=100,count=0;
        for(int i=1;i<=n;i++){
            count=0;
        for(int j=1;j<=i;j++){
            if(i%j==0){
                count++;
            }
        }
            if(count==2){
                System.out.println(i);
            }
        }
    }
}
