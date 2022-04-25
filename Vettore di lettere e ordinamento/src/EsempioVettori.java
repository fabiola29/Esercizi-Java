import java.util.Arrays;

public class EsempioVettori {

	public  EsempioVettori() {
		
		String[] lettere = new String[6];
	
		lettere[0]="C";
		lettere[1]="E";
		lettere[2]="P";
		lettere[3]="Y";
		lettere[4]="O";
		lettere[5]="L";
		
			
			 for(int i = 0 ; i<lettere.length; i++ ) {
					
						System.out.println("La cella: "+i+"--->contiene:"+lettere[i]);
						
				        Arrays.sort(lettere);
 
			
			 }
	}

	
}	

