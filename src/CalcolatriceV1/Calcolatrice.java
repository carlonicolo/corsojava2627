package CalcolatriceV1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcolatrice extends JFrame implements ActionListener {

    private JTextField display;
    private double primoNumero = 0;
    private String operatore = "";
    private boolean nuovoNumero = true;

    public Calcolatrice() {
        // Impostazioni finestra
        setTitle("Calcolatrice");
        setSize(320, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(5, 5));

        // Display
        display = new JTextField("0");
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 28));
        display.setBackground(Color.WHITE);
        display.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
        add(display, BorderLayout.NORTH);

        // Pannello pulsanti
        JPanel pannello = new JPanel();
        pannello.setLayout(new GridLayout(5, 4, 5, 5));
        pannello.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // Ordine dei pulsanti
        String[] etichette = {
                "C", "±", "%", "/",
                "7", "8", "9", "*",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "0", ".", "=", ""
        };

        for (String etichetta : etichette) {
            if (etichetta.isEmpty()) {
                pannello.add(new JLabel());
                continue;
            }
            JButton bottone = new JButton(etichetta);
            bottone.setFont(new Font("Arial", Font.BOLD, 20));
            bottone.setFocusPainted(false);
            bottone.addActionListener(this);

            // Colori diversi per categorie
            if ("0123456789.".contains(etichetta)) {
                bottone.setBackground(new Color(240, 240, 240));
            } else if (etichetta.equals("=")) {
                bottone.setBackground(new Color(255, 149, 0));
                bottone.setForeground(Color.WHITE);
            } else {
                bottone.setBackground(new Color(220, 220, 220));
            }
            pannello.add(bottone);
        }

        add(pannello, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        switch (comando) {
            case "C":
                display.setText("0");
                primoNumero = 0;
                operatore = "";
                nuovoNumero = true;
                break;

            case "±":
                double valore = Double.parseDouble(display.getText());
                valore = -valore;
                display.setText(formatNumero(valore));
                break;

            case "%":
                double percentuale = Double.parseDouble(display.getText()) / 100;
                display.setText(formatNumero(percentuale));
                nuovoNumero = true;
                break;

            case "+":
            case "-":
            case "*":
            case "/":
                if (!operatore.isEmpty() && !nuovoNumero) {
                    calcola();
                } else {
                    primoNumero = Double.parseDouble(display.getText());
                }
                operatore = comando;
                nuovoNumero = true;
                break;

            case "=":
                if (!operatore.isEmpty()) {
                    calcola();
                    operatore = "";
                }
                break;

            case ".":
                if (nuovoNumero) {
                    display.setText("0.");
                    nuovoNumero = false;
                } else if (!display.getText().contains(".")) {
                    display.setText(display.getText() + ".");
                }
                break;

            default: // numeri 0-9
                if (nuovoNumero) {
                    display.setText(comando);
                    nuovoNumero = false;
                } else {
                    if (display.getText().equals("0")) {
                        display.setText(comando);
                    } else {
                        display.setText(display.getText() + comando);
                    }
                }
                break;
        }
    }

    private void calcola() {
        double secondoNumero = Double.parseDouble(display.getText());
        double risultato = 0;

        switch (operatore) {
            case "+":
                risultato = primoNumero + secondoNumero;
                break;
            case "-":
                risultato = primoNumero - secondoNumero;
                break;
            case "*":
                risultato = primoNumero * secondoNumero;
                break;
            case "/":
                if (secondoNumero == 0) {
                    display.setText("Errore");
                    nuovoNumero = true;
                    return;
                }
                risultato = primoNumero / secondoNumero;
                break;
        }

        display.setText(formatNumero(risultato));
        primoNumero = risultato;
        nuovoNumero = true;
    }

    // Rimuove la parte decimale se il numero è intero
    private String formatNumero(double numero) {
        if (numero == (long) numero) {
            return String.valueOf((long) numero);
        }
        return String.valueOf(numero);
    }

}
