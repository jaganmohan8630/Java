public class prob53 {
    public static void main(String[] args) {
        String jjm="J    a g a n  M o h a n";
        jjm=jjm.replaceAll(" ", "");
        System.out.println(jjm);
        String str2=jjm.replaceAll("\\s", "");
        System.out.println(str2);
    }
}
