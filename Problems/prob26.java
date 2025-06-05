public class prob26 {
    public static void main(String[] args) {
        String str = "Jagan Mohan";
        String rev = "";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            rev = c + rev;
        }
        System.out.println(rev);
        char ca[] = str.toCharArray();
        rev = "";
        for(int i=0;i<str.length();i++){
            rev = ca[i] + rev;
        }
        System.out.println(rev);
    }
}
