public class Hardsquare {
    public static void main(String[] args) {
    //Method-1
        int n=5 ;
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int top = i;
                int left = j;
                int right = 2*n-1-1-j;
                int down = 2*n-1-1-i;
                System.out.print(n-Math.min(Math.min(top, left), Math.min(right, down))+"");
            }
            System.out.println();
        }
    
    //Method-2
        // int n=4;
        // int size = 2*n-1;
        // int start = 0;
        // int end = size-1;
        // int[][] arr = new int[size][size];
        // while (n!=0) {
        //     for (int i = start; i <=end; i++) {
        //         for (int j = start; j <=end; j++) {
        //             if(i==start || j==start || i==end || j==end){
        //                 arr[i][j]=n;
        //             }
        //         }
        //     }
        //     ++start;
        //     --end;
        //     --n;
        // }
        // for (int i = 0; i < size; i++) {
        //     for (int j = 0; j < size; j++) {
        //         System.out.print(arr[i][j]);
        //     }
        //     System.out.println();
        // }
    }
}
