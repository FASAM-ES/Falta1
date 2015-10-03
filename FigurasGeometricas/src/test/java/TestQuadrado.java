/*
 * DVDTo change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import br.edu.fasam.figurasgeometricas.Quadrado;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

/**
 *
 * @author Aluno
 */
public class TestQuadrado extends TestCase {
    
    public TestQuadrado(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    public void testAreaQuadrado(){
        Quadrado quad = new Quadrado(4);
        assertEquals(16, (int)quad.calcularArea());
        
        Quadrado quad1 = new Quadrado(0);
        assertEquals(0, (int)quad1.calcularArea());
    }
    
    public void testPerimetroQuadrado(){
        Quadrado quad = new Quadrado(5);
        assertEquals(20, (int)quad.CalcularPerimetro());
    }
     
    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
