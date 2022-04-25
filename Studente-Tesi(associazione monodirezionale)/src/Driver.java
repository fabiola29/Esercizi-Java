
public class Driver {

	public static void main(String[] args) {
 
		Studente s = new Studente("Mario", "Esposito", "N86123");
		
		Tesi t = new Tesi("blabla","Ingegneria del Software");
		
		s.setLaTesi(t);
		
		System.out.print("La tesi "+t.Titolo+" è svolta dallo studente "+s.Cognome);
		
	}

}
