package pqte_banca;




public class CTarjeta {
    //Atributos
    private int limiteCajero;
    private int limiteInternet;

    //Constructores
    public CTarjeta(){}
    
    public CTarjeta(int p1, int p2) {
        limiteCajero = p1;
        limiteInternet = p2;
    }

    //Getters y setters
    public int getLimiteCajero() {
        return limiteCajero;
    }

    public void setLimiteCajero(int limiteCajero) {
        this.limiteCajero = limiteCajero;
    }

    public int getLimiteInternet() {
        return limiteInternet;
    }

    public void setLimiteInternet(int limiteInternet) {
        this.limiteInternet = limiteInternet;
    }
    
}//CTarjeta
