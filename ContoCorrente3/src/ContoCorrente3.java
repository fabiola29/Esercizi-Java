
	

public class ContoCorrente3 {
	
	//ATTRIBUTI
	String IBAN;
	String Intestatario;
	double Saldo = 0.0;
	
	
	//METODI
	
	public void  Versa(double amount) {
		 Saldo = Saldo + amount;
	}
	
	
	 //METODO COSTRUTTORE
	public ContoCorrente3(String ib, String nome) {
	IBAN=ib;
	Intestatario=nome;
	}
	

		
	public boolean  Preleva(double amount) {
		if(amount<= Saldo) {
			Saldo=Saldo-amount;
			return true;		
		}
		else 
			return false;
	}
	
	public void SetIBAN (String ib) {
		IBAN=ib;
	}
	
	public void SetIntestatario (String nome) {
		Intestatario=nome;
	}
	
	public void StampaDettagliConto() {
		         //osserviamo che "+Intestatario+" equivale al %s in C
		System.out.println("Il conto di "+Intestatario+" con IBAN "+IBAN+" ha $ "+Saldo); 
	}

}



