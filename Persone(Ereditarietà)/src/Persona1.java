public class Persona1{
  
  
    private String Nome;
    private String Cognome;
	

  
    
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getCognome() {
        return Cognome;
    }
    public void setCognome(String cognome) {
        Cognome = cognome;
      
    }
  

    public Persona1(String nome, String cognome)
    {
       // super();
        setNome(nome);
        setCognome(cognome);
    }

    public Persona1() {

    }
     
  
}