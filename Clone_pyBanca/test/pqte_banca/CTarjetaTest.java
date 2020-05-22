package pqte_banca;

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
public class CTarjetaTest {
    
    public CTarjetaTest() {
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
     * Test of getLimiteCajero method, of class CTarjeta.
     */
    @Test
    public void testGetLimiteCajero() {
        System.out.println("getLimiteCajero");
        CTarjeta instance = new CTarjeta();
        int expResult = 0;
        int result = instance.getLimiteCajero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLimiteCajero method, of class CTarjeta.
     */
    @Test
    public void testSetLimiteCajero() {
        System.out.println("setLimiteCajero");
        int limiteCajero = 0;
        CTarjeta instance = new CTarjeta();
        instance.setLimiteCajero(limiteCajero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLimiteInternet method, of class CTarjeta.
     */
    @Test
    public void testGetLimiteInternet() {
        System.out.println("getLimiteInternet");
        CTarjeta instance = new CTarjeta();
        int expResult = 0;
        int result = instance.getLimiteInternet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLimiteInternet method, of class CTarjeta.
     */
    @Test
    public void testSetLimiteInternet() {
        System.out.println("setLimiteInternet");
        int limiteInternet = 0;
        CTarjeta instance = new CTarjeta();
        instance.setLimiteInternet(limiteInternet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
