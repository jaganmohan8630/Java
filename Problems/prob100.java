import java.util.*;

public class prob100 {
    public static void main(String[] args) {
        String str = "Jagan Mohan";
        Set <Character> set = new LinkedHashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        // System.out.println(set);
        for (Character character : set) {
                System.out.print(character);
        }
    }
}
