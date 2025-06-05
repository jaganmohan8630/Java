public class prob54 {
    public static void main(String[] args) {
        String jjm="J a g a n  M o h a n";
        
        // M1
        // char space = ' ';
        // int spacecount =0;
        // for(int i=0;i<jjm.length();i++){
        //     if(jjm.charAt(i)==space){
        //         spacecount++;
        //     }
        // }
        // System.out.println(spacecount);

        //M2
        int before = jjm.length();
        int after = jjm.replaceAll(" ", "").length();
        System.out.println(before-after);

    }
}
