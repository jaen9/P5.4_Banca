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
    CTarjeta tar = new CTarjeta(800,500);
    
    /**
     * Test of getLimiteCajero method, of class CTarjeta.
     */
    @Test
    public void testGetLimiteCajero() {
        System.out.println("getLimiteCajero");
        assertEquals(800,tar.getLimiteCajero());
    }

    /**
     * Test of setLimiteCajero method, of class CTarjeta.
     */
    @Test
    public void testSetLimiteCajero() {
        System.out.println("setLimiteCajero");
        tar.setLimiteCajero(100);
        assertNotEquals(800,tar.getLimiteCajero());
    }

    /**
     * Test of getLimiteInternet method, of class CTarjeta.
     */
    @Test
    public void testGetLimiteInternet() {
        System.out.println("getLimiteInternet");
        assertEquals(500,tar.getLimiteInternet());
    }

    /**
     * Test of setLimiteInternet method, of class CTarjeta.
     */
    @Test
    public void testSetLimiteInternet() {
        System.out.println("setLimiteInternet");
        tar.setLimiteInternet(100);
        assertNotEquals(500,tar.getLimiteInternet());
    }
    
}
