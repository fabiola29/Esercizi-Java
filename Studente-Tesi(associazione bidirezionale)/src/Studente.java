
public class Studente {

	  //ATTRIBUTI
	public String Nome;
	public String Cognome;
	public String Matricola;
	public Tesi LaTesi;
	
	
	  //COSTRUTTORI
	public Studente(String nome, String cognome, String matricola) {
		super();
		Nome = nome;
		Cognome = cognome;
		Matricola = matricola;
	}

	  //METODI

	public Tesi getLaTesi() {
		return LaTesi;
	}


	public void setLaTesi(Tesi laTesi) {
		LaTesi = laTesi;
	}
		
	
	
}