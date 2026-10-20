package Lab1;

public class Computer {
    private String marca;
    private String processore;
    private String ram;
    private double prezzo;

    public Computer(String marca, String processore, String ram, double prezzo) {
        this.marca = marca;
        this.processore = processore;
        this.ram = ram;
        this.prezzo = prezzo;
    }

    // Metodi accessori
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcessore() {
        return processore;
    }

    public void setProcessore(String processore) {
        this.processore = processore;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    // Fine metodi accessori

    // Metodi

}
