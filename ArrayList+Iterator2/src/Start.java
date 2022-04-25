import java.util.ArrayList;
import java.util.Iterator;

public class Start {


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

			
			// SCANDISCO ARRAYLIST

			 Iterator i = vett.iterator();
			 while(i.hasNext())
				 System.out.println(i.next());
			 	
			
		}

	}
