
public class Start {

	public static void main(String[] args) {
		
		
		 cliente c = new cliente ("Roberto","Esposito","RFVEVVF","AA@aa.COM","+39081234");	
		 ContoCorrente C1 = new ContoCorrente("1234ABCD",c);
			
			
			C1.Versa(300);
			C1.StampaDettagliConto();

			

			System.out.println("Programma terminato correttamente");
			
	     }
			
	}



