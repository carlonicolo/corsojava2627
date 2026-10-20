public class Moto {
    private String marca;
    private String colore;
    private int num_cavalli;
    private double cilindrata;
    private int velocita = 0;
    private int decelerazione;

    public Moto(String amarca, String acolore, int anum_cavalli, double acilindrata) {
        this.marca = amarca;
        this.colore = acolore;
        this.num_cavalli = anum_cavalli;
        this.cilindrata = acilindrata;
    }

    public Moto(String marca, double cilindrata) {
        this.marca = marca;
        this.cilindrata = cilindrata;
        this.colore = "bianco";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public int getNum_cavalli() {
        return num_cavalli;
    }

    public void setNum_cavalli(int num_cavalli) {
        this.num_cavalli = num_cavalli;
    }

    public double getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(double cilindrata) {
        this.cilindrata = cilindrata;
    }

    public int getVelocita(){
        return velocita;
    }

    public void setVelocita(int velocita){
        this.velocita = velocita;
    }

    public void accelera(){
        System.out.println("BRUMMMM");
        this.velocita = this.velocita + 10;
    }

    public void frena(){
        if(this.velocita == 0){
            System.out.println("La moto è già ferma non serve frenare!!!");
        }
        else{
            this.velocita = this.velocita - 10;
        }
    }

    public void decelera(int decelerazione){
        if(this.velocita == 0){
            System.out.println("La moto è già ferma non serve frenare!!!");
        }
        else{
            this.velocita = this.velocita - decelerazione;
        }
    }


}
