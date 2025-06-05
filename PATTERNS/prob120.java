public class prob120 {
    public static void main(String[] args) {
        int n=5;
        for(int i =5;i>=0;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                if(i==5 || k==0 || k==2*i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
