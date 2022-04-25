package forme;

public class forme {
	
		
		//ATTRIBUTI
		private String NomeFigure;
		private int numLati;
		private String Colore;


		//COSTRUTTORI

		
		@Override
		public String toString() {
			return "FormeGeometriche [NomeFigure=" + NomeFigure + ", numLati=" + numLati + ", Colore=" + Colore + "]";
		}


		public forme(String nomeFigure, int numLati, String colore) {
			super();
			NomeFigure = nomeFigure;
			this.numLati = numLati;
			Colore = colore;
		}

		
		//METODI

		public double perimetro() {
			return 0;
		}
		
		public double area() {
			return 0;
			
		}
			public String getNomeFigure() {
				return NomeFigure;
			}


			public void setNomeFigure(String nomeFigure) {
				NomeFigure = nomeFigure;
			}

			

		public int getNumLati() {
			return numLati;
		}


		public void setNumLati(int numLati) {
			this.numLati = numLati;
		}


		public String getColore() {
			return Colore;
		}


		public void setColore(String colore) {
			Colore = colore;
		}
	}

