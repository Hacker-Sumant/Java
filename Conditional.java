public class Conditional {
    public static void main(String[] args) {
        int a = 19;
        if(a>18)System.out.println("You can drive");
        else System.out.println("You cannot drive");
        

        System.out.println("And part");
        System.out.println();

        boolean b = true;
        boolean c = false;

        if(c&&b) System.out.println("Yes");
        else System.out.println("No");

        System.out.println("Or part ");
        System.out.println();

        if(c||b)System.out.println("yes");
        else System.out.println("No");



        System.out.println("Not part ");
        System.out.println();
    
        if(c!=b)System.out.println("yes");
        else System.out.println("No");
    }
}
