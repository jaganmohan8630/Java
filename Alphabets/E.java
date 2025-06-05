public class E {
    public static void main(String[] args) {
        int n=7;
        int width =n/2+2;
        for (int i = 0; i < 7; i++) {
            if(i==0 || i==n/2 || i==n-1){
            for(int j=0;j<width;j++){
                    System.out.print("E ");
                }
            }
            else{
                System.out.print("E");
            }
            System.out.println();
        }
    }
}
