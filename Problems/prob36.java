import java.util.*;

public class prob36 {
    public static void main(String[] args) {
        int[] a={1,2,3,2,3,4,1,5,6,5,1,6};
        HashSet<Integer> hst = new LinkedHashSet<Integer>();
        for(int i=0;i<a.length;i++){
            if(hst.add(a[i])==false){
                System.out.println(a[i] + " is duplicated");
            }
        }
    }
}