public class prob101 {
    public static void main(String[] args) {
        String str = "jaganmohan";
        char[] ca = str.toCharArray();
        int size = str.length();
        char first = ca[0];
        for (int i = 0; i <size-1; i++) {
            ca[i]=ca[i+1];
        }
        ca[size-1]=first;
        System.out.println(ca);
    }
}
