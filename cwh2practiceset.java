import java.util.Scanner;
public class cwh2practiceset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = 7/4*9/2;
        System.out.println(a);

        char b = 'B';
        b = (char)(b+9);
        b = (char)(b-9);
        System.out.println(b);

        int num = 78;
        System.out.println("Enter your number");
        int enternumber = sc.nextInt() ;
        System.out.println(enternumber>=num);
        // if(enternumber<num){
        //     System.out.println("Number which you have entred is lesser");
        // }else{
        //     System.out.println("Number which you have entred is Greater");
        // }
        int x = 7*49/7 + 35/7;
        System.out.println(x);
    }
}
