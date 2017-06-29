
package listatelefonica;

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
  public void adicionaregistro(String nome, String idade){
  
    arq.format ("%s \n %s \n", nome,idade);
  }  
    
  public void fechararquivo()
    {arq.close();}
}
