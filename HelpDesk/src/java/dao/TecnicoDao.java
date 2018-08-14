/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import modelo.Usuario;
import util.JpaUtil;

/**
 *
 * @author Pedro
 */
public class TecnicoDao {
    
    
     public Usuario autenticar(Usuario usu){
        Usuario temp = null; // administrador retornado na consulta ao banco
        EntityManager manager = JpaUtil.getEntityManager();
        TypedQuery<Usuario> query = manager.createQuery("SELECT a FROM Usuario a WHERE a.login = :login AND a.senha = :senha",
                Usuario.class); 
        query.setParameter("login", usu.getLogin());
        query.setParameter("senha", usu.getSenha());
        try{
            temp = query.getSingleResult(); 
        }
        catch(Exception e){ 
            
        }     //aqui poderia haver um tratamento de exceção mais decente
        finally{
            manager.close();
        }        
        return temp;
    }
    public boolean inserir(Usuario tec){
        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(tec);
        tx.commit();
        manager.close();
        return true;
    }
}
