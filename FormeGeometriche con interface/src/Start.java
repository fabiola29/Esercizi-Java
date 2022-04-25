import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {

		ArrayList<FormeGeometriche> theList = new ArrayList<>();
	
		theList.add(new Quadrato());
		theList.add(new Rettangolo());
		theList.add(new Triangolo());
		
		for(FormeGeometriche f: theList)
			f.StampaPerimetro();
	}

}
