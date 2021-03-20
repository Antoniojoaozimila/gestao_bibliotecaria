
package Controladores;

import Modelagem.ConexaoSql;
import Modelagem.DAO;
import Modelagem.Estudantes;
import Modelagem.Manuais;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Antonio joao zimila
 */
public class Controlador {
    
    public static void main(String[]zimila){
   
      // NiveisDeAcesso n = new NiveisDeAcesso();
       //n.setVisible(true);
    //  Connection conection =ConexaoSql.getConexao(); 
  // atualizar();
 //guardar();
   //deletar();
 // List<Manuais> lista =selectAl(); //ou assim   List<Manuais> lista =selecTudo(); chando directamnte sem usar o metodo local
 // System.out.println(lista);

    
    }
    
    public static void guardar(){
    DAO m = new DAO();
    Estudantes e = new Estudantes("test","test","test",'M',"test","test","test","test","test","0","0");
    m.guardarEstudante(e);
     
    }
    
    public static void deletar(){
        DAO m = new DAO(); 
          Manuais manuais = new Manuais();
          manuais.setId(4);
          m.deletar(manuais);
        
    }
    
     public static void atualizar(){
        DAO m = new DAO(); 
          Manuais manuais = new Manuais("Jose","12classe","plural","B",3);
          m.atualizar(manuais); 
         
    }
     public static List<Manuais> selectAl(){
        return DAO.selecTudo();  
     }
    
   
    }

