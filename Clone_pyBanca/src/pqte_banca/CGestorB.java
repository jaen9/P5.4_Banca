package pqte_banca;
import java.util.ArrayList;

/**
 *  Clase del gestor del banco que puede modificar un cliente o añadir un cliente
 * @author Sergio Jaen
 * @version 1.0
 * @since 1.0
 */
public class CGestorB {
    
    //Constructor

    /**
     * Constructor vacio
     */
    public CGestorB(){}
    
    //Metodos

    /**
     * Método que actualiza un cliente que se pasa por parámetro asignándole 
     * de nuevo todos sus atributos. 
     * 
     * @param p1 Cliente
     * @param nomb Nombre
     * @param ape1 Apellido1
     * @param ape2 Apellido2
     * @param dir Direccion
     * @param nif Nif
     * @param tlf Tlf
     * @param edad Edad
     * @param cue Cuenta
     */
    public void modificarPerfil(CCliente p1,
            String nomb,
            String ape1,
            String ape2,
            String dir,
            String nif,
            int tlf,
            int edad,
            ArrayList<CCuentaB> cue){
        
        p1.setNombre(nomb);
        p1.setApellido1(ape1);
        p1.setApellido2(ape2);
        p1.setDireccion(dir);
        p1.setNif(nif);
        p1.setTlf(tlf);
        p1.setEdad(edad);
        p1.setCuenta(cue);
    
    }//modificarPerfil
    
    /**
     * Método que crea un nuevo cliente recibiendo por parámetro todos sus
     * atributos y devuelve el objeto cliente
     * 
     * @param nomb Nombre
     * @param ape1 Apellido1
     * @param ape2 Apellido2
     * @param dir Direccion
     * @param nif Nif
     * @param tlf Tlf 
     * @param edad Edad
     * @param cue Cuenta
     * @return objeto CCliente creado.
     */
    public CCliente crearPerfil (
            String nomb,
            String ape1,
            String ape2,
            String dir,
            String nif,
            int tlf,
            int edad,
            ArrayList<CCuentaB> cue){
        CCliente cliente = new CCliente(nomb,ape1,ape2,dir,nif,tlf,edad,cue);    
        return cliente;
    
    }//crearPerfil
}
