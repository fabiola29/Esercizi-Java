
public class Driver {

	public static void main(String[] args) {
		 
		CorsoDiLaurea cdl1= new CorsoDiLaurea("Informatica", "Dieti",100);
		CorsoDiLaurea cdl2= new CorsoDiLaurea("Ingegneria Automatica","Dieti",100);
		
		Studente s1 = new Studente("Mario", "Esposito", "N86123",cdl1);
		Studente s2 = new Studente("Marco", "Rossi", "P56743", cdl1);
		Studente s3 = new Studente("Rosa", "Verdi", "W87656",cdl2);

		
		cdl1.addStudente(s1);
		cdl1.addStudente(s2);
		cdl2.addStudente(s3);
		
	    System.out.print("1. Lo Studente "+s1.getCognome()+" "+s1.getNome()+", con matricola "+s1.getMatricola()+", è iscritto al corso di"+cdl1.getNomeCorso()+" del dipartimento del "+cdl1.getDipartimento());
		System.out.print("\n2. Lo Studente "+s2.getCognome()+" "+s2.getNome()+", con matricola "+s2.getMatricola()+", è iscritto al corso di "+cdl1.getNomeCorso()+" del dipartimento del "+cdl1.getDipartimento());
		System.out.print("\n3. Lo Studente "+s3.getCognome()+" "+s3.getNome()+", con matricola "+s3.getMatricola()+", è iscritto al corso di "+cdl2.getNomeCorso()+" del dipartimento del "+cdl2.getDipartimento());


	}
}