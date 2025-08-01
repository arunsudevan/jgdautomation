package test;

public class StringPoolExample {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        System.out.println(str1 == str2); // Line 1
        System.out.println(str1 == str3); // Line 2
        System.out.println(str3 == str4); // Line 3
        System.out.println(str1.equals(str3)); // Line 4
    }
}

 