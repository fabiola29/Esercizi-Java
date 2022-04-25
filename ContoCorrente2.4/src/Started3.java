
public class Started3 {

public static void main(String[] args) {
		
		//nometipo  nome variabile--> tale sintassi si usa per la creazione di un tipo che crea il programmatore stesso.
		
		
		//la new come la malloc in C va ad allorare dello spazio in memoria per contenere i dati relativi a C1
	    ContoCorrente4 C1 = new ContoCorrente4("1234ABCD","Roberto");	
	    
		//la new come la malloc in C va ad allorare dello spazio in memoria per contenere i dati relativi a C2	
		ContoCorrente4 C2 = new ContoCorrente4("3456DEFG", "Alex");
		
		

		C1.Versa(300);
		C1.StampaDettagliConto();
		
		C1.Saldo=-5000;
		C1.StampaDettagliConto();

		
		C2.Versa(500);
		C2.StampaDettagliConto();

		System.out.println("Programma terminato correttamente");
		
}
		

	}