//hashset

// import java.util.HashSet;
// import java.util.Set;
import java.util.*;
public class prob33 {
    public static void main(String[] args) {
        int[] a={7,9,8,9,4,1,2,6,0,6};
        Set<Integer> set = new LinkedHashSet<Integer>();
        //note:when we use Hashset it maintains ascending order by rearranging as now we are using LinkedHashSet it results without rearrangement
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        set.toArray();
        for(int i:set){
            System.out.println(i);
        }
    }
}
