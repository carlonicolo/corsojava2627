package Scanner;

public class Macchina {

    // Attributi
    private String marca;
    private String modello;
    private int anno;
    private double prezzo;

    // Costruttore
    public Macchina(String marca, String modello, int anno, double prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
        this.prezzo = prezzo;
    }

    // GETTER

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getAnno() {
        return anno;
    }

    public double getPrezzo() {
        return prezzo;
    }

    // SETTER

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    // Metodo toString()
    @Override
    public String toString() {
        return "Macchina{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", anno=" + anno +
                ", prezzo=" + prezzo +
                '}';
    }
}