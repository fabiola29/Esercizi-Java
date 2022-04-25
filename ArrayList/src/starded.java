import java.util.*;

public class starded {

	public static void main(String[] args) {

		//INIZZIALIZZAIONE ArrayList
		ArrayList vett = new ArrayList();
		
		//Aggiunge elementi all'ArrayList
		vett.add("Ciao");
		vett.add("Mondo");
		vett.add("Buongiorno");
		vett.add(5);
		vett.add(4.6d);
		vett.add(true);

		
		// OPERAZIONI SULL'ARRAYLIST

		//vett.removeAll(vett); //RIMUOVE TUTTI GLI ELEMENTI DEL VETTORE
		
		//vett.remove(2);  //RIMUOVE SOLO L'ELEMENTO TRA PARENTESI TONDE
		
		//vett.add(0,"Hello"); //shifta la posizione degli altri elementi 
		
		//vett.set(0, "Hello"); /sostituisce "ciao" con "Hello"
		
		//Collections.sort(vett); //ordina gli elementi nel vettore
		
		// Collections.shuffle(vett); //randomizza il vettore 
		
	
		//PERMETTE DI CERCARE UN ELEMENTO NELL'ARRAYLIST
		//if(vett.contains("Ciao"))
			//System.out.println("Contiene l'elemento cercato");
		
		// System.out.println(vett.indexOf("Ciao")); //stampa la posizione in cui si trova l'elemento nell'ArrayList
	
		// System.out.println(vett.get(2)); //stampa ciò che si tova in posizione 2 nell'ArrayList

		for(Object o:vett)
			System.out.println(o);

		
	}

}
