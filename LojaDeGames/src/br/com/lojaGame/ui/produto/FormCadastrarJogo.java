package br.com.lojaGame.ui.produto;

import br.com.lojaGame.models.Produto;
import br.com.lojaGame.services.ServicoProduto;
import javax.swing.JOptionPane;

public class FormCadastrarJogo extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormCadastrarJogo
     */
    public FormCadastrarJogo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblFab = new javax.swing.JLabel();
        txtFab = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        buttonCancelar = new javax.swing.JButton();
        buttonCadastrar = new javax.swing.JButton();
        lblPlat = new javax.swing.JLabel();
        comboPlat = new javax.swing.JComboBox<>();
        lblPreco = new javax.swing.JLabel();
        lblJogadores = new javax.swing.JLabel();
        lblFaixaEt = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        comboJogadores = new javax.swing.JComboBox<>();
        comboFaixaEt = new javax.swing.JComboBox<>();
        lblEstoque = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Cadastro de Jogo");

        lblNome.setText("* Nome");

        lblFab.setText("Fabricante");

        lblCategoria.setText("* Categoria");

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Ação", "Aventura", "Corrida", "Em Grupo/Familia", "Esporte", "Estratégia", "Infantil", "Luta", "Música", "RPG", "Simulação", "Terror", "Tiro", "Suspense/Terror" }));

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonCadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        lblPlat.setText("* Plataforma");

        comboPlat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Playstation 4", "Xbox One", "Playstation 3", "Xbox 360", "Nintendo Wii U", "Nintendo 3DS", "PC" }));

        lblPreco.setText("* Preço R$");

        lblJogadores.setText("Jogadores");

        lblFaixaEt.setText("* Faixa Etária");

        comboJogadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "SinglePlayer", "Multiplayer" }));

        comboFaixaEt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Livre", "10 anos", "12 anos", "14 anos", "16 anos", "18 anos" }));

        lblEstoque.setText("* Qntd. Estoque");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(buttonCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonCadastrar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEstoque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCategoria)
                                    .addComponent(lblFab)
                                    .addComponent(lblFaixaEt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboFaixaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                        .addComponent(lblJogadores)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFab, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblPreco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPreco))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblPlat)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboPlat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlat)
                    .addComponent(comboPlat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFab)
                    .addComponent(txtFab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFaixaEt)
                    .addComponent(comboFaixaEt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJogadores)
                    .addComponent(comboJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstoque))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonCadastrar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        //instancia o jogo
        Produto jogo = new Produto();

        //obtem as informações do campos
        jogo.setNome(txtNome.getText());
        jogo.setCategoria((String) comboCategoria.getSelectedItem());
        jogo.setPlataforma((String) comboPlat.getSelectedItem());
        jogo.setFabricante(txtFab.getText());

        jogo.setFaixaEtaria((String) comboFaixaEt.getSelectedItem());
        jogo.setQtdJogadores((String) comboJogadores.getSelectedItem());

        try {

            if (txtEstoque.getText().isEmpty()) {
                jogo.setQtdEstoque(0);
            } else {
                jogo.setQtdEstoque(Integer.parseInt(txtEstoque.getText()));
            }
            
            if (txtPreco.getText().isEmpty()) {
                jogo.setPreco(0);
            } else {
                jogo.setPreco(Float.parseFloat(txtPreco.getText()));
            }
            //Chama o serviço para cadastro do jogo
            ServicoProduto.cadastrarProduto(jogo);

        } catch (Exception e) {
            //Exibe mensagens de erro para o usuário
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //se tudo tiver certo, exibe mensagem
        JOptionPane.showMessageDialog(rootPane, "Jogo inserido com sucesso.",
                "Cadastro efetuado!", JOptionPane.INFORMATION_MESSAGE);

        //Limpa os campos da tela após realizar a inserção
        txtNome.setText("");
        comboCategoria.setSelectedIndex(0);
        comboPlat.setSelectedIndex(0);
        txtFab.setText("");
        txtPreco.setText("");
        comboFaixaEt.setSelectedIndex(0);
        comboJogadores.setSelectedIndex(0);
        txtEstoque.setText("");
    }//GEN-LAST:event_buttonCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(FormCadastrarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastrarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastrarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastrarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastrarJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboFaixaEt;
    private javax.swing.JComboBox<String> comboJogadores;
    private javax.swing.JComboBox<String> comboPlat;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblEstoque;
    private javax.swing.JLabel lblFab;
    private javax.swing.JLabel lblFaixaEt;
    private javax.swing.JLabel lblJogadores;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPlat;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtFab;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
