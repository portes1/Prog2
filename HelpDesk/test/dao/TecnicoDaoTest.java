/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Tecnico;
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
public class TecnicoDaoTest {
    
    public TecnicoDaoTest() {
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
     * Test of inserir method, of class TecnicoDao.
     */
    @Test
    public void testInserir() {
       TecnicoDao dao = new TecnicoDao();
       Tecnico tec = new Tecnico("FULANO", "Fulano da Silva", "1234");
       dao.inserir(tec);
    }
    
}
