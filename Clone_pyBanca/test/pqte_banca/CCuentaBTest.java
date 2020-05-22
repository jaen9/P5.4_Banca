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
public class CCuentaBTest {
    
    public CCuentaBTest() {
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
     * Test of getSaldo method, of class CCuentaB.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        CCuentaB instance = new CCuentaB();
        int expResult = 0;
        int result = instance.getSaldo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSaldo method, of class CCuentaB.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        int saldo = 0;
        CCuentaB instance = new CCuentaB();
        instance.setSaldo(saldo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLimite method, of class CCuentaB.
     */
    @Test
    public void testGetLimite() {
        System.out.println("getLimite");
        CCuentaB instance = new CCuentaB();
        int expResult = 0;
        int result = instance.getLimite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLimite method, of class CCuentaB.
     */
    @Test
    public void testSetLimite() {
        System.out.println("setLimite");
        int limite = 0;
        CCuentaB instance = new CCuentaB();
        instance.setLimite(limite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaApertura method, of class CCuentaB.
     */
    @Test
    public void testGetFechaApertura() {
        System.out.println("getFechaApertura");
        CCuentaB instance = new CCuentaB();
        String expResult = "";
        String result = instance.getFechaApertura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaApertura method, of class CCuentaB.
     */
    @Test
    public void testSetFechaApertura() {
        System.out.println("setFechaApertura");
        String fechaApertura = "";
        CCuentaB instance = new CCuentaB();
        instance.setFechaApertura(fechaApertura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTarjeta method, of class CCuentaB.
     */
    @Test
    public void testGetTarjeta() {
        System.out.println("getTarjeta");
        CCuentaB instance = new CCuentaB();
        ArrayList<CTarjeta> expResult = null;
        ArrayList<CTarjeta> result = instance.getTarjeta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTarjeta method, of class CCuentaB.
     */
    @Test
    public void testSetTarjeta() {
        System.out.println("setTarjeta");
        ArrayList<CTarjeta> tarjeta = null;
        CCuentaB instance = new CCuentaB();
        instance.setTarjeta(tarjeta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of operacionCuenta method, of class CCuentaB.
     */
    @Test
    public void testOperacionCuenta() {
        System.out.println("operacionCuenta");
        int cantidad = 0;
        boolean ingresar = false;
        CCuentaB instance = new CCuentaB();
        instance.operacionCuenta(cantidad, ingresar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of operacionTarjeta method, of class CCuentaB.
     */
    @Test
    public void testOperacionTarjeta() {
        System.out.println("operacionTarjeta");
        int cantidad = 0;
        int nroTarj = 0;
        boolean cajero = false;
        CCuentaB instance = new CCuentaB();
        instance.operacionTarjeta(cantidad, nroTarj, cajero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
