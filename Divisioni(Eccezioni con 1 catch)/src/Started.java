import java.util.Scanner;

public class Started {

	public static void main(String[] args) {

		 int num1;
		 int num2;
		 
		 System.out.println("Benvenuto nel programma che effettua divisioni");
		 
		 Scanner in = new Scanner(System.in);
		
		 try {
			System.out.println("Inserisci il valore del divisore:");
			 num1=in.nextInt();
			 
			 System.out.println("Inserisci il valore del dividendo:");
			 num2=in.nextInt();
			 
			 double result =num1/num2;
			
			 System.out.println("La divisione di "+num1+" e "+num2+" ha risultato "+result);

		} catch (Exception e) {
			 System.out.println("Attenzione, non è possibile inserire 0 o valori non numerici come dividendo");
			
		}
		 System.out.println("\nIl programma è terminato!");
		 
	}

}
