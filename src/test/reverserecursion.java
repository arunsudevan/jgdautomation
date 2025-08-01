package test;

public class reverserecursion {
	
	    public static String reverse(String str) {
	        if (str.isEmpty())
	            return str;
	        return reverse(str.substring(1)) + str.charAt(0);
	    }

	    public static void main(String[] args) {
	        String input = "Hello";
	        String result = reverse(input);
	        System.out.println("Reversed string: " + result);
	    }
	}


