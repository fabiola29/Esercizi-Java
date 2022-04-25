import java.util.ArrayList;
import java.util.Iterator;

public class Start {

	public static void main(String[] args) {
		
		
		 cliente cliente1 = new cliente ("Roberto","Esposito","RFVEVVF","AA@aa.COM","+39081234");	
		 cliente cliente2 = new cliente ("Maria","Rossi","SDJFHAK","bb@BB.COM","+39086753");	

	   
		 ArrayList<cliente> arr = new ArrayList<cliente>();
		 
		 arr.add(cliente1);
		 arr.add(cliente2);

		 Iterator i = arr.iterator();
		 
		 while(i.hasNext())
			 System.out.println(i.next());
		 
		 

			

			System.out.println("Programma terminato correttamente");
			
	     }
			
	}


	 
