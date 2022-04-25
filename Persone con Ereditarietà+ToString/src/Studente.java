public class Studente extends Persona {
    public  String matricola;

    public Studente(String nome, String cognome, String matricola) {
        super(nome, cognome); 
        this.matricola = matricola; 
    }

    public String toString() {
        return "Nome: " + nome + "\nCognome: " + cognome + "\nMatricola: " + matricola;

    }
    
}
