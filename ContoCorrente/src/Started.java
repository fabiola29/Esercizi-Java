
public class Started {

public static void main(String[] args) {
		
		//nometipo  nome variabile--> tale sintassi si usa per la creazione di un tipo che crea il programmatore stesso.
		
		
		//la new come la malloc in C va ad allorare dello spazio in memoria per contenere i dati relativi a C1
		ContoCorrente C1 = new ContoCorrente(); //costrutture di default
		
		//la new come la malloc in C va ad allorare dello spazio in memoria per contenere i dati relativi a C2	
		ContoCorrente C2 = new ContoCorrente(); //costrutture di default
		

		
		C1.SetIntestatario("Roberto");
		C1.SetIBAN("1234ABCD");
		C1.Versa(300);
		C1.StampaDettagliConto();
		

		C2.SetIntestatario("Alex");
		C2.SetIBAN("1234ABCD");
		C2.Versa(500);
		C2.StampaDettagliConto();
		
		
		System.out.println("Programma terminato correttamente");
		
		
		
	}

}