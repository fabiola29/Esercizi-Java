
import java.util.Arrays;

public class CorsoDiLaurea {
	
	private String Nome;
	private String Dipartimento;
	
	public Studente[] StudentiIscritti = new Studente[2];
	
	public int NumeroStudenti = 0;
	
	
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getDipartimento() {
		return Dipartimento;
	}
	
	public void setDipartimento(String dipartimento) {
		Dipartimento = dipartimento;
	}

	
	
	public CorsoDiLaurea(String nome, String dipartimento) {
		super();
		Nome = nome;
		Dipartimento = dipartimento;
	}
	
	
	public void addStudente(Studente s) {
		NumeroStudenti = NumeroStudenti + 1;
		if(NumeroStudenti > StudentiIscritti.length) {
			StudentiIscritti = Arrays.copyOf(StudentiIscritti, StudentiIscritti.length * 2);
		}
		StudentiIscritti[NumeroStudenti-1] = s;
	}
	
	

}
