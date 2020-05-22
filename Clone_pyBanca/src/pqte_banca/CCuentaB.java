package pqte_banca;



import java.util.ArrayList;

public class CCuentaB {
    //Atributos
    private int saldo;
    private int limite;
    private String fechaApertura;
    private ArrayList<CTarjeta> tarjeta;

    //Getters y setters
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public ArrayList<CTarjeta> getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(ArrayList<CTarjeta> tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    //Constructores
    public CCuentaB(){}
    
    public CCuentaB(int p1, int p2, String p3, ArrayList<CTarjeta> p4) {
        saldo = p1;
        limite = p2;
        fechaApertura = p3;
        tarjeta = p4;
    }

    public CCuentaB(int p1, int p2, String p3) {
        saldo = p1;
        limite = p2;
        fechaApertura = p3;
    }

    
    //Metodos    
    public void operacionCuenta (int cantidad, boolean ingresar){
        if (!ingresar && saldo >= cantidad)
            saldo = saldo - cantidad;
        else
            saldo = saldo + cantidad;
    }//operacionCuenta
    
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
