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
        String substring1 = name.substring(1,3);
        String replace = name.replace('S', 'P');
        System.out.println("This is the length of sumant " + value);
        System.out.println("This is the length of sumant " + lower);
        System.out.println("This is the lowercase of sumant " + upper);
        System.out.println("This is the trim of sumant " + trim);
        System.out.println("This is the substring of sumant " + substring);
        System.out.println("This is the substring of sumant " + substring1);
        System.out.println("This is the replace of sumant " + replace);
    }
}
