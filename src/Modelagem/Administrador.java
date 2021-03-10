
package Modelagem;

/**
 *
 * @author Antonio joao zimila
 */
public class Administrador {
     private String userName,senha;

    public Administrador(String userName, String senha) {
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
