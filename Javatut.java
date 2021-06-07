import java.util.Scanner;

public class Javatut{
    public static void main(String[] args) {
            // printing hello world
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number");
            int n = sc.nextInt();
            
            System.out.println("Here is your number");
            for(int i = 1; i<= n; i++  ){
                System.out.println(i);
            }
    }
}
