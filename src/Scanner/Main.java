package Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Controllo degli argomenti
        if (args.length < 2) {
            System.out.println("Errore: devi inserire marca e modello.");
            System.out.println("Esempio:");
            System.out.println("java Main Fiat Panda");

            input.close();
            return;
        }

        // Lettura degli argomenti dalla riga di comando
        String marca = args[0];
        String modello = args[1];

        // Lettura dei dati da tastiera
        System.out.print("Inserisci l'anno della macchina: ");
        int anno = input.nextInt();

        System.out.print("Inserisci il prezzo della macchina: ");
        double prezzo = input.nextDouble();

        // Creazione dell'oggetto
        Macchina macchina1 = new Macchina(marca, modello, anno, prezzo);

        // Stampa dell'oggetto usando automaticamente toString()
        System.out.println("\nOggetto creato:");
        System.out.println(macchina1);

        // Modifica tramite setter
        macchina1.setAnno(2025);
        macchina1.setPrezzo(16000);

        // Nuova stampa dell'oggetto
        System.out.println("\nOggetto dopo le modifiche:");
        System.out.println(macchina1);

        input.close();
    }
}