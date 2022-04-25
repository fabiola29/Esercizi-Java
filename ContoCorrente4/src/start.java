
public class start {

	public static void main(String[] args) {
		
		
		 Cliente c = new Cliente ("Roberto","Esposito","RFVEVVF","AA@aa.COM","+39081234");	
	     ContoCorrente5 C1 = new ContoCorrente5("1234ABCD",c);	

			
			
			C1.Versa(300);
			C1.StampaDettagliConto();

			

			System.out.println("Programma terminato correttamente");
			
	     }
			
	}


	 
