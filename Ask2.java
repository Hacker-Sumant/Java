import java.util.Scanner;

public class Ask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int j = sc.nextInt();
        System.out.println("Enter power");
        int k = sc.nextInt();
        System.out.println("Answer is here");
        int product = 1;
        for(int i = 1;i<=k;i++){
            product= product*j;
        }
        System.out.println(product);
    }
}
