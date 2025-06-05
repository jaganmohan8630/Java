package Right_Triangle;
public class differenttriangle {
    public static void main(String[] args) {
        int n=6;
        int sum=1;
        int count =n;
        for (int i = 1; i <=n ; i++) {
            int k=sum;
            for (int j = i; j>0; j--) {
                System.out.print(sum+" ");
                sum=sum-n+j-1;
            }
            sum=k;
            sum+=count;
            count--;
            System.out.println();
        }
    }
}