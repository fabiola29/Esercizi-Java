import java.util.Scanner;

public class StringaReverse {
	
	public StringaReverse() {
		
		Scanner input = new Scanner(System.in);
		
	
		System.out.println("Inserisci una stringa:");
		String s1 = input.next();
		
		System.out.println(reverse(s1));	


	}

	 public static String reverse(String s) {
	        if (s.length() == 1) {
	            return s;
	        }
	    
	        return reverse(s.substring(1)) + s.charAt(0);
	}

}


