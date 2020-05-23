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
    CTarjeta tar = new CTarjeta(200,500);
    ArrayList<CTarjeta> tars = new ArrayList<>();
    CCuentaB cu = new CCuentaB(200,30,"1/1/1");
    
    

    /**
     * Test of getSaldo method, of class CCuentaB.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        assertEquals(200,cu.getSaldo());
    }

    /**
     * Test of setSaldo method, of class CCuentaB.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        cu.setSaldo(2000);
        assertNotEquals(200,cu.getSaldo());
    }

    /**
     * Test of getLimite method, of class CCuentaB.
     */
    @Test
    public void testGetLimite() {
        System.out.println("getLimite");
        assertEquals(30,cu.getLimite());
    }

    /**
     * Test of setLimite method, of class CCuentaB.
     */
    @Test
    public void testSetLimite() {
        System.out.println("setLimite");
        cu.setLimite(55);
        assertNotEquals(50,cu.getLimite());
    }

    /**
     * Test of getFechaApertura method, of class CCuentaB.
     */
    @Test
    public void testGetFechaApertura() {
        System.out.println("getFechaApertura");
        assertEquals("1/1/1",cu.getFechaApertura());
    }

    /**
     * Test of setFechaApertura method, of class CCuentaB.
     */
    @Test
    public void testSetFechaApertura() {
        System.out.println("setFechaApertura");
        cu.setFechaApertura("23/05/2020");
        assertNotEquals("1/1/1",cu.getFechaApertura());    
    }

    /**
     * Test of getTarjeta method, of class CCuentaB.
     */
    @Test
    public void testGetTarjeta() {
        System.out.println("getTarjeta");
        tars.add(0,tar);
        cu.setTarjeta(tars);
        assertEquals(tars,cu.getTarjeta());
    }

    /**
     * Test of setTarjeta method, of class CCuentaB.
     */
    @Test
    public void testSetTarjeta() {
        System.out.println("setTarjeta");
        tars.add(0,tar);
        cu.setTarjeta(tars);
        ArrayList<CTarjeta> tars1 = new ArrayList<>();
        assertNotEquals(tars1,cu.getTarjeta());
    }

    /**
     * Test of operacionCuenta method, of class CCuentaB.
     */
    @Test
    public void testOperacionCuenta() {
        System.out.println("operacionCuenta");
        cu.operacionCuenta(100, true);
        assertEquals(300,cu.getSaldo());

    }
     /**
     * Test of operacionCuenta1 method, of class CCuentaB.
     */
        @Test
        public void testOperacionCuenta1() {
        System.out.println("operacionCuenta");
        cu.operacionCuenta(100, false);
        assertEquals(100,cu.getSaldo());
        }

    /**
     * Test of operacionTarjeta method by cajero, of class CCuentaB.
     */
    @Test
    public void testOperacionTarjeta() {
        System.out.println("operacionTarjeta");
        tars.add(0,tar);
        cu = new CCuentaB(1000, 200, "1/1/1",tars);
        cu.operacionTarjeta(200, 0, true);
        assertEquals(800,cu.getSaldo());
    }
     /**
     * Test of operacionTarjeta1 method by internet, of class CCuentaB.
     */
    @Test
    public void testOperacionTarjeta1() {
        System.out.println("operacionTarjeta");
        tars.add(0,tar);
        cu = new CCuentaB(1000, 200, "1/1/1",tars);
        cu.operacionTarjeta(150, 0, false);
        assertEquals(850,cu.getSaldo());
    }
}
