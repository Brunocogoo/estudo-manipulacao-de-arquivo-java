/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escreverarquivo;

import java.io.FileNotFoundException;
import java.util.Formatter;

/**
 *
 * @author Aluno
 */
public class ArquivoSaida {
      private Formatter arq;
    
    public void carregaArquivo (){
    try { arq = new Formatter ("listapessoas.txt");
    } catch (FileNotFoundException ex ){ System.out.println("Erro");
    }
    
}
  public void adicionaregistro(String nome, int idade){
  
  arq.format ("%s \n %d \n", nome,idade);
  }  
    
  public void fechararquivo()
  {arq.close();}
}
