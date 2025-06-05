public class prob137 {
    public static void main(String[] args) {
        int n=5;
        char c='A';
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                if(k==0 || k==2*i){
                    System.out.print(c);
                }
                else{
                    System.out.print(" ");
                }
            }
            c++;
            System.out.println();
        }
        c--;
        for(int i=n-2;i>=0;i--){
            c--;
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                if(k==0 || k==2*i){
                    System.out.print(c);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}