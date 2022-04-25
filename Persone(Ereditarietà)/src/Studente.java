public class Studente extends Persona1 {
  

    private String Matricola;
 

    public String getMatricola() {
        return Matricola;
    }



    public void setMatricola(String matricola) {
        Matricola = matricola;
    }


  
    public Studente(String nome, String cognome, String matricola)
    {
      
        Matricola = matricola;
        setNome(nome);
        setCognome(cognome);
    }
    
} 
