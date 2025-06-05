public class I {
    public static void main(String[] args) {
        int n=7;
        int width = n/2+2;
        for (int i = 0; i < n; i++) {
            if(i==0 || i==n-1){
                for (int j = 0; j < width; j++) {
                    System.out.print("I ");
                }
            }
            else{
                for (int j = 0; j < width/2; j++) {
                    System.out.print("  ");
                }
                System.out.print("I");
            }
            System.out.println();
        }
    }
}
