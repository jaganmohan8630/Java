public class G {
    public static void main(String[] args) {
        int n=7;
        int width=n/2+2;
        for (int i = 0; i < n; i++) {
            System.out.print("G ");
            if(i==0 || i==n-1){
                for (int j = 0; j < width; j++) {
                    System.out.print("G ");
                }
            }
            else{
                for (int j = 0; j < width-1; j++) {
                    System.out.print("  ");
                }
                if((i>=width-2 && i<=width) || i==n/2){
                    System.out.print("G");
                }
            }
            System.out.println();
        }
    }
}
