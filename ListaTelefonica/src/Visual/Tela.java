/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import java.util.Scanner;
import javax.swing.JOptionPane;
import listatelefonica.ArquivoEntrada;
import listatelefonica.ArquivoSaida;
import listatelefonica.cadastro;
import listatelefonica.pessoa;

/**
 *
 * @author Aluno
 */
public class Tela extends javax.swing.JFrame {

  
        
      
    public Tela() {
        initComponents();
      
        ArquivoEntrada arqEntrada = new ArquivoEntrada();
        arqEntrada.abrirarquivo();
        np = arqEntrada.lerarquivo(pessoas);
        arqEntrada.fechararquivo();
     
        
    }
  
        int MAXP = 10;
        pessoa[] pessoas = new pessoa[MAXP];
        int np=0;
        
        
       
        
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fechar = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botaocadastrar = new javax.swing.JButton();
        camponome = new javax.swing.JTextField();
        campotelefone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        botaofechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecharMouseClicked(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Telefone");

        botaocadastrar.setText("Cadastrar");
        botaocadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaocadastrarActionPerformed(evt);
            }
        });

        camponome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CADASTRAR TELEFONE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(camponome, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(campotelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(botaocadastrar)))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(143, 143, 143))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(camponome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campotelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(botaocadastrar)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        fechar.addTab("Incluir", jPanel1);

        jButton1.setText("LISTAR NUMEROS CADASTRADOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jButton1)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        fechar.addTab("Listar", jPanel2);

        botaofechar.setText("Fechar");
        botaofechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaofecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaofechar)
                .addContainerGap(361, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaofechar)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        fechar.addTab("Fechar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fechar)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fechar)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void camponomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camponomeActionPerformed

    private void botaocadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocadastrarActionPerformed
     
        //Adcionar no vetor
        if(np>=MAXP)
                        
      JOptionPane.showMessageDialog(null,"Limite de pessoas cadastradas atingido");
      else{
          pessoas [np]=new pessoa();
        pessoas[np].setNome(camponome.getText());
      pessoas[np].setTelefone(campotelefone.getText());
      np++;
       JOptionPane.showMessageDialog(null,"Pessoa Adcionada com Sucesso!");
      }
      //Adcionar no arquivo de Texto
      ArquivoSaida arquivo1 = new ArquivoSaida();
                    arquivo1.carregaArquivo();
                    for(int i=0;i<np;i++)
                    arquivo1.adicionaregistro(pessoas[i].getNome(),pessoas[i].getTelefone());
                    arquivo1.fechararquivo();
                    
    }//GEN-LAST:event_botaocadastrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println(np+" Pessoas cadastradas:");
        String tudo="";
                    /*for(int i=0;i<np;i++)
                    {System.out.println(pessoas[i].getNome() + ", " + pessoas[i].getTelefone());
                    
                    }*/
                    
                    for(int i=0;i<np;i++)
                    {tudo=(tudo +""+ pessoas[i].getNome() + ", " + pessoas[i].getTelefone()+"\n");
                    
                    }
                    JOptionPane.showMessageDialog(null,tudo);
                    
                    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharMouseClicked
        
    }//GEN-LAST:event_fecharMouseClicked

    private void botaofecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaofecharActionPerformed
 ArquivoSaida arquivo1 = new ArquivoSaida();
                    arquivo1.carregaArquivo();
                    for(int i=0;i<np;i++)
                    arquivo1.adicionaregistro(pessoas[i].getNome(),pessoas[i].getTelefone());
                    arquivo1.fechararquivo();
                   System.exit(1);        // TODO add your handling code here:
    }//GEN-LAST:event_botaofecharActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaocadastrar;
    private javax.swing.JButton botaofechar;
    private javax.swing.JTextField camponome;
    private javax.swing.JTextField campotelefone;
    private javax.swing.JTabbedPane fechar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
