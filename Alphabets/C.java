public class C {
    public static void main(String[] args) {
        int n=7;
        int width =n/2+2;
        for(int i=0;i<7;i++){
            if(i==0|| i== n-1){
                System.out.print(" ");
                for(int j=0;j<width;j++){
                    System.out.print("C ");
                }
            }
            else{
                System.out.print("C ");
            }
            System.out.println();
        }
    }
}
