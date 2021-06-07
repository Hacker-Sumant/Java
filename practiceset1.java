import java.util.Scanner;

public class practiceset1 {
   public static void main(String[] args) {
      // question1
      int a = 45;
      int b = 89;
      int c = 565;
      System.out.println(a + b + c + " Sum is here");

      // question 2

      float subject1 = 89;
      float subjet2 = 87;
      float subjet3 = 45;
      float cgpa = (subject1 + subjet2 + subjet3) / 30;
      System.out.println(cgpa);

      // question3
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name");
      String name = sc.nextLine();
      System.out.println("Hello " + name + " have a good day");

      // question 4
      // float km = 58;
      // System.out.println(km/0.621);

      // question5
      System.out.println("enter your number");
      Scanner cj = new Scanner(System.in);
      System.out.println(cj.hasNextInt());

   }

}