import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);

        // punto 1
        System.out.print("Inserisci una stringa: ");
        String stringa = input.next();

        // punto 2
        System.out.println("Numero di caratteri della stringa: " + stringa.length());

        // punto 3
        System.out.print("Inserisci a: ");
        int a = input.nextInt();
        System.out.print("Inserisci b: ");
        int b = input.nextInt();

        // punto 4
        System.out.println("Sottostringa scelta: " + stringa.substring(a, b));
    }
}