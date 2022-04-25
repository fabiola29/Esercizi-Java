
public class ContoCorrente {
	
	//ATTRIBUTI
	public String IBAN;
	public cliente Intestatario;
	public double Saldo=0.0;
	

	
		//METODO COSTRUTTORE
		public ContoCorrente(String ib, cliente cliente1, cliente cliente2) {
		IBAN=ib;
		Intestatario=cliente1;
		Intestatario=cliente2;

		}
		

		 public ContoCorrente() {
		
		 }
	
	//METODI
	
	public void  Versa(double amount) {
		 Saldo = Saldo + amount;
	}
	
	

	public boolean  Preleva(double amount) {
		if(amount<= Saldo) {
			Saldo=Saldo-amount;
			return true;		
		}
		else 
			return false;
	}
	

	
	public String getIBAN() {
		return IBAN;
	}


	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}


	public cliente getIntestatario() {
		return Intestatario;
	}


	public void setIntestatario(cliente intestatario) {
		Intestatario = intestatario;
	}


	public double getSaldo() {
		return Saldo;
	}


	public void setSaldo(double saldo) {
		Saldo = saldo;
	}


	public void StampaDettagliConto() {
		         //osserviamo che "+Intestatario+" equivale al %s in C
		System.out.println("Il conto di " +Intestatario+ " con IBAN "+IBAN+" ha $ "+Saldo); 
	}
	
	

}

