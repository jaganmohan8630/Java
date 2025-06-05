public class prob24 {
    public static void main(String[] args) {
        String jjm = "This is Jagan Mohan # roll_number : 28".toLowerCase();
        int lettercount = 0;
        int digitcount = 0;
        int spacescount = 0;
        int othercount = 0;
        // for(int i =0;i<jjm.length();i++){
        //     char c=jjm.charAt(i);
        //     if(c>='a' && c<='z'){
        //         lettercount++;
        //     }
        //     else if(c>='0' && c<='9'){
        //         digitcount++;
        //     }
        //     else if(c==' '){
        //         spacescount++;
        //     }
        //     else{
        //         othercount++;
        //     }
        // }
        //M2
        char[] str = jjm.toCharArray();
        for(Character i:str){
            if(Character.isLetter(i)){
                lettercount++;
            }
            else if(Character.isDigit(i)){
                digitcount++;
            }
            else if(Character.isSpaceChar(i)){
                spacescount++;
            }
            else{
                othercount++;
            }
        }
        System.out.println(lettercount);
        System.out.println(digitcount);
        System.out.println(spacescount);
        System.out.println(othercount);
    }
}
