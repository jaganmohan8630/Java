public class prob133 {
    public static void main(String[] args) {
     char c = 'A';
     int n=5;
     for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print((char)(c+j)+" ");
        }
        System.out.println();
     }   
    }
}
