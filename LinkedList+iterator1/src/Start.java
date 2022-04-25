import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Start {


		public static void main(String[] args) {

			//INIZZIALIZZAIONE ArrayList
			//ArrayList vett = new ArrayList();
			
			LinkedList vett = new LinkedList();
			
			
			//Aggiunge elementi all'ArrayList
			vett.add("Ciao");
			vett.add("Mondo");
			vett.add("Buongiorno");
			vett.add(5);
			vett.add(4.6d);
			vett.add(true);

			
			// SCANDISCO ARRAYLIST

			 ListIterator li = vett.listIterator();
			 while(li.hasNext())
				 System.out.println(li.next());
			 System.out.println("Fine scansione in avanti");
			 while(li.hasPrevious())
				 System.out.println(li.previous());
			 System.out.println("Fine scansione all'indietro");

			 
			

			
		}

	}
