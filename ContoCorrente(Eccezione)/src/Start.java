
public class Start {

	public static void main(String[] args) {
		
		
		Cliente c = new Cliente ("Roberto","Esposito","RFVEVVF","AA@aa.COM","+39081234");	
	    ContoCorrente5 C1 = new ContoCorrente5("1234ABCD",c);	

	     C1.Versa(1000);
			
			try {
				
				C1.Preleva(1500);
			} catch (PrelievoException e) {
				System.out.println("Impossibile prelevare più del saldo disponibile sul conto");
				
			}

			

			System.out.println("Programma terminato correttamente");
			
	     }
			
	}


	