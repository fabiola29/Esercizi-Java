
public class Tesi {

	//ATTRIBUTI
    private String Titolo;
    private String Materia;
    private Studente  LoStudente;


       //COSTRUTTORI
 public Tesi(String titolo, String materia, Studente loStudente) {
	super();
	Titolo = titolo;
	Materia = materia;
	LoStudente = loStudente;
}

       //METODI

  public String getTitolo() {
	return Titolo;
}

  public void setTitolo(String titolo) {
	Titolo = titolo;
}

  public String getMateria() {
	return Materia;
}

  public void setMateria(String materia) {
	Materia = materia;
}

  public Studente getLoStudente() {
	return LoStudente;
}

  public void setLoStudente(Studente loStudente) {
	LoStudente = loStudente;
}

 
}
