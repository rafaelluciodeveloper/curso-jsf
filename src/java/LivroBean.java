
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

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
public class LivroBean implements Serializable{
    private List<Livro> livros;
    private Livro novoLivro;
    
    private int total = 0;
    
    public LivroBean(){
        this.livros = new ArrayList<>();
        this.novoLivro = new Livro();
    }
    
    public void adicionar(){
        this.livros.add(this.novoLivro);
        this.novoLivro = new Livro();
        total = this.livros.size();
    }
    
    public void excluir(Livro livro){
        this.livros.remove(livro);
        total = this.livros.size();
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public Livro getNovoLivro() {
        return novoLivro;
    }

    public void setNovoLivro(Livro novoLivro) {
        this.novoLivro = novoLivro;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }        
    
}
