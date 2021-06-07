import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Scanner;

public class Ask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number");
        int n = sc.nextInt();
        System.out.println("Here id the prime factor");
        for(int i = 1; i<=n; i++  ){
            if(n%i == 0  ){
                System.out.println(i);
            }
        }
    }
}
