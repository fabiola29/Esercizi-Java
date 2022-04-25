

public class Studente {
	
	public String Nome;
	public String Cognome;
	public String Matricola;
	
	public CorsoDiLaurea IscrittoA;
	
	
	public Tesi LaTesi;

	
	
	public Tesi getLaTesi() {
		return LaTesi;
	}
	public void setLaTesi(Tesi laTesi) {
		LaTesi = laTesi;
	}


	

	public Studente(String nome, String cognome, String matricola, CorsoDiLaurea iscrittoA) {
		super();
		Nome = nome;
		Cognome = cognome;
		Matricola = matricola;
		IscrittoA = iscrittoA;
		
		iscrittoA.addStudente(this);
	}
	
	
	
	

}