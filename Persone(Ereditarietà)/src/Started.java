public class Started {

    

	public static void main(String[] args) {
        

      Persona1 Mario = new Persona1("Mario","Rossi");


     Studente Stefano = new Studente("Stefano","Verdi","1234BGF");
      
                 

  System.out.println("Nome:"+ Mario.getNome() + "\nCognome:" + Mario.getCognome());
  System.out.println();
  System.out.println("Nome:"+ Stefano.getNome() + "Cognome:" + Stefano.getCognome() + ",Matricola:" + Stefano.getMatricola());


   
    
   }
}