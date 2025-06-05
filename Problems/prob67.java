public class prob67 {
    public static void main(String[] args) {
        String orignalStatement = "jagan mohan jangam";
        String[] words = orignalStatement.split(" ");
        String finalstatement = "";

        for (String string : words) {
            char[] ca = string.toCharArray();
            char c = ca[0];
            String firstchar = String.valueOf(c).toUpperCase();
            String capitalizedword = firstchar;

            for(int i=1;i<ca.length;i++){
                capitalizedword = capitalizedword + ca[i];
            }
            
            finalstatement = finalstatement + capitalizedword + " ";
        }
        System.out.println(finalstatement);
    }
}
