import java.util.Scanner;

class Esercizio2 {
    public static void main(String[] args) {
    	
    	//per leggere da tastiera equivale alla scanf in C
        Scanner scanner = new Scanner(System.in);
        
        //serve per stampare equivale alla printf in C
        System.out.println("Programma che calcola somma e media");
        
        //Inserisco i 5 numeri
        System.out.println("Inserisci il primo numero:");
        int n1 = scanner.nextInt();
        System.out.println("Inserisci il secondo numero:");
        int n2 = scanner.nextInt();
        System.out.println("Inserisci il terzo numero:");
        int n3 = scanner.nextInt();
        System.out.println("Inserisci il quarto numero:");
        int n4 = scanner.nextInt();
        System.out.println("Inserisci il quinto numero:");
        int n5 = scanner.nextInt();
        
        //calcolo la somma
        int somma = n1 + n2 + n3 + n4 + n5;
       
        //calcolo totale somma è media
        System.out.println("Il totale è =  "+somma+", mentre la media è = "+somma/5);
        scanner.close();
    }
}