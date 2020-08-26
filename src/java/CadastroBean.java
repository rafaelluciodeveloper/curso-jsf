
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rafael
 */
@ManagedBean
@ViewScoped
public class CadastroBean implements Serializable{
    
    private String nome;
    
    public void cadastrar(){
        FacesContext context = FacesContext.getCurrentInstance();
        
        FacesMessage messagem = new FacesMessage(FacesMessage.SEVERITY_INFO,"Cadastro Efetuado","Cliente " + this.nome + " Cadastro Efetuado com Suscesso.");
        context.addMessage(null, messagem);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }
}
