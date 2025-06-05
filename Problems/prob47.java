public class prob47 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,6};
        int sumwhenmissing=0;
        int sum=0;
        for(int i:a){
            sumwhenmissing+=i;
        }
        for(int i = 1;i<=6;i++){
            sum+=i;
        }
        System.out.println("missing number is "+(sum-sumwhenmissing));
    }
}
