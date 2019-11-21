/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lenguajesproyecto2;
import java.util.StringTokenizer;

/**
 *
 * @author alejandrobr
 */
public class Automata {
     String[] arraytokens;
      Resultado a = new Resultado();
     public void Automata(String documento){
         int i=0;
        String nombre=documento;
       
	    StringTokenizer tokens=new StringTokenizer(nombre);
            arraytokens = new String[tokens.countTokens()];
          while(tokens.hasMoreTokens()){
              arraytokens[i]=(tokens.nextToken());
            i++;
        }
         
         for (int j = 0; j < arraytokens.length; j++) {
             System.out.println(arraytokens[j]);
            
         }
         mostrarTokens();
         a.setVisible(true);
     }
     public void mostrarTokens(){
          a.recibirTokens(arraytokens);
     }
     
     public void analizarTokens(){
         for (int i = 0; i < arraytokens.length; i++) {
             
         }
     }
         
        
         
     
    
}
