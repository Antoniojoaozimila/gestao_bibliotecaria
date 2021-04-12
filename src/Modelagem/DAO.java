
package Modelagem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonio joao zimila
 */
public class DAO {
    
    public static void guardar(Manuais m){
        try {
       String sqlSaver="INSERT INTO `dadosbibliotecarios`.`manuais` (`nome`, `classe`, `editora`, `localizacao`) VALUES ('"+m.getNome()+"', '"+m.getClasse()+"','"+m.getEditora()+"', '"+m.getLocalizacao()+"');";
       Connection conn = ConexaoSql.getConexao();
        
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sqlSaver);
            ConexaoSql.close(conn,stmt);
            //System.out.println("gravado com sucesso");
       // JOptionPane.showMessageDialog(null,"gravado com sucesso");
            
        } catch (SQLException ex) {
        //JOptionPane.showMessageDialog(null,"Não foi possivel gravar.");
        ex.printStackTrace();
        }
    } 
    
    public static void deletar(Manuais m){
     try {
          String sqlSaver="DELETE FROM `dadosbibliotecarios`.`manuais` WHERE (`id` = '"+m.getId()+"');";
          Connection conn = ConexaoSql.getConexao();
       
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sqlSaver);
            ConexaoSql.close(conn,stmt);
           // System.out.println("Deletado com sucesso id:."+m.getId());
            // JOptionPane.showMessageDialog(null,"Deletado com sucesso.");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Não foi possivel deletar.");
        }
    }
    
    public static void atualizar(Manuais m){
          try {
       String sqlSaver="UPDATE `dadosbibliotecarios`.`manuais` SET `nome` = '"+m.getNome()+"',`classe` = '"+m.getClasse()+"',`editora` = '"+m.getEditora()+"',`localizacao` = '"+m.getLocalizacao()+"' WHERE `id` = '"+m.getId()+"';";
       Connection conn = ConexaoSql.getConexao();
      
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sqlSaver);
            ConexaoSql.close(conn,stmt);
           // System.out.println("Atualizado com sucesso id:."+m.getId());
           //  JOptionPane.showMessageDialog(null,"Atualizado com sucesso.");
        } catch (SQLException ex) {
       JOptionPane.showMessageDialog(null,"Não foi possivel atualizar.");
        }
        
    }
    
    public static List<Manuais> selecTudo(){
       String sqlSaver="SELECT * FROM dadosbibliotecarios.manuais";
       Connection conn = ConexaoSql.getConexao();
       List<Manuais> manuais = new ArrayList<Manuais>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs =stmt.executeQuery(sqlSaver);
            while(rs.next()){
        manuais.add(new Manuais(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
                rs.getInt(1)));   
            }
            ConexaoSql.close(conn,stmt,rs);
            return manuais;
        } catch (SQLException ex) {
      // ex.printStackTrace();
        }  
        return null;
    }
   
