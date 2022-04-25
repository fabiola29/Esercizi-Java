package FormeGeometriche;

public class Rettangolo extends FormeGeometriche {
	
	//ATTRIBUTI
	
	 public double DimensioneBase;
	 public double DimensioneAltezza;
	
	 
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


	 
	 
	
}
