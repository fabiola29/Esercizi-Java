package forme;

public class Triangolo extends forme {


    //ATTRIBUTI

	private double lato1;
	private double lato2;
	private double base;
	private double altezza;
	
	
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



	public double getLato1() {
		return lato1;
	}



	public void setLato1(double lato1) {
		this.lato1 = lato1;
	}



	public double getLato2() {
		return lato2;
	}



	public void setLato2(double lato2) {
		this.lato2 = lato2;
	}



	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	public double getAltezza() {
		return altezza;
	}



	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	
	
}