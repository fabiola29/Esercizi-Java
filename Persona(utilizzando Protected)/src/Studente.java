
public class Studente extends Persona {
	
	public String matricola;

	public Studente(String nome, String cognome, int eta, String matricola) {
		super(nome, cognome, eta);
		this.matricola = matricola;
	}
	
	 public String toString() {
	        return "Nome: " + nome + "\nCognome: " + cognome + "\nEtà: " + eta + "\nMatricola: " + matricola;   //+nome IN C EQUIVALE AL %s

	    }
	

}
