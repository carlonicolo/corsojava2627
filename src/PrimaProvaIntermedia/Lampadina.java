package PrimaProvaIntermedia;

public class Lampadina {
    boolean accesa = false;

    void accendi() {
        // TODO: imposta accesa a true
        accesa = true;
    }

    void spegni() {
        // TODO: imposta accesa a false
        accesa = false;
    }

    void mostraStato() {
        System.out.println("Accesa: " + accesa);
    }
}