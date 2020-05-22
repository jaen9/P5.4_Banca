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
    
    public CGestorBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of modificarPerfil method, of class CGestorB.
     */
    @Test
    public void testModificarPerfil() {
        System.out.println("modificarPerfil");
        CCliente p1 = null;
        String nomb = "";
        String ape1 = "";
        String ape2 = "";
        String dir = "";
        String nif = "";
        int tlf = 0;
        int edad = 0;
        ArrayList<CCuentaB> cue = null;
        CGestorB instance = new CGestorB();
        instance.modificarPerfil(p1, nomb, ape1, ape2, dir, nif, tlf, edad, cue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearPerfil method, of class CGestorB.
     */
    @Test
    public void testCrearPerfil() {
        System.out.println("crearPerfil");
        CCliente p1 = null;
        String nomb = "";
        String ape1 = "";
        String ape2 = "";
        String dir = "";
        String nif = "";
        int tlf = 0;
        int edad = 0;
        ArrayList<CCuentaB> cue = null;
        CGestorB instance = new CGestorB();
        instance.crearPerfil(p1, nomb, ape1, ape2, dir, nif, tlf, edad, cue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
