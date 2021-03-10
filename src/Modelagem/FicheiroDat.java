/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Antonio joao zimila
 */
public class FicheiroDat {
    
    
    public static void escrever(ArrayList<Object> lista,String nomeArq){
			
		File arquivo = new File(nomeArq);
		
		try{
			
			arquivo.delete();
			arquivo.createNewFile();
			
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(arquivo));
			output.writeObject(lista);
			
			
			output.close();
			
		}
		catch(IOException c){
			System.out.println(c);
			
		}
	}
	
	public static ArrayList<Object> leitura(String nomeAquivo){
	
		ArrayList<Object> lista = new ArrayList<>();
		
		
		try{
			
			File arquivo = new File(nomeAquivo);
			
			
			if(arquivo.exists()){
				
				ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(arquivo));
				
				lista = (ArrayList<Object>) objectInputStream.readObject();
			
				objectInputStream.close();
				
			}
			
			
		}
		catch(IOException e){
			System.out.print(e);
			
		}
		catch(ClassNotFoundException x){
			System.out.println(x);
			
		}
		
		
	return (lista);	
	}
      
}
