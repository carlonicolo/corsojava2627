public class Auto {
    // Creazione variabili
    private String marca;
    private String modello;
    private String colore;
    private int cavalli;
    private boolean superbollo;
    private boolean assicurazione;
    private int num_incidenti;
    private String nome_assicurazione;



    //Primo metodo costruttore

    public Auto(String marca, String modello, String colore, int cavalli, boolean superbollo, boolean assicurazione, int num_incidenti, String nome_assicurazione) {
        this.marca = marca;
        this.modello = modello;
        this.colore = colore;
        this.cavalli = cavalli;
        this.superbollo = superbollo;
        this.assicurazione = assicurazione;
        this.num_incidenti = num_incidenti;
        this.nome_assicurazione = nome_assicurazione;
    }


    //Secondo metodo costruttore

    public Auto(String marca, String colore, String modello) {
        this.marca = marca;
        this.colore = colore;
        this.modello = modello;
    }


    //Metodi accessori get e set


    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public String getColore() {
        return colore;
    }

    public int getCavalli() {
        return cavalli;
    }

    public boolean isSuperbollo() {
        return superbollo;
    }

    public boolean isAssicurazione() {
        return assicurazione;
    }

    public int getNum_incidenti() {
        return num_incidenti;
    }

    public String getNome_assicurazione() {
        return nome_assicurazione;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setCavalli(int cavalli) {
        this.cavalli = cavalli;
    }

    public void setSuperbollo(boolean superbollo) {
        this.superbollo = superbollo;
    }

    public void setAssicurazione(boolean assicurazione) {
        this.assicurazione = assicurazione;
    }

    public void setNum_incidenti(int num_incidenti) {
        this.num_incidenti = num_incidenti;
    }

    public void setNome_assicurazione(String nome_assicurazione) {
        this.nome_assicurazione = nome_assicurazione;
    }

    //Metodi della classe
    public int leggiTachimetro(){
        //Ritorna la velocità corrente dell'auto
        return 0;
    }



}
