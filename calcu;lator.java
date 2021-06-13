import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Press 1 to Find addition ");
        System.out.println("Press 2 to Find subtract ");
        System.out.println("Press 3 to Find multiply ");
        System.out.println("Press 4 to Find divide ");
        System.out.println("Press 5 to Find Remainder ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        System.out.println("Enter operation to be done");
        int c = sc.nextInt();

        if (c == 1) {
            System.out.println(a + b + " Addition ");
        }
        if (c == 2) {
            System.out.println(a - b + " Subtract ");
        }
        if (c == 3) {
            System.out.println(a * b + " Multiply ");
        }
        if (c == 4) {
            System.out.println(a % b + " Divide ");
        }
        if (c == 5) {
            System.out.println(a % b + " Remainder ");
        }
        if (c > 5) {
            System.out.println("You have not entred the number under scope");
        }
    }
}