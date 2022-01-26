/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// PRECISA ARRUMAR CÓDIGO

package visao;

import javax.swing.JOptionPane;
import sql.SqlProduto;


public class ConProduto extends javax.swing.JFrame {
   SqlProduto prod = new SqlProduto();

   public ConProduto() {
        initComponents();
    }

    public void limpar(){
        tfCodProdCon.setText("");
        tfNomeProdCon.setText("");
        jtDescricaoProdCon.setText("");
        tfValorProdCon.setText("");
        tfSaldoProdCon.setText("");
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nome_Fornec = new javax.swing.JLabel();
        cod_Fornec = new javax.swing.JLabel();
        tfCodProdCon = new javax.swing.JTextField();
        botaoEditar_ConFornec = new javax.swing.JButton();
        botaoSalvar_ConFornec = new javax.swing.JButton();
        botaoExcluir_ConFornec = new javax.swing.JButton();
        botaoLimpar_ConFornec = new javax.swing.JButton();
        botaoVoltaMenu_ConFornec = new javax.swing.JButton();
        nome_Fornec1 = new javax.swing.JLabel();
        tfValorProdCon = new javax.swing.JTextField();
        nome_Fornec2 = new javax.swing.JLabel();
        tfNomeProdCon = new javax.swing.JTextField();
        nome_Fornec3 = new javax.swing.JLabel();
        jtDescricaoProdCon = new javax.swing.JTextField();
        tfSaldoProdCon = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar Produto"));

        nome_Fornec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nome_Fornec.setText("Descrição:");

        cod_Fornec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cod_Fornec.setText("Digite o código");

        tfCodProdCon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCodProdConFocusLost(evt);
            }
        });
        tfCodProdCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodProdConActionPerformed(evt);
            }
        });

        botaoEditar_ConFornec.setText("Editar");
        botaoEditar_ConFornec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditar_ConFornecActionPerformed(evt);
            }
        });

        botaoSalvar_ConFornec.setText("Salvar");
        botaoSalvar_ConFornec.setEnabled(false);
        botaoSalvar_ConFornec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvar_ConFornecActionPerformed(evt);
            }
        });

        botaoExcluir_ConFornec.setText("Excluir");
        botaoExcluir_ConFornec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluir_ConFornecActionPerformed(evt);
            }
        });

        botaoLimpar_ConFornec.setText("Limpar");
        botaoLimpar_ConFornec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimpar_ConFornecActionPerformed(evt);
            }
        });

        botaoVoltaMenu_ConFornec.setText("Voltar para o Menu");
        botaoVoltaMenu_ConFornec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltaMenu_ConFornecActionPerformed(evt);
            }
        });

        nome_Fornec1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nome_Fornec1.setText("Valor Unitário:");

        tfValorProdCon.setEnabled(false);
        tfValorProdCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorProdConActionPerformed(evt);
            }
        });

        nome_Fornec2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nome_Fornec2.setText("Saldo em estoque:");

        tfNomeProdCon.setEnabled(false);
        tfNomeProdCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeProdConActionPerformed(evt);
            }
        });

        nome_Fornec3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nome_Fornec3.setText("Nome Produto:");

        jtDescricaoProdCon.setEnabled(false);
        jtDescricaoProdCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDescricaoProdConActionPerformed(evt);
            }
        });

        tfSaldoProdCon.setEnabled(false);
        tfSaldoProdCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSaldoProdConActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome_Fornec2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(botaoEditar_ConFornec)
                        .addGap(7, 7, 7)
                        .addComponent(botaoSalvar_ConFornec)
                        .addGap(10, 10, 10)
                        .addComponent(botaoExcluir_ConFornec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoLimpar_ConFornec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoVoltaMenu_ConFornec))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cod_Fornec)
                            .addComponent(nome_Fornec)
                            .addComponent(nome_Fornec3)
                            .addComponent(nome_Fornec1))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfValorProdCon, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfCodProdCon, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfNomeProdCon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                .addComponent(jtDescricaoProdCon, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                            .addComponent(tfSaldoProdCon, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cod_Fornec)
                    .addComponent(tfCodProdCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNomeProdCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome_Fornec3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtDescricaoProdCon, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome_Fornec)
                        .addGap(50, 50, 50)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome_Fornec1)
                    .addComponent(tfValorProdCon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_Fornec2)
                    .addComponent(tfSaldoProdCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoEditar_ConFornec)
                    .addComponent(botaoVoltaMenu_ConFornec)
                    .addComponent(botaoExcluir_ConFornec)
                    .addComponent(botaoSalvar_ConFornec)
                    .addComponent(botaoLimpar_ConFornec))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLimpar_ConFornecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimpar_ConFornecActionPerformed
        limpar();  
    }//GEN-LAST:event_botaoLimpar_ConFornecActionPerformed

    private void botaoVoltaMenu_ConFornecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltaMenu_ConFornecActionPerformed
        dispose();
    }//GEN-LAST:event_botaoVoltaMenu_ConFornecActionPerformed

    private void tfCodProdConFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodProdConFocusLost
        prod.consultar(Integer.parseInt(tfCodProdCon.getText()));
            tfNomeProdCon.setText(prod.getNomeProduto());
            jtDescricaoProdCon.setText(prod.getDescricaoProduto());
            tfValorProdCon.setText(prod.getValorProduto());
    }//GEN-LAST:event_tfCodProdConFocusLost

    private void botaoEditar_ConFornecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditar_ConFornecActionPerformed
     tfNomeProdCon.setEnabled(true);
     jtDescricaoProdCon.setEnabled(true);
     tfValorProdCon.setEnabled(true);
     botaoSalvar_ConFornec.setEnabled(true);
     botaoEditar_ConFornec.setEnabled(false);
    }//GEN-LAST:event_botaoEditar_ConFornecActionPerformed

    private void botaoSalvar_ConFornecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvar_ConFornecActionPerformed
    prod.editar(Integer.parseInt(tfCodProdCon.getText()),
     tfNomeProdCon.getText(),jtDescricaoProdCon.getText(), tfValorProdCon.getText());
     tfNomeProdCon.setEnabled(false);
     jtDescricaoProdCon.setEnabled(false);
     tfValorProdCon.setEnabled(false);
     botaoSalvar_ConFornec.setEnabled(false);
     botaoEditar_ConFornec.setEnabled(true);
    }//GEN-LAST:event_botaoSalvar_ConFornecActionPerformed

    private void botaoExcluir_ConFornecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluir_ConFornecActionPerformed
       int resp = JOptionPane.showConfirmDialog(null,
               "Tem certeza que deseja excluir o registro?",
               "Excluir",JOptionPane.YES_NO_OPTION);
       if(resp == 0){
           prod.excluir(Integer.parseInt(tfCodProdCon.getText()));
           limpar();
       }
    }//GEN-LAST:event_botaoExcluir_ConFornecActionPerformed

    private void tfCodProdConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodProdConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodProdConActionPerformed

    private void tfValorProdConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorProdConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorProdConActionPerformed

    private void tfNomeProdConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeProdConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeProdConActionPerformed

    private void jtDescricaoProdConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDescricaoProdConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDescricaoProdConActionPerformed

    private void tfSaldoProdConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaldoProdConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSaldoProdConActionPerformed

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
            java.util.logging.Logger.getLogger(ConProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConProduto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditar_ConFornec;
    private javax.swing.JButton botaoExcluir_ConFornec;
    private javax.swing.JButton botaoLimpar_ConFornec;
    private javax.swing.JButton botaoSalvar_ConFornec;
    private javax.swing.JButton botaoVoltaMenu_ConFornec;
    private javax.swing.JLabel cod_Fornec;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtDescricaoProdCon;
    private javax.swing.JLabel nome_Fornec;
    private javax.swing.JLabel nome_Fornec1;
    private javax.swing.JLabel nome_Fornec2;
    private javax.swing.JLabel nome_Fornec3;
    private javax.swing.JTextField tfCodProdCon;
    private javax.swing.JTextField tfNomeProdCon;
    private javax.swing.JTextField tfSaldoProdCon;
    private javax.swing.JTextField tfValorProdCon;
    // End of variables declaration//GEN-END:variables
}
