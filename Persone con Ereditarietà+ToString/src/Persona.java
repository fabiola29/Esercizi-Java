
public class Persona {
    public final String nome;
    public final String cognome;
    
    public Persona(String nome, String cognome) {
        this.nome = nome;       
        this.cognome = cognome; 
    }

    public String toString() {
        return "Nome: " + nome + "\nCognome: " + cognome;
    }
}

