public class prob46 {
    public static void main(String[] args) {
        int[] a={1,2,4};
        int[] b={1,2,3};
        boolean comparison = true;
        if(a.length==b.length){

            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    comparison =false;
                    break;
                }
            }
        }
        else{
            comparison = false;
        }
        if(comparison){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Not");
        }
    }
}
