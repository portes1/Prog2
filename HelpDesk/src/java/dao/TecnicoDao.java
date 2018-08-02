/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import modelo.Tecnico;
import util.JpaUtil;

/**
 *
 * @author Pedro
 */
public class TecnicoDao {
    
    public boolean inserir(Tecnico tec){
        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(tec);
        tx.commit();
        manager.close();
        return true;
    }
}
