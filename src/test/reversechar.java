package test;

public class reversechar {
	
	    public static void main(String[] args) {
	        String input = "Hello";
	        char[] chars = input.toCharArray();

	        for (int i = chars.length - 1; i >= 0; i--) {
	            System.out.print(chars[i]);
	        }
	    }
	}

