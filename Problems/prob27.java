public class prob27 {
    public static void main(String[] args) {
        String str = "boby";
        String rev = "";
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            rev = c+rev;
        }
        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
