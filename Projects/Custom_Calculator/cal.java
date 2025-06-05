import java.util.Scanner;

class byzero extends Exception{
    @Override
    public String toString(){
        return "Division by Zero Not allowed";
    }
}
class maxinput extends Exception{
    @Override
    public String toString(){
        return "Max input";
    }
}
class maxmultiplier extends Exception{
    @Override
    public String toString(){
        return "Max Multiplier";
    }
}
public class cal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        String c= sc.next();
        int b= sc.nextInt();
    try {
        if(a>100000 || b>100000){
            throw new maxinput();
        }
        
        switch ((c)) {
            case "+":
            System.out.println(a+b);
            break;
            case "-":
                System.out.println(a-b);
                break;
                case "*":
                if(a>7000|| b>7000){
                    throw new maxmultiplier();
                }
                System.out.println(a*b);
                break;

                case "/":
                if(b==0){
                    throw new byzero();
                }
                System.out.println(a/b);
                break;

                default:
                System.out.println("Invalid Input");
                break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();

    }
}
