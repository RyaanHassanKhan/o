public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        String rev = reverse(str);
        System.out.println("The reverse of str \"" + str + "\" is \"" + rev + "\"");
    }

    // Method to reverse a string
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}

