/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tallerpruebas.Punto11;

/**
 *
 * @author juanf
 */
public class Punto11Test {
    
    private Punto11 p;
    
    public Punto11Test() {
        p = new Punto11();
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
    public void addTest() {
        int valorEsperado = 15;
        String numeros = "1-\n%---2,3,4\n5";
        assertEquals(valorEsperado, p.add(numeros));
    }
    
    @Test
    public void addSinComasTest(){
        int valorEsperado = 15;
        String numeros = "1\n\n%\n2\n3\n4\n5";
        assertEquals(valorEsperado, p.add(numeros));
    }
    
    @Test
    public void addSinSaltoDeLineaTest(){
        int valorEsperado = 15;
        String numeros = "1,2,,,,%%3,4,5";
        assertEquals(valorEsperado, p.add(numeros));
    }
}
