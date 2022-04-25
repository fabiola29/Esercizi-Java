
import java.util.Scanner;

public class InputUtils {
	
	Scanner scanner = new Scanner(System.in);
	
	public String getString(String descrizione) {
		System.out.println("Inserisci " + descrizione+":");
		String s = scanner.nextLine();
		return s;
	}
	
	public int getInt(String descrizione) {
		System.out.println("Inserisci " + descrizione+":");
		
		int n=0;
		
		while(true) {
			try {
				n = scanner.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Errore! ("+descrizione+") deve essere un intero:");
				scanner.nextLine();
			}
		}
		
		return n;
	}
	
	public boolean getBool(String descrizione) {
		System.out.println("Inserisci " + descrizione+":");
		boolean b = scanner.nextBoolean();
		return b;
	}
	
}
