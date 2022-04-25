
public class Driver {

	public static void main(String[] args) {

		CorsoDiLaurea cdl = new CorsoDiLaurea("Informatica", "DIETI");
		
		Studente s1 = new Studente("Mario", "Rossi", "N86123", cdl);
		Studente s2 = new Studente ("Luca", "Bianchi", "N86345", cdl);
		Studente s3 = new Studente ("Maria", "Esposito", "N47123", cdl);
		
		System.out.println("Creazione esame per " + s1.Nome + " " + s1.Cognome);
		
		String nomeEsame;
		int CFU, voto;
		boolean lode = false;
		
		InputUtils input = new InputUtils();
		
		nomeEsame = input.getString("Nome Esame");
		CFU = input.getInt("CFU");
		voto = input.getInt("voto");
		if(voto == 30) {
			lode = input.getBool("lode?");
		}
		
		Esame e = null;
		try {
			e = new Esame(nomeEsame,CFU,voto,lode);
		} catch (InvalidNomeException e1) {
			System.out.println("Nome esame non valido.");
		} catch (InvalidVotoException e2) {
			System.out.println("Voto non valido");
		} catch (InvalidCFUException e3) {
			System.out.println("Numero di CFU non valido.");
		} catch (ExamException e4) {
			System.out.println("Numero di CFU non valido.");
		}
		
		if(e!=null)
			System.out.println(e);
		else 
			System.out.println("Impossibile creare esame");
		
	}

}