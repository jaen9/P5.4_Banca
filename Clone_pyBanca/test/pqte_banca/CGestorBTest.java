package pqte_banca;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author socek
 */
public class CGestorBTest {
    
    CCuentaB a = new CCuentaB();
    ArrayList<CCuentaB> b = new ArrayList<>();
    CCliente cli = new CCliente("sergio","jaen","marx","calle"
                                ,"222",65,27,b);

    /**
     * Test of modificarPerfil method, of class CGestorB.
     */
    @Test
    public void testModificarPerfil() {
        System.out.println("modificarPerfil");
        CGestorB gest = new CGestorB();
        gest.modificarPerfil(cli, "a", "b", "c", "d", "e", 1, 2, b);
        assertEquals("a",cli.getNombre());
        assertEquals("b",cli.getApellido1());
        assertEquals("c",cli.getApellido2());
        assertEquals("d",cli.getDireccion());
        assertEquals("e",cli.getNif());
        assertEquals(1,cli.getTlf());
        assertEquals(2,cli.getEdad());
        assertEquals(b,cli.getCuenta());
    }

    /**
     * Test of crearPerfil method, of class CGestorB.
     */
    @Test
    public void testCrearPerfil() {
        System.out.println("crearPerfil");
        CGestorB gest = new CGestorB();
        CCliente cliente;
        cliente = gest.crearPerfil("a", "jaen", "c", "d", "222", 65, 27, b);
        assertNotEquals(cliente.getNombre(),cli.getNombre());
        assertEquals(cliente.getApellido1(),cli.getApellido1());
        assertNotEquals(cliente.getApellido2(),cli.getApellido2());
        assertNotEquals(cliente.getDireccion(),cli.getDireccion());
        assertEquals(cliente.getNif(),cli.getNif());
        assertEquals(cliente.getTlf(),cli.getTlf());
        assertEquals(cliente.getEdad(),cli.getEdad());
        assertEquals(cliente.getCuenta(),cli.getCuenta());
    }
    
}
