import java.text.SimpleDateFormat;
import java.util.*;
public class prob61 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss.SSS");
        String formatteddate = sdf.format(date);
        System.out.println(date);
        System.out.println(formatteddate);
    }
}
