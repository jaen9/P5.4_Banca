package pqte_banca;

/**
 * Clase de tarjeta que recoge los límites del cajero y de internet.
 * @author Sergio Jaen
 * @version 1.0
 * @since 1.0
 */
public class CTarjeta {
    //Atributos
    private int limiteCajero;
    private int limiteInternet;

    //Constructores

    /**
     * Constructor vacio
     */
    public CTarjeta(){}
    
    /**
     * constructor con todos sus parámetros
     * @param p1
     * @param p2
     */
    public CTarjeta(int p1, int p2) {
        limiteCajero = p1;
        limiteInternet = p2;
    }

    //Getters y setters

    /**
     * Get de LimiteCajero
     * @return devuelve el limite del cajero de tarjeta
     */
    public int getLimiteCajero() {
        return limiteCajero;
    }

    /**
     * Set de LimiteCajero
     * @param limiteCajero asigna el limite de cajero al atributo LimiteCajero
     */
    public void setLimiteCajero(int limiteCajero) {
        this.limiteCajero = limiteCajero;
    }

    /**
     * Get de LimiteInternet
     * @return devuelve el limite de internet de tarjeta
     */
    public int getLimiteInternet() {
        return limiteInternet;
    }

    /**
     * Set de LimiteInternet
     * @param limiteInternet asigna el parámetro al atributo LimiteInternet
     */
    public void setLimiteInternet(int limiteInternet) {
        this.limiteInternet = limiteInternet;
    }
    
}//CTarjeta
