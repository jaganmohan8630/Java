import java.util.Scanner;
public class prob9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c =sc.next().charAt(0);
        boolean isvowel =false;
        switch(c){
            case 'a':
                isvowel = true;
                break;
            case 'e':
                isvowel = true;
                break;
            case 'i':
                isvowel = true;
                break;
            case 'o':
                isvowel = true;
                break;
            case 'u':
                isvowel = true;
                break;
            case 'A':
                isvowel = true;
                break;
            case 'E':
                isvowel = true;
                break;
            case 'I':
                isvowel = true;
                break;
            case 'O':
                isvowel = true;
                break;
            case 'U':
                isvowel = true;
                break;
        }
        if(isvowel){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
        sc.close();
    }
}
