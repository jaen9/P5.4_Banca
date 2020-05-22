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
public class CClienteTest {
    
    public CClienteTest() {
    }
    CCuentaB a = new CCuentaB();
    ArrayList<CCuentaB> b = new ArrayList<>();
    CTarjeta tarjeta = new CTarjeta();
    ArrayList<CTarjeta> tarjetas = new ArrayList<>();
    CCliente cli = new CCliente("sergio","jaen","marx","calle"
                                ,"222",65,27,b);

    /**
     * Test of getNombre method, of class CCliente.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        assertEquals("sergio",cli.getNombre());
    }

    /**
     * Test of setNombre method, of class CCliente.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
       cli.setNombre("carlos");
       assertNotEquals("sergio",cli.getNombre());    
    }

    /**
     * Test of getApellido1 method, of class CCliente.
     */
    @Test
    public void testGetApellido1() {
        System.out.println("getApellido1");
        assertEquals("jaen",cli.getApellido1());
    }

    /**
     * Test of setApellido1 method, of class CCliente.
     */
    @Test
    public void testSetApellido1() {
        System.out.println("setApellido1");
        cli.setApellido1("perez");
        assertNotEquals("jaen",cli.getNombre());
    }

    /**
     * Test of getApellido2 method, of class CCliente.
     */
    @Test
    public void testGetApellido2() {
        System.out.println("getApellido2");
        assertEquals("marx",cli.getApellido2());
    }

    /**
     * Test of setApellido2 method, of class CCliente.
     */
    @Test
    public void testSetApellido2() {
        System.out.println("setApellido2");
        cli.setApellido2("lara");
        assertNotEquals("marx",cli.getApellido2());
    }

    /**
     * Test of getDireccion method, of class CCliente.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        assertEquals("calle",cli.getDireccion());
    }

    /**
     * Test of setDireccion method, of class CCliente.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        cli.setDireccion("dir");
        assertNotEquals("calle",cli.getDireccion());
    }

    /**
     * Test of getNif method, of class CCliente.
     */
    @Test
    public void testGetNif() {
        System.out.println("getNif");
        assertEquals("222",cli.getNif());
    }

    /**
     * Test of setNif method, of class CCliente.
     */
    @Test
    public void testSetNif() {
        System.out.println("setNif");
        cli.setNif("333");
        assertNotEquals("222",cli.getNif());
    }

    /**
     * Test of getTlf method, of class CCliente.
     */
    @Test
    public void testGetTlf() {
        System.out.println("getTlf");
        assertEquals(65,cli.getTlf());
    }

    /**
     * Test of setTlf method, of class CCliente.
     */
    @Test
    public void testSetTlf() {
        System.out.println("setTlf");
        cli.setTlf(66);
        assertNotEquals(65,cli.getTlf());
    }

    /**
     * Test of getEdad method, of class CCliente.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        assertEquals(27,cli.getEdad());
    }

    /**
     * Test of setEdad method, of class CCliente.
     */
    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        cli.setEdad(20);
        assertNotEquals(27,cli.getEdad());
    }

    /**
     * Test of getCuenta method, of class CCliente.
     */
    @Test
    public void testGetCuenta() {
        System.out.println("getCuenta");
        b.add(0,a);
        assertEquals(a,cli.getCuenta().get(0));
    }

    /**
     * Test of setCuenta method, of class CCliente.
     */
    @Test
    public void testSetCuenta() {
        System.out.println("setCuenta");
        CCuentaB c = new CCuentaB();
        b.add(0,c);
        assertNotEquals(a,cli.getCuenta().get(0));
    }

    /**
     * Test of ingresarDinero method, of class CCliente.
     */
    @Test
    public void testIngresarDinero() {
        System.out.println("ingresarDinero");
        a.setSaldo(0);
        b.add(a);
        int cantidad = 50;
        cli.ingresarDinero(b, 0, cantidad);
        //b.get(0).operacionCuenta(cantidad, true);
        assertEquals(50,b.get(0).getSaldo());
    }

    /**
     * Test of retirarDinero method, of class CCliente.
     */
    @Test
    public void testRetirarDinero() {
        System.out.println("retirarDinero");
        a.setSaldo(150);
        b.add(a);
        cli.retirarDinero(b, 0, 50);
        assertEquals(100,b.get(0).getSaldo());
    }

    /**
     * Test of realizarPago method, of class CCliente.
     */
    @Test
    public void testRealizarPago() {
        System.out.println("realizarPago");
        a.setSaldo(1500);
        tarjeta.setLimiteCajero(800);
        tarjetas.add(tarjeta);
        a.setTarjeta(tarjetas);
        b.add(0,a);
        
        cli.realizarPago(b,0,0,300,true);
        assertEquals(1200,b.get(0).getSaldo());
    }
    
}
