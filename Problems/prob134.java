public class prob134 {
    public static void main(String[] args) {
        int n=5;
        char c= 'A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(c+i)+" ");
            }
            System.out.println();
        }
    }
}
