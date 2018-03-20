/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pedro
 */
public class AeroportoTest {
    
    public AeroportoTest() {
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
     * Test of decolar method, of class Aeroporto.
     */
    //@Test
   /* public void testDecolar() {
        System.out.println("decolar");      
        Aviao a = new Aviao();
        a.prefixo = "PR-TE";
        a.companhia = "TAM";
     
    }*/

    /**
     * Test of aterrisar method, of class Aeroporto.
     */
    @Test
    public void testAterrisar() {
        System.out.println("aterrisar");
        Aviao a = new Aviao();
        a.prefixo = "PR-TE";
        a.companhia = "TAM";
        aterrisar(Aviao a);
    }

    /**
     * Test of listar method, of class Aeroporto.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        Aeroporto instance = new Aeroporto();
        instance.listar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
