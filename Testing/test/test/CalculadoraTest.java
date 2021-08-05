/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import ejercicios.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alejo
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
    @Test
    public void testSuma(){
        double num1 = 5.3;
        double num2 = 4.9;
        Calculadora instancia = new Calculadora();
        double expResult = 10.2;
        double result    =instancia.suma(num1, num2);
        assertEquals(expResult,result,0.0);
    }
    @Test 
    public void testResta(){
        double num1 = 6.8;
        double num2 = 3.5;
        Calculadora instancia = new Calculadora();
        double expResult = 3.3;
        double result    = instancia.resta(num1, num2);
        assertEquals(expResult,result,0.0);
    }
    @Test
    public void testMultiplicacion(){
        double num1 = 3.0;
        double num2 = 8.0;
        Calculadora instancia = new Calculadora();
        double expResult = 24.0;
        double result    = instancia.multiplicacion(num1, num2);
        assertEquals(expResult,result,0.0);
    }
    @Test 
    public void testDivision(){
        double num1 = 5 ;
        double num2 = 0 ;
        Calculadora instancia = new Calculadora();
        double expResult = Double.NaN;
        double result    = instancia.division(num1, num2);
        assertEquals(expResult,result,0.0);
        
    }
            
    
}
