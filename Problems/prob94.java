import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class prob94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();
        try{
            InetAddress ip = InetAddress.getByName(website);
            System.out.println("Ip address is "+ip);
        }
        catch(UnknownHostException e){
            System.out.println("website not found");
        }
        sc.close();
    }
}
