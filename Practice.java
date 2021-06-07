import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first subject mark");
        int a = sc.nextInt();
        System.out.println("Enter your second subject mark");
        int b = sc.nextInt();
        System.out.println("Enter your third subject mark");
        int c = sc.nextInt();
        System.out.println("Enter your fourth subject mark");
        int d = sc.nextInt();
        System.out.println("Enter your fifth subject mark");
        int e = sc.nextInt();
        int sum = a+b+c+d+e;
        System.out.println(sum);
        if(sum<=500){
             float percentage = sum*100/500;
            System.out.println( percentage +"%" + " Here is your total subject marks");
        }else{
            System.out.println("You have entred the number greater than 500");

        }
    }
}