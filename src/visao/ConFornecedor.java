/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import sql.SqlEndereco;
import sql.SqlFornecedor;


public class ConFornecedor extends javax.swing.JFrame {
   SqlEndereco end = new SqlEndereco();
   SqlFornecedor forn = new SqlFornecedor();
    public ConFornecedor() {
        initComponents();
    }

    public void limpar(){
        tfNomeForn.setText("");
        tfCep.setText("");
        tfTelForn.setText("");
        tfCep.setText("");
        tfRua.setText("");
        tfNum.setText("");
        tfBairro.setText("");
        tfCidade.setText("");
        tfEstado.setText("");
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nome_Fornec = new javax.swing.JLabel();
        cnpj = new javax.swing.JLabel();
        tfNomeForn = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        rua = new javax.swing.JLabel();
        bairro = new javax.swing.JLabel();
        cidade = new javax.swing.JLabel();
        tfRua = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        estado = new javax.swing.JLabel();
        tfEstado = new javax.swing.JTextField();
        num = new javax.swing.JLabel();
        tfNum = new javax.swing.JTextField();
        cep = new javax.swing.JLabel();
        tfCep = new javax.swing.JFormattedTextField();
        cod_Fornec = new javax.swing.JLabel();
        tfCodFornec = new javax.swing.JTextField();
        botaoEditar_ConFornec = new javax.swing.JButton();
        botaoSalvar_ConFornec = new javax.swing.JButton();
        botaoExcluir_ConFornec = new javax.swing.JButton();
        botaoLimpar_ConFornec = new javax.swing.JButton();
        botaoVoltaMenu_ConFornec = new javax.swing.JButton();
        tel_Fornec = new javax.swing.JLabel();
        tfTelForn = new javax.swing.JTextField();
        tfCnpj = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar Fornecedor"));

        nome_Fornec.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nome_Fornec.setText("Nome:");

        cnpj.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cnpj.setText("CNPJ:");

        tfNomeForn.setEnabled(false);
        tfNomeForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeFornActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        rua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rua.setText("Rua:");

        bairro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bairro.setText("Bairro:");

        cidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cidade.setText("Cidade:");

        tfRua.setEnabled(false);
        tfRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRuaActionPerformed(evt);
            }
        });

        tfBairro.setEnabled(false);
        tfBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBairroActionPerformed(evt);
            }
        });

        tfCidade.setEnabled(false);

        estado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        estado.setText("Estado:");

        tfEstado.setEnabled(false);

        num.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        num.setText("Número/Complemento:");

        tfNum.setEnabled(false);
        tfNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumActionPerformed(evt);
            }
        });

        cep.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cep.setText("CEP:");

        try {
            tfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCep.setEnabled(false);
        tfCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(cidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(estado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfBairro))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(num)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rua)
                        .addGap(18, 18, 18)
                        .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cep)
                        .addGap(18, 18, 18)
                        .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cep, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfCep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rua)
                    .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num)
                    .addComponent(tfNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bairro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfBairro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estado)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidade))
                .addContainerGap())
        );

        cod_Fornec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cod_Fornec.setText("Digite o código");

        tfCodFornec.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCodFornecFocusLost(evt);
            }
        });
        tfCodFornec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodFornecActionPerformed(evt);
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

        tel_Fornec.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tel_Fornec.setText("Tel.:");

        tfTelForn.setEnabled(false);
        tfTelForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelFornActionPerformed(evt);
            }
        });

        try {
            tfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCnpj.setEnabled(false);
        tfCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCnpjActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(nome_Fornec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cnpj)
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfNomeForn, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfCnpj)))
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
                        .addComponent(cod_Fornec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCodFornec, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tel_Fornec)
                        .addGap(18, 18, 18)
                        .addComponent(tfTelForn))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cod_Fornec)
                    .addComponent(tfCodFornec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_Fornec)
                    .addComponent(tfNomeForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnpj)
                    .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tel_Fornec)
                    .addComponent(tfTelForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeFornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeFornActionPerformed

    private void tfRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRuaActionPerformed

    private void tfBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBairroActionPerformed

    private void botaoLimpar_ConFornecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimpar_ConFornecActionPerformed
        limpar();  
    }//GEN-LAST:event_botaoLimpar_ConFornecActionPerformed

    private void botaoVoltaMenu_ConFornecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltaMenu_ConFornecActionPerformed
        dispose();
    }//GEN-LAST:event_botaoVoltaMenu_ConFornecActionPerformed

    private void tfCodFornecFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodFornecFocusLost
        forn.consultar(Integer.parseInt(tfCodFornec.getText()));
            tfNomeForn.setText(forn.getNome());
            tfCep.setText(forn.getCnpj());
            tfTelForn.setText(forn.getTel());
        end.consultar(forn.getIdEndereco());
            tfCep.setText(end.getCep());
            tfRua.setText(end.getRua());
            tfNum.setText(end.getNum());
            tfBairro.setText(end.getBairro());
            tfCidade.setText(end.getCidade());
            tfEstado.setText(end.getEstado());
    }//GEN-LAST:event_tfCodFornecFocusLost

    private void botaoEditar_ConFornecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditar_ConFornecActionPerformed
     tfNomeForn.setEnabled(true);
     tfCep.setEnabled(true);
     tfTelForn.setEnabled(true);
     tfCep.setEnabled(true);
     tfRua.setEnabled(true);
     tfNum.setEnabled(true);
     tfBairro.setEnabled(true);
     tfCidade.setEnabled(true);
     tfEstado.setEnabled(true);
     botaoSalvar_ConFornec.setEnabled(true);
     botaoEditar_ConFornec.setEnabled(false);
    }//GEN-LAST:event_botaoEditar_ConFornecActionPerformed

    private void botaoSalvar_ConFornecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvar_ConFornecActionPerformed
    forn.editar(Integer.parseInt(tfCodFornec.getText()),
            tfNomeForn.getText(),tfCep.getText(), tfNum.getText());
    end.editar(forn.getIdEndereco(),tfCep.getText(), tfRua.getText(), tfNum.getText(),
            tfBairro.getText(),tfCidade.getText(),tfEstado.getText());
    
     tfNomeForn.setEnabled(false);
     tfCep.setEnabled(false);
     tfTelForn.setEnabled(false);
     tfCep.setEnabled(false);
     tfRua.setEnabled(false);
     tfNum.setEnabled(false);
     tfBairro.setEnabled(false);
     tfCidade.setEnabled(false);
     tfEstado.setEnabled(false);
     botaoSalvar_ConFornec.setEnabled(false);
     botaoEditar_ConFornec.setEnabled(true);
    }//GEN-LAST:event_botaoSalvar_ConFornecActionPerformed

    private void botaoExcluir_ConFornecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluir_ConFornecActionPerformed
       int resp = JOptionPane.showConfirmDialog(null,
               "Tem certeza que deseja excluir o registro?",
               "Excluir",JOptionPane.YES_NO_OPTION);
       if(resp == 0){
           forn.excluir(Integer.parseInt(tfCodFornec.getText()));
           end.excluir(forn.getIdEndereco());
           limpar();
       }
    }//GEN-LAST:event_botaoExcluir_ConFornecActionPerformed

    private void tfCodFornecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodFornecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodFornecActionPerformed

    private void tfTelFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelFornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelFornActionPerformed

    private void tfNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumActionPerformed

    private void tfCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCepActionPerformed

    private void tfCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCnpjActionPerformed

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
            java.util.logging.Logger.getLogger(ConFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConFornecedor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairro;
    private javax.swing.JButton botaoEditar_ConFornec;
    private javax.swing.JButton botaoExcluir_ConFornec;
    private javax.swing.JButton botaoLimpar_ConFornec;
    private javax.swing.JButton botaoSalvar_ConFornec;
    private javax.swing.JButton botaoVoltaMenu_ConFornec;
    private javax.swing.JLabel cep;
    private javax.swing.JLabel cidade;
    private javax.swing.JLabel cnpj;
    private javax.swing.JLabel cod_Fornec;
    private javax.swing.JLabel estado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel nome_Fornec;
    private javax.swing.JLabel num;
    private javax.swing.JLabel rua;
    private javax.swing.JLabel tel_Fornec;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JFormattedTextField tfCep;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JFormattedTextField tfCnpj;
    private javax.swing.JTextField tfCodFornec;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfNomeForn;
    private javax.swing.JTextField tfNum;
    private javax.swing.JTextField tfRua;
    private javax.swing.JTextField tfTelForn;
    // End of variables declaration//GEN-END:variables
}
