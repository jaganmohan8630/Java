import java.util.Scanner;

public class prob78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        int size =words.length;
        if(size>1){
            System.out.println(words[size-2]);
        }
        else{
            System.out.println("The String contains only one word");
        }
        sc.close();
    }
}
