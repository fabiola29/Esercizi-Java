import java.util.InputMismatchException;
import java.util.Scanner;

public class Started {

	public static void main(String[] args) {

		 int num1;
		 int num2;
		 
		 System.out.println("Benvenuto nel programma che effettua divisioni");
		 
		 Scanner in = new Scanner(System.in);
		
		 try {
			System.out.println("\nInserisci il valore del divisore:");
			 num1=in.nextInt();
			 
			 System.out.println("Inserisci il valore del dividendo:");
			 num2=in.nextInt();
			 
			 double result =num1/num2;
			
			 System.out.println("La divisione di "+num1+" e "+num2+" ha risultato "+result);

		} catch (ArithmeticException e) {
			 System.out.println("\nAttenzione, non è possibile inserire 0 come dividendo");
			
		}catch (InputMismatchException ae) {
			 System.out.println("\nAttenzione, non è possibile inserire valori non numerici");
		}
		 
		 System.out.println("\nIl programma è terminato!");
		 
	}
}