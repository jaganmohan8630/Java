public class D {
    public static void main(String[] args) {
        int n=7;
        int width =n/2+2;
        for (int i = 0; i < n; i++) {
            System.out.print("D ");
            if(i==0||i==n-1){
                for (int j = 0; j < width-1; j++) {
                    System.out.print("D ");
                }
            }
            else{
                for (int j = 0; j < width-1; j++) {
                    System.out.print("  ");
                }
                System.out.print("D");
            }
            System.out.println();
        }
        
    }
}
