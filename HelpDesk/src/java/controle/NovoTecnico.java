/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.Dao;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Tecnico;

/**
 *
 * @author a120137
 */
@ManagedBean (name="novoTecnico")
@ViewScoped
public class NovoTecnico implements Serializable {
    private Tecnico tecnico;
    private Dao<Tecnico> dao;
    
    public NovoTecnico(){
        tecnico = new Tecnico();
        dao = new Dao(Tecnico.class);
    }
    
}
