public class prob42 {
    public static void main(String[] args) {
        int []a={7,9,8,9,4,1,2,6,0,6};
        for (int i : a) {
            if(i%2==0){
                System.out.print(i);
            }
        }
        System.out.println();
        for (int i : a) {
            if(i%2!=0){
                System.out.print(i);
            }
        }
    }
}
