package FormeGeometriche;

public class Triangolo extends FormeGeometriche {
	
	     //ATTRIBUTI
	
		public double lato1;
		public double lato2;
		public double base;
		public double altezza;
		
		
		//COSTRUTTORI
	
		@Override
		public String toString() {
			return "Triangolo [lato1=" + lato1 + ", lato2=" + lato2 + ", base=" + base + ", altezza=" + altezza + "]";
		}



		public Triangolo(String nomeFigure, int numLati, String colore, double lato1, double lato2, double base,
				double altezza) {
			super(nomeFigure, numLati, colore);
			this.lato1 = lato1;
			this.lato2 = lato2;
			this.base = base;
			this.altezza = altezza;
		}

		//METODI
		
		@Override
		public double perimetro() {
			return lato1+lato2+base;
		}

		@Override
		public double area() {
			return base*altezza/2;
		}


		
}