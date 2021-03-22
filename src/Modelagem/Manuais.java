
package Modelagem;

//import java.io.Serializable;
//import java.io.InvalidClassException;

/**
 *
 * @author Antonio joao zimila
 */
public class Manuais /*implements Serializable*/{
    private String nome,classe,editora,localizacao;
    private  int id,preco;
    

    public Manuais(String nome, String classe, String editora, String localizacao) {
        this.nome = nome;
        this.classe = classe;
        this.editora = editora;
        this.localizacao = localizacao;
    }

    public Manuais(String nome, String classe, String editora, String localizacao, int id) {
        this.nome = nome;
        this.classe = classe;
        this.editora = editora;
        this.localizacao = localizacao;
        this.id = id;
    }
     public Manuais(String nome,String classe,String editora,int preco) {
        this.nome = nome;
        this.classe = classe;
        this.editora = editora;
        this.preco=preco;
    }
      public Manuais(String nome,String classe,String editora,int preco,int id) {
        this.nome = nome;
        this.classe = classe;
        this.editora = editora;
        this.preco=preco;
        this.id=id;
    }
    
    

    public Manuais() {
      
    }

    
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public String getClasse() {
        return classe;
    }

   
    public void setClasse(String classe) {
        this.classe = classe;
    }


    public String getEditora() {
        return editora;
    }

    
    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
/*
    @Override
    public String toString() {
        return "Manuais{" + "nome=" + nome + ", classe=" + classe + ", editora=" + editora + ", localizacao=" + localizacao + ", id=" + id + '}';
    }
*/
    
    public int getPreco() {
        return preco;
    }

   
    public void setPreco(int preco) {
        this.preco = preco;
    }

    
   

}
