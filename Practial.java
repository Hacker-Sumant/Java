import java.util.Scanner;

public class Practial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int count = 0;
        for (int i = 1; i <= a; i++) {
            System.out.println("Enter your number");
            int b = sc.nextInt();
            if (b % 2 == 0 && i < 10) {
                count = ++count;
            }
            if (count > 3) {
                break;
            } else {
                System.out.print("");
            }
        }
        System.out.println("Loop Exit");
    }
}