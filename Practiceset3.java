public class Practiceset3 {
    public static void main(String[] args) {
        // question1
        String name = "Sumant";
        System.out.println(name);
        System.out.println(name.toLowerCase());
        // questin 2
        String name1 = "Sum ant";
        System.out.println(name1);
        System.out.println(name1.replace(" ", "_"));
        // questin 3
        String letter = "Dear " + name + ", Thanks a lot";
        System.out.println(letter);
        // questin 4
        String space = "This is  double space this is triple    space";
        System.out.println(space.indexOf("  "));
        System.out.println(space.indexOf("   "));
        // questin 5
         String a = "\"Dear "+ " name " + " This java is course is very nice \"";
        System.out.println(a.replace("name", "SUMANT"));
    }
}