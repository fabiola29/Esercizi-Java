package mm;

public class Pubblicazione {

	//ATTRIBUTI
    private String titolo;
    private String autore;
    private int pagine;
    private int prezzo;

    //COSTRUTTORE
    public Pubblicazione(String t, String a, int p) {
        this.titolo = t;
        this.autore = a;
        this.prezzo = p;
        this.pagine = (int)(p/0.1);
    }

    //METODI
    public String getTitolo() { 

    	return this.titolo;
    	}
  
    public String getAutore() { 
    	return this.autore; 
    	}
    
    public int getPrezzo() { 
    	return this.prezzo; 
    	}
    
    public int getPagine() {
    	return this.pagine; 
    	}
    
    public void setTitolo(String t) { 
    	this.titolo = t;
    	}
   
    public void setAutore(String a) { 
    	this.autore = a; 
    	}
   
    public void setPrezzo(int p) {
        this.prezzo = p;
        this.pagine = (int)(p/0.1);
    }
    
    public void setPagine(int pag) {
        this.pagine = pag;
        this.prezzo = (int)(pag * 0.1);
    }
   
    public String toString(){
        return this.autore + ": \"" + 
               this.titolo + "\", pag. " + 
               this.pagine + ", " + 
               this.prezzo + " EURO.";
    }
}
