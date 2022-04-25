
public class ContoCorrente5 {
	
	//ATTRIBUTI
	private String IBAN;
	private	Cliente Intestatario;
	private double Saldo=0.0;
	

	
		//METODO COSTRUTTORE
		public ContoCorrente5(String ib, Cliente c) {
		IBAN=ib;
		Intestatario=c;
		}
		

		 public ContoCorrente5() {
		
		 }
	
	//METODI
	
	public void  Versa(double amount) {
		 Saldo = Saldo + amount;
	}
	
	

	public void Preleva(double amount)  throws  PrelievoException {
		if(amount<= Saldo) {
			Saldo=Saldo-amount;
		}
		else 
			throw  new  PrelievoException();
	}
	
	public void SetIBAN (String ib) {
		IBAN=ib;
	}
	
	public void SetIntestatario (Cliente c) {
		Intestatario=c;
	}
	
	public void StampaDettagliConto() {
		         //osserviamo che "+Intestatario+" equivale al %s in C
		System.out.println("Il conto di "+Intestatario+" con IBAN "+IBAN+" ha $ "+Saldo); 
	}
	
	

}
