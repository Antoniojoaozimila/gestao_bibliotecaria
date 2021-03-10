
package Modelagem;

/**
 *
 * @author Antonio joao zimila
 */
public class Pessoa {
    private String nome;
    protected String residencia;
    protected String contacto;
    private char sexo;

    public Pessoa(String nome, String residencia, String contacto, char sexo) {
        this.nome = nome;
        this.residencia = residencia;
        this.contacto = contacto;
        this.sexo = sexo;
    }
    public Pessoa(){
       
    }
   
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataNascimento
     */

    /**
     * @param dataNascimento the dataNascimento to set
     */

    public String getResidencia() {
        return residencia;
    }

    
    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    
  
    
    public char getSexo() {
        return sexo;
    }

   
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    
    public String getContacto() {
        return contacto;
    }

    
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    
    
    
    
    
}
