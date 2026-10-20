import Scanner.Macchina;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Lettura dei dati da tastiera
        System.out.print("Inserisci la marca della moto: ");
        String marca = input.next();

        System.out.print("Inserisci la cilindrata della moto: ");
        double cilindrata = input.nextDouble();


        // Stampa dell'oggetto usando automaticamente toString()
        //System.out.println("\nOggetto creato:");
        //System.out.println(macchina1);

        Moto monster = new Moto(marca,cilindrata);
        System.out.println("Il colore della monster è: " + monster.getColore());

        monster.setColore("rossa");
        System.out.println("Il colore della monster è: " + monster.getColore());

        System.out.println("Velocità prima: " + monster.getVelocita());
        monster.accelera();
        System.out.println("Velocità dopo aver accellerato: " + monster.getVelocita());

        monster.frena();
        System.out.println("Velocità dopo aver frenato: " + monster.getVelocita());

        monster.frena();
        System.out.println("Velocità dopo aver frenato: " + monster.getVelocita());


        Auto bmwM5 = new Auto("BMW", "Bianco", "M5");



    }
}