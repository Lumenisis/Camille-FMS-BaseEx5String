import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		// Scanner creation
		Scanner scan = new Scanner(System.in);
	    
	    // User input capture
	    System.out.println("Jeu du palindrome");
	    System.out.println("Saisissez un mot ou une phrase");
	    String userInput = scan.nextLine();
	    
	    // Test and display
	    int length = userInput.length();
	    String reverse = "";
	    for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + userInput.charAt(i);
	    }
		if (userInput.equals(reverse))
			System.out.println(userInput + " est un palindrome");
		else
			System.out.println(userInput + " n'est pas un palindrome");
	    
	    // Closing the scanner
	 	scan.close();
	}
}