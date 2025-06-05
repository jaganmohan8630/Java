public class prob135 {
    public static void main(String[] args) {
        int n=5;
        char c='A';
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print((char)(c+k)+" ");
            }
            System.out.println();
        }
    }
}
