package pqte_banca;


import java.util.ArrayList;

/**
 * Clase Cliente que contiene los atributos nombre, apellido1, apellido2, direccion
 * nif, tlf, edad y un número de cuentas indefinido que puede ser desde ninguna
 * hasta infinitas.
 * 
 * @author socek
 * @version 1.0
 * @since 1.0
 */
public class CCliente {
    //Atributos 
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String nif;
    private int tlf;
    private int edad;
    private ArrayList<CCuentaB> cuenta;// = new ArrayList<>();
    
    //Getters y setters

    /**
     * Get de nombre
     * @return devuelve el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set de nombre
     * @param nombre asigna el parámetro al atributo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get de apellido1
     * @return devuelve el apellido1 del cliente
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Set de apellido1
     * @param apellido1 asigna el parámetro al atributo apellido1
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * Get de apellido2
     * @return devuelve el apellido2 del cliente 
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     *  Set de apellido2
     * @param apellido2 asigna el parámetro al atributo apellido2
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     *  Get de direccion
     * @return devuelve la dirección del cliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *  Set de direccion
     * @param direccion asigna el parámetro al atributo direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Get de nif
     * @return devuelve el nif del cliente
     */
    public String getNif() {
        return nif;
    }

    /**
     * Set de nif
     * @param nif asigna el parámetro al atributo nif
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     *  Get de tlf
     * @return devuelve el tlf del cliente
     */
    public int getTlf() {
        return tlf;
    }

    /**
     *  Set de tlf
     * @param tlf asigna el parámetro al atributo tld
     */
    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    /**
     *  Get de edad
     * @return devuelve la edad del cliente
     */
    public int getEdad() {
        return edad;
    }

    /**
     *  Set de edad
     * @param edad asigna el parámetro al atributo edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Get de cuenta
     * @return devuelve la cuenta del cliente
     */
    public ArrayList<CCuentaB> getCuenta() {
        return cuenta;
    }

    /**
     * Set de cuenta
     * @param cuenta asigna el parámetro al atributo cuenta
     */
    public void setCuenta(ArrayList<CCuentaB> cuenta) {
        this.cuenta = cuenta;
    }

    //Constructores

    /**
     * Constructor vacio
     */
    public CCliente(){}

    /**
     * Constructor con todos los parámetros
     * @param p1 nombre
     * @param p2 apellido1
     * @param p3 apellido2
     * @param p4 direccion
     * @param p5 nif
     * @param p6 tlf
     * @param p7 edad
     * @param p8 cuenta
     */
    public CCliente(String p1, String p2, String p3, String p4, String p5, 
            int p6,int p7, ArrayList<CCuentaB> p8) {
        nombre = p1;
        apellido1 = p2;
        apellido2 = p3;
        direccion = p4;
        nif = p5;
        tlf = p6;
        edad = p7;
        cuenta = p8;
    }

    //Metodos

    /**
     *  Se hace llamada al método operacionCuenta de la clase CCuentaB pasándole 
     * como parámetros la variable ingresar "true" y la cantidad que se quiere
     * ingresar. 
     * 
     *La variable ingresar es true para que se sume y no se reste en el método
     * operacionCuenta.
     * 
     * @param cuenta Proporciona la o las cuentas en las que se quiere operar
     * @param nroCuenta Indica sobre qué cuenta se quiere ingresra
     * @param cantidad Muestra la cantidad que se ingresa
     */
    public void ingresarDinero (ArrayList<CCuentaB> cuenta,int nroCuenta, int cantidad){
        boolean ingresar = true;
        cuenta.get(nroCuenta).operacionCuenta(cantidad, ingresar);
    }//ingresarDinero
    
    /**
     *  Se hace llamada al método operacionCuenta de la clase CCuentaB pasándole 
     * como parámetros la variable ingresar "false" y la cantidad que se quiere
     * ingresar. 
     * @param cuenta Proporciona la o las cuentas en las que se quiere operar
     * @param nroCuenta Indica sobre qué cuenta se quiere ingresra
     * @param cantidad Muestra la cantidad que se ingresa
     */
    public void retirarDinero (ArrayList<CCuentaB> cuenta, int nroCuenta, int cantidad){
    boolean ingresar = false;
        cuenta.get(nroCuenta).operacionCuenta(cantidad, ingresar);
    }//retirarDinero
    
    /**
     * Método que permite realizar un pago con la tarjeta por cajero o por internet.
     * Esto lo marca el parámetro cajero. Se hace la llamada al método operacionTarjeta 
     * de la clase CCuentaB.
     * 
     * @param cuenta Conjunto de cuentas del cliente
     * @param nroCuenta Cuenta en concreto 
     * @param nroTarj Número de tarjeta vinculada a la cuenta con la que se quiere operar
     * @param cantidad Cantidad a pagar
     * @param cajero True = cajero o False = internet.
     */
    public void realizarPago (ArrayList<CCuentaB> cuenta, int nroCuenta, 
                                int nroTarj, int cantidad, boolean cajero){
        cuenta.get(nroCuenta).operacionTarjeta(cantidad, nroTarj, cajero);
    }//realizarPago

}//CCliente



