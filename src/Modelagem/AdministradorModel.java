
package Modelagem;

import java.io.Serializable;

/**
 *
 * @author Antonio joao zimila
 */
public class AdministradorModel extends Pessoa implements Serializable{
     private String userName,senha;

    public AdministradorModel(String nome,String residencia,String contacto,char sexo,String userName,String senha) {
        super(nome, residencia, contacto, sexo);
        this.userName = userName;
        this.senha = senha;
        this.nome=nome;
        this.sexo=sexo;
        this.residencia=residencia;
    }
     public AdministradorModel(String nome,String residencia,char sexo,String userName,String senha) {
        this.userName = userName;
        this.senha = senha;
        this.nome=nome;
        this.sexo=sexo;
        this.residencia=residencia;
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
