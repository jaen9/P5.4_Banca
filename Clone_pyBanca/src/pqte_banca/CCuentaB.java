package pqte_banca;



import java.util.ArrayList;

/**
 * Clase de la cuenta bancaria con los atributos del saldo, un límite de dinero,
 * la fecha en la que se abrió la cuenta y el conjunto de tarjetas que posee.
 * Puede ser de 0 a infinitas. A su vez la clase permite ingresar/retirar saldo
 * o realizar alguna operación con tarjeta.
 * 
 * @author Sergio Jaen
 * @version 1.0
 * @since 1.0 
 */
public class CCuentaB {
    //Atributos
    private int saldo;
    private int limite;
    private String fechaApertura;
    private ArrayList<CTarjeta> tarjeta;

    //Getters y setters

    /**
     * Get de saldo
     * @return devuelve el saldo de la cuenta
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * Set de saldo
     * @param saldo asigna el parámetro al atributo saldo
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    /**
     * Get de limite
     * @return devuelve el limite de la cuenta
     */
    public int getLimite() {
        return limite;
    }

    /**
     * Set de limite
     * @param limite asigna el parámetro al atributo limite
     */
    public void setLimite(int limite) {
        this.limite = limite;
    }

    /**
     *  Get de fechaApertura
     * @return devuelve la fecha de apertura de cuenta
     */
    public String getFechaApertura() {
        return fechaApertura;
    }

    /**
     * Set de fechaApertura
     * @param fechaApertura asigna el parámetro al atributo fechaApertura
     */
    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    /**
     * Get de tarjeta
     * @return devuelve la tarjeta de la cuenta
     */
    public ArrayList<CTarjeta> getTarjeta() {
        return tarjeta;
    }

    /**
     *  Set de tarjeta 
     * @param tarjeta asigna el valor del parámetro tarjeta
     */
    public void setTarjeta(ArrayList<CTarjeta> tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    //Constructores

    /**
     * Constructor vacio
     */
    public CCuentaB(){}
    
    /**
     * Constructor con todos los parámetros
     * @param p1 saldo
     * @param p2 limite
     * @param p3 fechaApertura
     * @param p4 tarjeta
     */
    public CCuentaB(int p1, int p2, String p3, ArrayList<CTarjeta> p4) {
        saldo = p1;
        limite = p2;
        fechaApertura = p3;
        tarjeta = p4;
    }

    /**
     * Constructor sin tarjeta
     * @param p1 saldo
     * @param p2 limite
     * @param p3 fechaApertura
     */
    public CCuentaB(int p1, int p2, String p3) {
        saldo = p1;
        limite = p2;
        fechaApertura = p3;
    }

    
    //Metodos    

    /**
     * Método que suma o resta la cantidad pasada por parámetro, en función del 
     * valor del parámetro ingresar, al saldo de la cuenta.
     * 
     * @param cantidad Cantidad a sumar o restar
     * @param ingresar true = ingresar o false = retirar
     */
    public void operacionCuenta (int cantidad, boolean ingresar){
        if (!ingresar && saldo >= cantidad)
            saldo = saldo - cantidad;
        else
            saldo = saldo + cantidad;
    }//operacionCuenta
    
    /**
     *  Método que estudia si la cantidad a retirar es menor que el saldo y si
     * lo es se comprueba si se quiere realizar el pago por internet o cajero.
     * Todo esto siempre y cuando no supere la  cantidad a retirar al límite de
     * la tarjeta.
     * 
     * @param cantidad Cantidad a retirar (pago)
     * @param nroTarj Indica qué tarjeta quiere realizar el pago.
     * @param cajero true = cajero o false = internet
     */
    public void operacionTarjeta (int cantidad, int nroTarj, boolean cajero){
        if (saldo >= cantidad){
            if (cajero)
                if(tarjeta.get(nroTarj).getLimiteCajero() >= cantidad)
                    saldo = saldo - cantidad;
                else
                    System.out.println("La cantidad supera su limite de cajero");
            else
                if(tarjeta.get(nroTarj).getLimiteInternet() >= cantidad)
                    saldo = saldo - cantidad;
                else
                    System.out.println("La cantidad supera su limite de Internet");
        }else{
            System.out.println("No hay suficiente saldo");
        }
    }//operacionTarjeta
    
}//CCuentaB
