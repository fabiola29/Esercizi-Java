
public class Edificio {
	
	static String costruttore;
	static int piani;
	
	public Edificio(int f, String c) {
		piani = f;
		costruttore = c;
	}
	
	public static void print() {
		System.out.print(costruttore + "");
	}
	
	

}
