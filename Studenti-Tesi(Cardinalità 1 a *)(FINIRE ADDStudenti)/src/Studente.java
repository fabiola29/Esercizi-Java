
public class Studente {

	  //ATTRIBUTI
	private String Nome;
	private String Cognome;
	private String Matricola;
	
	public Tesi LaTesi;
	
	public  CorsoDiLaurea IscrittoA;
	
	
	  //COSTRUTTORI
	public Studente(String nome, String cognome, String matricola, CorsoDiLaurea iscrittoA) {
		super();
		Nome = nome;
		Cognome = cognome;
		Matricola = matricola;
		IscrittoA = iscrittoA;
	}

	  //METODI

	public Tesi getLaTesi() {
		return LaTesi;
	}

	public void setLaTesi(Tesi laTesi) {
		LaTesi = laTesi;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public String getMatricola() {
		return Matricola;
	}

	public void setMatricola(String matricola) {
		Matricola = matricola;
	}



}
		
	
