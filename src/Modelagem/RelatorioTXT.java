
package Modelagem;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Antonio joao zimila
 */
public class RelatorioTXT {
    
     public static  void escritaAlunos(String caminho,int id,String nome,String manual1,String classe1,String manual2,String classe2,String dataL,String dataD,String status) throws IOException {
    	
    	BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(caminho,true));

    //	bufferedwriter.append("======================RELATORIO====================");
    //	bufferedwriter.newLine();
    	bufferedwriter.append("              CODIGO: "+id+"\n");
    	bufferedwriter.newLine();
    	bufferedwriter.append("                NOME: "+nome+"\n");
    	bufferedwriter.newLine();
        bufferedwriter.append("  MANUAL_1 LEVANTADO: "+manual1+"\n");
    	bufferedwriter.newLine();
        bufferedwriter.append("            CLASSE_1: "+classe1+"\n");
    	bufferedwriter.newLine();
        bufferedwriter.append("  MANUAL_2 LEVANTADO: "+manual2+"\n");
    	bufferedwriter.newLine();
    	bufferedwriter.append("            CLASSE_2: "+classe2+"\n");
    	bufferedwriter.newLine();
    	bufferedwriter.append("DATA DE LEVANTAMENTO: "+dataL+"\n");
    	bufferedwriter.newLine();
        bufferedwriter.append("   DATA DE DEVOLUCAO: "+dataD+"\n");
    	bufferedwriter.newLine();
    	bufferedwriter.append("              STATUS: "+status+"\n");
    	bufferedwriter.newLine();
    	
    	bufferedwriter.append("=====================================================================================================\n");
        bufferedwriter.newLine();
    	bufferedwriter.close();

    }
    
   
    
    
    
}
