import java.util.Scanner;
public class numberguessinggame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cmp=(int)(Math.random()*100);
        int count=0;
        while(true){
            int num = sc.nextInt();
            count++;
            if(num==cmp){
                System.out.printf("You guessed in %d guesses",count);
                break;
            }
            else if(num>cmp){
                System.out.println("Smaller number please");
            }
            else if(num<cmp){
                System.out.println("bigger number please");
            }
            
        }

    }
}
