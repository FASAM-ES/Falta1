/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import br.edu.fasam.figurasgeometricas.Quadrado;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class QuadradoTest {
    
    public QuadradoTest() {
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
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    public void testCalcularArea() {
        Quadrado quad = new Quadrado();
        
        assertEquals(16, (int)quad.calcularArea());
        
    }
}