import java.util.Arrays;

public class CorsoDiLaurea {
	
	//ATTRIBUTI
     private String NomeCorso;
	 private String Dipartimento;
	 private Studente[] studentiIscritti;
	 private Studente studente;
	 private int cont = 0;
	 
	
	 
	//COSTRUTTORI
	 public CorsoDiLaurea(String nomeCorso, String dipartimento, int m) {
			super();
			NomeCorso = nomeCorso;
			Dipartimento = dipartimento;
			studentiIscritti = new Studente[m];
		}

	
	//METODI
	public void addStudente (Studente s) {
		if (cont < studentiIscritti.length) { 
			studentiIscritti[cont] = s;
		cont++;
		}
	}


	public String getNomeCorso() {
		return NomeCorso;
	}


	public void setNomeCorso(String nomeCorso) {
		NomeCorso = nomeCorso;
	}


	public String getDipartimento() {
		return Dipartimento;
	}


	public void setDipartimento(String dipartimento) {
		Dipartimento = dipartimento;
	}

	 
}
		
