/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escreverarquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
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
  
   public int lerarquivo (pessoa pessoas[]){
  
       while (entrada.hasNext())
       {
       String nome = entrada.next();
       int idade = entrada.nextInt();
            pessoas [np]= new pessoa (nome, idade);
       np++;
       }
       
   return np;
   }
  
  
public void fechararquivo ()
{entrada.close();}
  
  
    
}
