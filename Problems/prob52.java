public class prob52 {
    public static void main(String[] args) {
        String str ="$131#@% $abcd123 ABCDEF()";
        str = str.replaceAll("[^a-zA-Z0-9]", "");//by using ^ you can replace elements other than a-z,A-Z,0-9 with ""
        // str = str.replaceAll("[a-zA-Z0-9]", "");
        System.out.println(str);
    }
}
