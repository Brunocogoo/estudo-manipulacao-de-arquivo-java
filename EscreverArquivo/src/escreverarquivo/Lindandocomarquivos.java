/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escreverarquivo;

import java.util.Scanner;


public class Lindandocomarquivos {

    /**
     * @param args the command line arguments
     */
    static public void imprimemenu(){
        System.out.println("Opções: \n");
        System.out.println("1- Ver Pessoas cadastradas\n");
        System.out.println("2- Cadastrar pessoas\n");
        System.out.println("3- Sair");

}
    public static void main(String[] args) {
       final int MAXP = 10;
       pessoa [] pessoas = new pessoa [MAXP];
       int np=0;
       int op;
       Scanner scan = new Scanner (System.in);
       ArquivoSaida salvar = new ArquivoSaida();
       ArquivoEntrada abrir = new ArquivoEntrada();
       abrir.abrirarquivo();
       np = abrir.lerarquivo(pessoas);
       abrir.fechararquivo();
       
      /* for (int i=0; i<MAXP;i++)
       {
       if (abrir.pessoas[i]!=null)
       {
       pessoas[i]=abrir.pessoas[i];
       }
       }*/
       
       salvar.carregaArquivo();
       
       
       do {
       // imprime menu
           imprimemenu();
           op = scan.nextInt();
           
       
           
           switch (op){
               case 1: 
                   System.out.println(np+" Pessoas cadastradas");
                   
                   for (int i=0;i<np;i++)
                   {System.out.println(pessoas[i].getNome()+" " +pessoas[i].getIdade());}
                   break;
               case 2:
                   if (np==MAXP){System.out.println("Numero Máximo de pessoas cadastradas");}
                   else 
                   {try{
                       System.out.println("Digite um nome\n");
                      String nome = scan.next();
                       System.out.println("Digite uma idade ");
                       int idade = scan.nextInt();
                      pessoas [np]= new pessoa (nome, idade);
                     salvar.adicionaregistro(nome, idade);
                      np++;
                   System.out.println("Pessoa Cadastrada com sucesso ");
                   }
                   catch(Exception e)
                        {
                            System.out.println("Erro ao cadastrar nova pessoa.");
                        }
                   
                   }
                   break;
               case 3: 
                   salvar.fechararquivo();
                   break;
               
               
           }
       }
       
           while (op!=3);
               
       
          
        
    
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
    
}
