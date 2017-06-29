
package listatelefonica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


  public class ArquivoEntrada {
    pessoa [] pessoas = new pessoa [10];
     private Scanner entrada;
     public int np=0;
     public void abrirarquivo()
  {
      try {
          entrada = new Scanner (new File ("listapessoas.txt"));
      } catch (FileNotFoundException ex) {
          System.out.println("Erro");
      }
  }
  
   public int lerarquivo (pessoa [] pessoas){
  
       while (entrada.hasNext())
       {
       String nome = entrada.next();
       String telefone = entrada.next();
       pessoas [np]= new pessoa (nome, telefone);
       np++;
       }
       
       return np;
    }
  
  
    public void fechararquivo ()
       {entrada.close();}
  
  
    
}
