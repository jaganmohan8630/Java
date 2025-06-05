public class prob104 {
    public static void main(String[] args) {
        String str = "jaganmohan";
        int size=str.length();
        char[] ca=str.toCharArray();
        for(int j=0;j<3;j++){
            char last = ca[size-1];
            for(int i=size-1;i>0;i--){
                ca[i]=ca[i-1];
            }
            ca[0] = last;
        }
        System.out.println(ca);
    }
}
