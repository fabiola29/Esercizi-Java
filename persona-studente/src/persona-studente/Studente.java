package gg;

public class Studente extends Persona {
	
	private String matricola;

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	
	public Studente(String nome, String cognome, int eta, String matricola) {
		super(nome, cognome, eta);
		this.matricola = matricola;
	}

	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + "]";
	}

	
	
	
	
	

}
