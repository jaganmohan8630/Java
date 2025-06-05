public class prob102 {
    public static void main(String[] args) {
        String str = "jaganmohan";
        int size =str.length();
        //left rotate
        char[] ca=str.toCharArray();
        for(int i=0;i<3;i++){
            char first = ca[0];
            for (int j = 0; j <size-1; j++) {
                ca[j] = ca[j+1];
            }
            ca[size-1]=first;
        }
        System.out.println(ca);
    }
}
