import java.util.Scanner;
public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter rock or paper or scissors: ");
        String str = sc.next();
        String arr[] = {"rock","paper","scissors"};

        int comp = (int)(Math.random()*3);
        String result;
        String compresult = arr[comp];
        System.out.println(compresult);
    switch (str) {
        case "rock":
            if(compresult.equals("rock")){
                result = "TIE";
            }
            else{
                result = (compresult.equals("scissors"))?"You Win":"You lose";
            }
            break;
            
        case "paper":
            if(compresult.equals("paper")){
                result = "TIE";
            }
            else{
                result = (compresult.equals("rock"))?"You Win":"You lose";
            }
            break;
        case "scissors":
            if(compresult.equals("scissors")){
                result = "TIE";
            }
            else{
                result = (compresult.equals("paper"))?"You Win":"You lose";
            }
                break;
            default:
                result = "Error..";
                break;
    }
        System.out.println(result);
    }
}
