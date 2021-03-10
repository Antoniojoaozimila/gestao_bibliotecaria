
package Modelagem;

/**
 *
 * @author Antonio joao zimila
 */
public class Estudantes extends Pessoa {
  private String turno;
  private String dataLevanta,dataDevolucao,manual1,classe1,manual2,classe2,dataL,dataD;
  private int id;
  
  

    public Estudantes(String nome, String residencia, String contacto, char sexo,String turno,String manual1,String classe1,String manual2,String classe2,String dataL,String dataD) {
        super(nome, residencia, contacto, sexo);
       
        this.turno=turno;
        this.dataDevolucao=dataDevolucao;
        this.dataLevanta=dataLevanta;
        this.residencia=residencia;
        this.manual1=manual1;
        this.classe1=classe1;
        this.manual2=manual2;
        this.classe2=classe2;
        this.dataL=dataL;
        this.dataD=dataD;
        this.contacto=contacto; 
    }
    
    public Estudantes(String nome, String residencia, String contacto, char sexo,String turno,String manual1,String classe1,String manual2,String classe2,String dataL,String dataD,int id) {
        super(nome, residencia, contacto, sexo);
       
        this.turno=turno;
        this.dataDevolucao=dataDevolucao;
        this.dataLevanta=dataLevanta;
        this.residencia=residencia;
        this.manual1=manual1;
        this.classe1=classe1;
        this.manual2=manual2;
        this.classe2=classe2;
        this.dataL=dataL;
        this.dataD=dataD;
        this.contacto=contacto; 
        this.id=id;
    }
    
    public Estudantes(){
   
            
    }

 
   
    public String getTurno() {
        return turno;
    }

    
    public void setTurno(String turno) {
        this.turno = turno;
    }

    /**
     * @return the manual1
     */
    public String getManual1() {
        return manual1;
    }

    /**
     * @param manual1 the manual1 to set
     */
    public void setManual1(String manual1) {
        this.manual1 = manual1;
    }

    public String getClasse1() {
        return classe1;
    }

    public void setClasse1(String classe1) {
        this.classe1 = classe1;
    }

    /**
     * @return the manual2
     */
    public String getManual2() {
        return manual2;
    }

  
    public void setManual2(String manual2) {
        this.manual2 = manual2;
    }

   
    public String getClasse2() {
        return classe2;
    }

    public void setClasse2(String classe2) {
        this.classe2 = classe2;
    }

   
    public String getDataL() {
        return dataL;
    }


    public void setDataL(String dataL) {
        this.dataL = dataL;
    }

  
    public String getDataD() {
        return dataD;
    }

    public void setDataD(String dataD) {
        this.dataD = dataD;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
