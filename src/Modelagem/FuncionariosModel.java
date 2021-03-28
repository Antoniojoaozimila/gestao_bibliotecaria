
package Modelagem;

import java.io.Serializable;

/**
 *
 * @author Antonio joao zimila
 */
public class FuncionariosModel extends Pessoa implements Serializable {
  
   private String userName,senha;

    public FuncionariosModel(String userName, String senha, String nome, String residencia, String contacto, char sexo) {
        super(nome, residencia, contacto, sexo);
        this.userName = userName;
        this.senha = senha;
    }

    public FuncionariosModel(String nome, char sexo, String userName, String senha, String contacto) {
         this.nome=nome;
         this.sexo=sexo;
         this.userName=userName;
         this.senha=senha;
         this.contacto=contacto;
    }

    public String getUserName() {
        return userName;
    }

   
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSenha() {
        return senha;
    }

  
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
   
}
