
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;

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
public class NomeBean implements Serializable{
    private String nome;
    private List<String> nomes = new ArrayList<>();
    
    private HtmlInputText inputNome;
    private HtmlCommandButton botaoAdicionar;
    
    public void adicionar(){
        this.nomes.add(nome);
        this.inputNome.setValue("");
        
        if(this.nomes.size() > 3){
            this.inputNome.setDisabled(true);
            this.botaoAdicionar.setDisabled(true);
            this.botaoAdicionar.setValue("Muitos Nomes...");
                    
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }

    public HtmlInputText getInputNome() {
        return inputNome;
    }

    public void setInputNome(HtmlInputText inputNome) {
        this.inputNome = inputNome;
    }

    public HtmlCommandButton getBotaoAdicionar() {
        return botaoAdicionar;
    }

    public void setBotaoAdicionar(HtmlCommandButton botaoAdicionar) {
        this.botaoAdicionar = botaoAdicionar;
    }
    
    
}
