import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        
        System.out.println("See you Experienced java program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        /*
        if (age > 56)
            System.out.println("Your Are Experienced");
        else if (age > 46)
            System.out.println("Your are semi Experienced");
        else if (age > 36)
            System.out.println("Your are semi-semi Experienced");
        else
            System.out.println("You are not Experienced");
            */
        switch (age) {
            case 18:
                System.out.println("You are going to become an adult");
                break;
            case 21:
            System.out.println("You are going collage");
            break;
            case 60:
            System.out.println("you are going to retire");
            default:
            System.out.println("Enjoy your life");
                break;
        }    
    }
}
