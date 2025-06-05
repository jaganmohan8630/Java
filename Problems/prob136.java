public class prob136 {
    public static void main(String[] args) {
        int n=5;
        char c='A';
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print((char)(c+j)+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)(c+j)+" ");
            }
            System.out.println();
        }
    }
}
