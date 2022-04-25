package mm;

public class Cono implements FiguraGeometrica {
	
	
	static final int numLati = 3;
	private int dimensioni;

	public void print() {
		
		System.out.print("Cono " + dimensioni + "-" + numLati + "lati per faccia");
		
	}
	
	public static void main (String [] argv) {
		Cono c1 = new Cono();
		FiguraGeometrica f1 =c1;
		c1.print();
		
	}

}
