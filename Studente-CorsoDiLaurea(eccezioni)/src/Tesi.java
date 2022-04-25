
	public class Tesi {
		public String Titolo;
		public String Materia;
		public Studente LoStudente;
		
		
		public Tesi(String titolo, String materia, Studente loStudente) {
			super();
			Titolo = titolo;
			Materia = materia;
			LoStudente = loStudente;
			
			LoStudente.setLaTesi(this);
			
		}

	}


