import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class prob77 {
    public static void main(String[] args) {
        String str ="This is Jagan Mohan";
        String[] words = str.split(" ");
        List<String> list = Arrays.asList(words);
        Collections.reverse(list);
        for(String i:list){
            System.out.print(i+" ");
        }
    }
}
