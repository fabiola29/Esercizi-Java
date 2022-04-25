package mm;


public class ProvaScaffale {
   public static void main(String[] args) {

       // crea uno scaffale che puo' contenere 10 pubblicazioni (0..9)
       Scaffale f = new Scaffale(10);

       // aggiunge due libri allo scaffale in posizione 0 e 2
       f.setPubblicazione( new Pubblicazione("Siddharta", "Hermann Hesse", 8), 0 );
       f.setPubblicazione( new Pubblicazione("La Cinquena Muntanya", "Paulo Coelho", 10), 2 );

       // lista le pubblicazioni correntemente nello scaffale f
       f.listaPubblicazioni();

       // aggiunge un altro libro in posizione 5
       f.setPubblicazione( new Pubblicazione("Le Petit Prince", "Antoine De Saint-Exupery", 6), 5 );

       // lista le pubblicazioni correntemente nello scaffale f
       f.listaPubblicazioni();

       // rimuove libro in posizione 2
       f.setPubblicazione( null, 2 );

       // lista le pubblicazioni correntemente nello scaffale f
       f.listaPubblicazioni();

       // ottiene il riferimento al libro in posizione 5
       Pubblicazione p = f.getPubblicazione(5);

       // ne stampa solo il titolo
       System.out.println(p.getTitolo());
   }
}
