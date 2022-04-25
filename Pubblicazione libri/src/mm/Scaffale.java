package mm;
public class Scaffale {
   
	//ATTRIBUTI
	private Pubblicazione[] v;

	//METODI
    public Scaffale(int n){
        this.v = new Pubblicazione[n];
        for (int i=0; i<n; i++)
            this.v[i] = null;
    }

    public Pubblicazione getPubblicazione(int i){
        return this.v[i];
    }

    public void setPubblicazione(Pubblicazione p, int i){
        this.v[i] = p;
    }

    public void listaPubblicazioni(){
        System.out.println("Lista pubblicazioni in scaffale:\n");
        for (int i=0; i<this.v.length; i++)
            if (this.v[i]!=null) System.out.println(this.v[i].toString());
        System.out.println();
    }
}
 