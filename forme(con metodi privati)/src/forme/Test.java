package forme;


public class Test {

public static void main(String[] args) {

        
		Quadrato quadrato = new Quadrato("quadrato",4, "rosa", 3.0);
		Rettangolo rettangolo = new Rettangolo ("rettangolo",4, "blu", 3.0,2.0);
		Triangolo triangolo = new Triangolo ("triangolo", 3, "azzurro", 2.0, 2.0, 3.00,1.50);
		
		
		
			
		 System.out.print(quadrato + "\nIl perimetro è: "+quadrato.perimetro()+ "\nL'area è: "+quadrato.area()+"\n");
	     System.out.println();

	     System.out.print(rettangolo + "\nIl perimetro è: "+rettangolo.perimetro()+ "\nL'area è: "+rettangolo.area()+"\n");
	     System.out.println();

	     System.out.print(triangolo + "\nIl perimetro è: "+triangolo.perimetro()+ "\nL'area è: "+triangolo.area()+"\n");
	     System.out.println();

	   

	}

}

