public class H {
    public static void main(String[] args) {
        int n=7;
        int width =n/2+2;
        for (int i = 0; i < n; i++) {
            System.out.print("H");
            if(i==n/2){
                for (int j = 0; j < width; j++) {
                    System.out.print("H ");
                }
            }
            else{
                for (int k = 0; k < width-1; k++) {
                    System.out.print("  ");
                }
                System.out.print("H");
            }
            System.out.println();


        }
    }
}
