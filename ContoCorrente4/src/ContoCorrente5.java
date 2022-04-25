
public class ContoCorrente5 {
	
	//ATTRIBUTI
	public String IBAN;
	public Cliente Intestatario;
	public double Saldo=0.0;
	

	
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


	public Cliente getIntestatario() {
		return Intestatario;
	}


	public void setIntestatario(Cliente intestatario) {
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

