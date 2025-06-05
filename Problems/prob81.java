public class prob81 {
    public static void main(String[] args) {
        String str = "One Three";
        int size = str.length();
        for(int i=3;i>=1;i--){
            System.out.print(str.charAt(size-i));
        }
        System.out.println();
        System.out.println(str.substring(size-3, size));
    }
}
