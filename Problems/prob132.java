public class prob132 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print(k);
                if(k==1){
                    for(k=1;k<i;k++){
                        System.out.print(k+1);
                    }
                    break;
                }
            }
            System.out.println();
        }
    }
}
