package Lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Lettura dei dati da tastiera
        System.out.print("Inserisci la marca del processore: ");
        String marca = input.next();

        System.out.print("Inserisci il modello del processore: ");
        String processore = input.next();

        System.out.print("Inserisci il tipo di RAM: ");
        String ram = input.next();

        System.out.print("Inserisci il prezzo del computer: ");
        double prezzo = input.nextDouble();

        Computer X1 = new Computer(marca, processore, ram, prezzo);
        Computer X13 = new Computer("Lenovo", "I5", "DDR5", 2500.50);

        System.out.println("------------------------");
        System.out.println("Marca: " + X1.getMarca());
        System.out.println("Processore: " + X1.getProcessore());
        System.out.println("RAM: " + X1.getRam());
        System.out.println("Prezzo: " + X1.getPrezzo());
        System.out.println("------------------------");
        System.out.println("Marca: " + X13.getMarca());
        System.out.println("Processore: " + X13.getProcessore());
        System.out.println("RAM: " + X13.getRam());
        System.out.println("Prezzo: " + X13.getPrezzo());
        System.out.println("------------------------");


    }
}
