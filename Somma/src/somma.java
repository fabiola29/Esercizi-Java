import java.util.Scanner;

public class somma{
	public static void main(String[] arg){
   

	int I,N,M;
	int S,x;

	Scanner in = new Scanner(System.in); //classe per per salvare nella variabile i valori inseriti da tastiera 
	
	
	System.out.println("Inserisci quanti valori vuoi sommare:");  //stampa a video il messaggio
	N = in.nextInt();//legge il valore inserito da tastiera e lo salva nella variabile N
	
	S = 0; //inizializzo variabile per la somma a zero
	I = 0;//inizializzo variabile per il conteggio a zero
    while(I<N){ //ciclo while per calcolare la somma 	
		System.out.print("inserisci il valore del numero: "); //stampa a video il messaggio
		x = in.nextInt();//salva il valore inserito nella variabile x
		S = S+x;//somma
		I=I+1;//incremento conteggio
	}
	 System.out.println("somma = " + S); //stampa a video la somma ottenuta 
	
	 System.out.println("Inserisci valore da confrontare: ");  //STAMPA A VIDEO MESSAGGIO
	 M = in.nextInt(); // inserire nella variabile M il valore inserito da tastiera

	 if(S > M) { //ciclo if
		
		System.out.print("il valore di s supera quello inserito");
		
	}else {
		
		System.out.print("il valore di s non supera quello inserito");	
	}
  }
}
