public class string {
    public static void main(String[] args) {
        String name = "Sumant";
        String name1 = "                  Sumant             ";
        System.out.println("Name == " + name);
        int value = name.length();
        String lower = name.toLowerCase();
        String upper = name.toUpperCase();
        String trim = name1.trim();
        String substring = name.substring(3);
        String substring1 = name.substring(1, 3);
        String replace = name.replace('S', 'P');
        System.out.println("This is the length of sumant " + value);
        System.out.println("This is the length of sumant " + lower);
        System.out.println("This is the lowercase of sumant " + upper);
        System.out.println("This is the trim of sumant " + trim);
        System.out.println("This is the substring of sumant " + substring);
        System.out.println("This is the substring of sumant " + substring1);
        System.out.println("This is the replace of sumant " + replace);
        System.out.println("startsWith " + name.startsWith("Su"));
        System.out.println("endsWith " + name.endsWith("Su"));
        System.out.println("charAt " + name.charAt(5));
        System.out.println("indexOf m " + name.indexOf("m"));
        System.out.println("indexOf m " + name.indexOf("m", 1));
        System.out.println("lastIndexOf m " + name.lastIndexOf("m"));
        System.out.println("lastIndexOf m " + name.lastIndexOf("m", 4));
        System.out.println("Equal to sumant  " + name.equals("harry"));
        System.out.println("Equal to sumant  " + name.equals("Sumant"));
        System.out.println("Equal to sumant  " + name.equalsIgnoreCase("SUMANT"));
        System.out.println("I am escape sequence \" Sumant ");
        System.out.println("I am escape sequence \\ Sumant ");
        System.out.println("I am escape sequence \n Sumant ");
        System.out.println("I am escape sequence \t Sumant ");
        System.out.println("I am escape sequence \' Sumant ");
        System.out.println("I am escape sequence \b Sumant ");
        System.out.println("I am escape sequence \r Sumant ");
        System.out.println("I am escape sequence \f Sumant ");
    }
}