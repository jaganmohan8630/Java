public class B {
    public static void main(String[] args) {//no extra spaces
        int n=7;
        int width = n/2+2;
        for (int i = 0; i < n; i++) {
            System.out.print("B");
            if(i==0 || i==n/2 || i==n-1){
            for(int j=0;j<=width;j++){
                    System.out.print("B");
                }
            }
            else{
                for (int j = 1; j < width-1; j++) {
                    System.out.print("  ");
                }
                System.out.print("B");
            }
            System.out.println();
        }
    }
}
