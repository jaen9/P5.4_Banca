package pqte_banca;


import java.util.ArrayList;

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
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<CCuentaB> getCuenta() {
        return cuenta;
    }

    public void setCuenta(ArrayList<CCuentaB> cuenta) {
        this.cuenta = cuenta;
    }

    //Constructores
    public CCliente(){}

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
    public void ingresarDinero (ArrayList<CCuentaB> cuenta,int nroCuenta, int cantidad){
        boolean ingresar = true;
        cuenta.get(nroCuenta).operacionCuenta(cantidad, ingresar);
    }//ingresarDinero
    
    public void retirarDinero (ArrayList<CCuentaB> cuenta, int nroCuenta, int cantidad){
    boolean ingresar = false;
        cuenta.get(nroCuenta).operacionCuenta(cantidad, ingresar);
    }//retirarDinero
    
    public void realizarPago (ArrayList<CCuentaB> cuenta, int nroCuenta, 
                                int nroTarj, int cantidad, boolean cajero){
        cuenta.get(nroCuenta).operacionTarjeta(cantidad, nroTarj, cajero);
    }//realizarPago

}//CCliente



