package PrimaProvaIntermedia;

public class Prodotto {
    private String nome;
    private double prezzo;

    public Prodotto(String nome, double prezzo) {
        // TODO: assegna nome con this
        this.nome = nome;

        // TODO: inizializza prezzo chiamando setPrezzo()
        setPrezzo(prezzo);
    }

    public double getPrezzo() {
        // TODO: restituisci prezzo
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        // TODO: aggiorna this.prezzo solo se prezzo >= 0
        if(prezzo >= 0){
            this.prezzo = this.prezzo + prezzo;
        }
    }
}
