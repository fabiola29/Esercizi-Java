package FormeGeometriche;
public class FormeGeometriche {
	
	//ATTRIBUTI
	public final String NomeFigure;
	public final int numLati;
	public final String Colore;

	
	//COSTRUTTORI

	
	@Override
	public String toString() {
		return "FormeGeometriche [NomeFigure=" + NomeFigure + ", numLati=" + numLati + ", Colore=" + Colore + "]";
	}


	public FormeGeometriche(String nomeFigure, int numLati, String colore) {
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
}

   