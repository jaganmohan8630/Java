public class prob55 {
    public static void main(String[] args) {
        String str="This is Jagan Mohan";
        String[] str2=str.split(" ");
        // for (String string : str2) {
        //     System.out.println(string);
        // }
        String reversedstring = "";
        for(int i=0;i<str2.length;i++){
            String rev = "";
            String k = str2[i];
            for(int j=0;j<str2[i].length();j++){
                rev = k.charAt(j) + rev;
            }
            // System.out.print(rev +" ");
            reversedstring+=rev+" ";
        }
        System.out.println(reversedstring);
    }
}