//////////////////////////DAO para gravar dados dos alunos na tabela alunos////////////////////////////////////////////////////////
    
        public static void guardarEstudante(Estudantes e){
              try {
       String sqlSaver="INSERT INTO `dadosbibliotecarios`.`alunos` (`nome`, `sexo`, `contacto`,`residencia`,`turno`,`Manual_1`,`classe_1`,`Manual_2`,`classe_2`,`dataLevanta`,`datadevolucao`) VALUES ('"+e.getNome()+"', '"+e.getSexo()+"','"+e.getContacto()+"','"+e.getResidencia()+"','"+e.getTurno()+"','"+e.getManual1()+"','"+e.getClasse1()+"','"+e.getManual2()+"','"+e.getClasse2()+"','"+e.getDataL()+"','"+e.getDataD()+"');";
       Connection conn = ConexaoSql.getConexao();
      
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sqlSaver);
            ConexaoSql.close(conn,stmt);
          // System.out.println("gravado com sucesso");
          //   JOptionPane.showMessageDialog(null,"gravado com sucesso.");
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Não foi possivel gravar.");
        }
    } 
         public static void deletarAlunos(Estudantes m){
     try {
          String sqlSaver="DELETE FROM `dadosbibliotecarios`.`alunos` WHERE (`id` = '"+m.getId()+"');";
       Connection conn = ConexaoSql.getConexao();
       
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sqlSaver);
            ConexaoSql.close(conn,stmt);
            //System.out.println("Deletado com sucesso id:."+m.getId());
             //  JOptionPane.showMessageDialog(null,"deletado com sucesso.");
        } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null,"Não foi possivel deletar.");
        }
    }
        
         public static List<Estudantes> selecTudoEstudantes(){
              try {
       String sqlSaver="SELECT * FROM dadosbibliotecarios.alunos";
       Connection conn = ConexaoSql.getConexao();
       List<Estudantes> estudantes = new ArrayList<Estudantes>();
       
            Statement stmt = conn.createStatement();
            ResultSet rs =stmt.executeQuery(sqlSaver);
            while(rs.next()){
        estudantes.add(new Estudantes(rs.getString(2),rs.getString(5),rs.getString(4),rs.getString(3).charAt(0),rs.getString(6),
        rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getInt(1)));   
            }
            ConexaoSql.close(conn,stmt,rs);
            return estudantes;
        } catch (SQLException ex) {
     //  ex.printStackTrace();
        }  
        return null;
    }
    
   ///////////////////Dao para grvar Manuais de Venda///////////////////////
         
 public static void guardarManuaisVenda(Manuais m){
       try {
       String sqlSaver="INSERT INTO `dadosbibliotecarios`.`manuaisvenda` (`nome`, `classe`, `editora`, `preco`) VALUES ('"+m.getNome()+"', '"+m.getClasse()+"','"+m.getEditora()+"', '"+m.getPreco()+"');";
       Connection conn = ConexaoSql.getConexao();
      
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sqlSaver);
            ConexaoSql.close(conn,stmt);
         //   System.out.println("gravado com sucesso");
          // JOptionPane.showMessageDialog(null,"gravado com sucesso.");
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Não foi possivel gravar.");
        }
    } 
 
   
         public static List<Manuais> selecTudoManuaisVenda(){
                try {
       String sqlSaver="SELECT * FROM dadosbibliotecarios.manuaisvenda";
       Connection conn = ConexaoSql.getConexao();
       List<Manuais> m = new ArrayList<Manuais>();
     
            Statement stmt = conn.createStatement();
            ResultSet rs =stmt.executeQuery(sqlSaver);
            while(rs.next()){
        m.add(new Manuais(rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(1))); 
            }
            ConexaoSql.close(conn,stmt,rs);
            return m;
        } catch (SQLException ex) {
     //  ex.printStackTrace();
        }  
        return null;
    }
         
           public static void deletarManuaisVenda(Manuais m){
                try {
    
       String sqlSaver="DELETE FROM `dadosbibliotecarios`.`manuaisvenda` WHERE (`id` = '"+m.getId()+"');";
       Connection conn = ConexaoSql.getConexao();
       
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sqlSaver);
            ConexaoSql.close(conn,stmt);
          //  System.out.println("Deletado com sucesso id:."+m.getId());
          //  JOptionPane.showMessageDialog(null,"deletado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi possvel deletar.");
        }
    }
            public static void atualizarManualVenda(Manuais m){
          try {
       String sqlSaver="UPDATE `dadosbibliotecarios`.`manuaisvenda` SET `nome` = '"+m.getNome()+"',`classe` = '"+m.getClasse()+"',`editora` = '"+m.getEditora()+"',`preco` = '"+m.getPreco()+"' WHERE `id` = '"+m.getId()+"';";
       Connection conn = ConexaoSql.getConexao();
      
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sqlSaver);
            ConexaoSql.close(conn,stmt);
           // System.out.println("Atualizado com sucesso id:."+m.getId());
           //  JOptionPane.showMessageDialog(null,"Atualizado com sucesso.");
        } catch (SQLException ex) {
       JOptionPane.showMessageDialog(null,"Não foi possivel atualizar.");
        }
        
    }
    
    
    
}
