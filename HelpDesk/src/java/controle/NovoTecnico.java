/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.Dao;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelo.Usuario;

/**
 *
 * @author a120137
 */
@ManagedBean (name="novoTecnico")
@ViewScoped
public class NovoTecnico implements Serializable {
    private Usuario tecnico;
    private Dao<Usuario> dao;
    
    public NovoTecnico(){
        tecnico = new Usuario();
        dao = new Dao(Usuario.class);
    }
    
      public void inserirTecnico(){
        getDao().inserir(getTecnico());
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage (FacesMessage.SEVERITY_INFO,"Usuário cadastrado", null));
        setTecnico(new Usuario());
    }   

    public Usuario getTecnico() {
        return tecnico;
    }

    public Dao<Usuario> getDao() {
        return dao;
    }

    public void setTecnico(Usuario tecnico) {
        this.tecnico = tecnico;
    }
    
    
    
}
