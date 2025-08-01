package test;

public class palindrome {

	public static void main(String[] args) {
		
                String input = "appa";
		        String reversed = "";

		        for (int i = input.length() - 1; i >= 0; i--) {
		            reversed += input.charAt(i);
		        }

		        if (input.equals(reversed)) {
		            System.out.println(input + " is a palindrome.");
		        } else {
		            System.out.println(input + " is not a palindrome.");
		        }
		    }
	}
