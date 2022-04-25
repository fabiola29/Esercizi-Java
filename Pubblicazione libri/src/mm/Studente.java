package mm;


	public class Studente{ 
		private String nome;
        private String cognome; 
        private int matricola;
	
        public Studente(String n, String c, int m){
        	nome=n;
	        cognome=c;
	        matricola=m;
	        }
	
        public String get_Nome() { 
        	return nome;
	}
	    public String get_Cognome() { 
		return cognome;
	}
        public int get_Matricola() { 
		return matricola;
	}
}