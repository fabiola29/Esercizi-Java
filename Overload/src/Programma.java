
public class Programma {

	    public static void main(String[] args) {

	        SommaAritmetica operazione = new SommaAritmetica();

	        System.out.println(operazione.somma(2.50f, 2.50f));

	        System.out.println(operazione.somma(5, 5));

	        System.out.println(operazione.somma(5, 2.50f));

	        System.out.println(operazione.somma(2.50f, 5));

	        System.out.println(operazione.somma(5, 2.50, 5));

	    }
	}
