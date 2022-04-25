import java.util.Scanner;

public class ConcersioneMaiuscolo {
	
	public ConcersioneMaiuscolo() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una stringa:");
		String s1 = input.next();

	    s1 = s1.toUpperCase();
		System.out.println(s1);

	}
}
