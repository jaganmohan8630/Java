public class J {
    public static void main(String[] args) {
        int n=6;
        int width=n/2+2;
        for (int i = 0; i < n; i++) {
            if(i==0){
            for (int j = 0; j < width; j++) {
                    System.out.print("J");
                }
            }
            else{
                if(i==3||i==4){
                    // for (int j = 0; j < width/2; j++) {
                    //     System.out.print(" ");
                    // }
                    System.out.print("J");
            
                }
                if(i==5){
                    for (int j = 0; j < width/2+1; j++) {
                        System.out.print("J");
                    }
                }
                else{
                    for (int j = 0; j < width/2; j++) {
                        System.out.print(" ");
                    }
                }
                System.out.print("J");
            }
            System.out.println();
        }
    }
}
