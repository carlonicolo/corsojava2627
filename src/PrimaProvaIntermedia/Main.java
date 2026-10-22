package PrimaProvaIntermedia;

public class Main {
    public static void main(String[] args) {

        // Esercizio 13
        // TODO: crea un oggetto Lampadina chiamato lampada
        Lampadina lampada = new Lampadina();

        // TODO: chiama il metodo accendi() su lampada
        lampada.accendi();

        // TODO: chiama mostraStato() su lampada
        lampada.mostraStato();

        // Esercizio 14
        Prodotto p = new Prodotto("Mouse", 20.0);
        p.setPrezzo(-5.0);
        System.out.println(p.getPrezzo());

        p.setPrezzo(6.0);
        System.out.println(p.getPrezzo());
    }
}
