package pqte_banca;
import java.util.ArrayList;

public class CGestorB {
    
    //Constructor
    public CGestorB(){}
    
    //Metodos
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
    
    public void crearPerfil (CCliente p1,
            String nomb,
            String ape1,
            String ape2,
            String dir,
            String nif,
            int tlf,
            int edad,
            ArrayList<CCuentaB> cue){

    ArrayList<CCuentaB> cuenta  = new ArrayList<>();
    p1 = new CCliente(nomb,ape1,ape2,dir,nif,tlf,edad,cue);
    }//crearPerfil
}
