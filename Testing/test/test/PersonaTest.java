/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import ejercicios.Persona;
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
public class PersonaTest {
    
    public PersonaTest() {
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
     * Test of calculaIMC method, of class Persona.
     */
    @Test
    public void testCalculaIMC() {
        System.out.println("calculaIMC");
        double altura = 1.75;
        int peso = 65;
        Persona instancia = new Persona();
        double expResult  = 37.142857142857146;
        double result     = instancia.calculaIMC(altura, peso);
        assertEquals(expResult,result,0.0);
    }
    
    @Test
    public void testNombreCompleto() {
        String nombres   = "Alejandro";
        String apellidos = "Casallas";
        Persona instancia = new Persona("Alejandro","Casallas",25,1.77,65);
        String expResult  = instancia.toString(nombres + apellidos);
        String result     =  "AlejandroCasallas";
        assertEquals(expResult,result);
    }
    
}
