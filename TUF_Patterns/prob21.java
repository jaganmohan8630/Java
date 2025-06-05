public class prob21 {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i<2*n; i++) {
            if(i%2==0){
                System.out.println();
            }
            else{
                for (int j = 1; j <=n; j++) {
                    if(i==1 || i==2*n-1){
                        System.out.print("*");
                    }
                    else{
                        if(j==1 || j==n){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
