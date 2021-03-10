
package Modelagem;

/**
 *
 * @author Antonio joao zimila
 */
public class Funcionarios extends Pessoa {
  
   private String userName,senha;

    public Funcionarios(String userName, String senha, String nome, String residencia, String contacto, char sexo) {
        super(nome, residencia, contacto, sexo);
        this.userName = userName;
        this.senha = senha;
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
