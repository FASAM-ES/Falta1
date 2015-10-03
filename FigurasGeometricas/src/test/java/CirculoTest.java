/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
 */

import br.edu.fasam.figurasgeometricas.Circulo;
import junit.framework.TestCase;

/**
 *
 * @author Administrador
 */
public class CirculoTest extends TestCase {
    
    public CirculoTest(String testName) {
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

    /**
     *
     */
    public void testCalcularArea() {
   Circulo circulo = new Circulo(10);
   assertEquals(314,(int) circulo.calcularArea());
   }
}
