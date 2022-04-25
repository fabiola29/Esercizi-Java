package forme;

public class Rettangolo extends forme {
	

	//ATTRIBUTI
	
	 private double DimensioneBase;
	 private double DimensioneAltezza;
	
	 
	 //COSTRUTTORI
	 
	@Override
	public String toString() {
		return "Rettangolo [DimensioneBase=" + DimensioneBase + ", DimensioneAltezza=" + DimensioneAltezza + "]";
	}
		 
	

	public Rettangolo(String nomeFigure, int numLati, String colore, double dimensioneBase, double dimensioneAltezza) {
		super(nomeFigure, numLati, colore);
		DimensioneBase = dimensioneBase;
		DimensioneAltezza = dimensioneAltezza;
	}


	//METODI

	@Override
	public double perimetro() {
		return 2*(DimensioneBase+DimensioneAltezza);
	}

	@Override
	public double area() {
		return DimensioneBase*DimensioneAltezza;
	}



	public double getDimensioneBase() {
		return DimensioneBase;
	}



	public void setDimensioneBase(double dimensioneBase) {
		DimensioneBase = dimensioneBase;
	}



	public double getDimensioneAltezza() {
		return DimensioneAltezza;
	}



	public void setDimensioneAltezza(double dimensioneAltezza) {
		DimensioneAltezza = dimensioneAltezza;
	}


	 
	 
	
}

