package CalcolatriceV1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Avvia la GUI sul thread corretto
        SwingUtilities.invokeLater(() -> new Calcolatrice());
    }
}

