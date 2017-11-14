package br.com.lojaGame.ui.cliente;

import br.com.lojaGame.model.cliente.Cliente;
import br.com.lojaGame.service.cliente.ServicoCliente;
import java.util.Date;
import javax.swing.JOptionPane;

public class FormCadastrarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormCadastrarCliente
     */
    public FormCadastrarCliente() {
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

        panelInfPessoais = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblDataNasc = new javax.swing.JLabel();
        fTxtDataNasc = new javax.swing.JFormattedTextField();
        txtNomeCliente = new javax.swing.JTextField();
        lblRG = new javax.swing.JLabel();
        comboSexo = new javax.swing.JComboBox<>();
        lblSexo = new javax.swing.JLabel();
        lblEstCivil = new javax.swing.JLabel();
        comboEstCivil = new javax.swing.JComboBox<>();
        fTxtCPF = new javax.swing.JFormattedTextField();
        fTxtRG = new javax.swing.JFormattedTextField();
        panelEndereco = new javax.swing.JPanel();
        fTxtCEP = new javax.swing.JFormattedTextField();
        lblCEP = new javax.swing.JLabel();
        lblLog = new javax.swing.JLabel();
        txtLog = new javax.swing.JTextField();
        lblNum = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        txtComp = new javax.swing.JTextField();
        lblComp = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtUF = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        lblUF = new javax.swing.JLabel();
        panelContato = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        buttonCadastrar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Cliente");

        panelInfPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Pessoais"));

        lblNome.setText("Nome");

        lblCPF.setText("CPF");

        lblDataNasc.setText("Data de Nasc.");

        fTxtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));

        lblRG.setText("RG");

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Feminino", "Masculino", "Outros" }));

        lblSexo.setText("Sexo");

        lblEstCivil.setText("Estado Civil");

        comboEstCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viuvo(a)" }));

        try {
            fTxtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            fTxtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-A")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout panelInfPessoaisLayout = new javax.swing.GroupLayout(panelInfPessoais);
        panelInfPessoais.setLayout(panelInfPessoaisLayout);
        panelInfPessoaisLayout.setHorizontalGroup(
            panelInfPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfPessoaisLayout.createSequentialGroup()
                        .addGroup(panelInfPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome)
                            .addGroup(panelInfPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSexo)
                                .addComponent(lblCPF)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInfPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelInfPessoaisLayout.createSequentialGroup()
                                .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDataNasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fTxtDataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                            .addGroup(panelInfPessoaisLayout.createSequentialGroup()
                                .addComponent(fTxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fTxtRG))
                            .addComponent(txtNomeCliente)))
                    .addGroup(panelInfPessoaisLayout.createSequentialGroup()
                        .addComponent(lblEstCivil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboEstCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInfPessoaisLayout.setVerticalGroup(
            panelInfPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(6, 6, 6)
                .addGroup(panelInfPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(lblRG)
                    .addComponent(fTxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fTxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexo)
                    .addComponent(lblDataNasc)
                    .addComponent(fTxtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstCivil)
                    .addComponent(comboEstCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        try {
            fTxtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCEP.setText("CEP");

        lblLog.setText("Log.");

        lblNum.setText("Nº");

        lblComp.setText("Compl.");

        lblBairro.setText("Bairro");

        lblCidade.setText("Cidade");

        lblUF.setText("UF");

        javax.swing.GroupLayout panelEnderecoLayout = new javax.swing.GroupLayout(panelEndereco);
        panelEndereco.setLayout(panelEnderecoLayout);
        panelEnderecoLayout.setHorizontalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCEP)
                        .addComponent(lblLog)
                        .addComponent(lblNum, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lblCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCidade)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEnderecoLayout.createSequentialGroup()
                                .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblComp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtComp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEnderecoLayout.createSequentialGroup()
                                .addComponent(lblBairro)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnderecoLayout.createSequentialGroup()
                                .addComponent(lblUF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairro)))
                    .addComponent(fTxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLog, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );
        panelEnderecoLayout.setVerticalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCEP)
                    .addComponent(fTxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLog)
                    .addComponent(txtLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNum)
                    .addComponent(txtComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComp)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade)
                    .addComponent(lblUF))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelContato.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        lblEmail.setText("Email");

        lblTel.setText("Telefone");

        javax.swing.GroupLayout panelContatoLayout = new javax.swing.GroupLayout(panelContato);
        panelContato.setLayout(panelContatoLayout);
        panelContatoLayout.setHorizontalGroup(
            panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTel)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelContatoLayout.setVerticalGroup(
            panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInfPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCadastrar)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInfPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadastrar)
                    .addComponent(buttonCancelar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        //instancia o cliente
        Cliente cliente = new Cliente();

        //obtem as informações dos campos
        //Informações Pessoais
        cliente.setNome(txtNomeCliente.getText());
        cliente.setCPF(fTxtCPF.getText());
        cliente.setRG(fTxtRG.getText());
        cliente.setSexo((String) comboSexo.getSelectedItem());

        //pra data de nascimento, seguindo o modelo do prof
        Date data = null;
        try {
            data = (Date) fTxtDataNasc.getValue();
            cliente.setDataNasc(data);
        } catch (Exception e) {

        }

        cliente.setEstadoCivil((String) comboEstCivil.getSelectedItem());

        //Endereço
        cliente.setCep(fTxtCEP.getText());
        cliente.setLogradouro(txtLog.getText());
        cliente.setNumero(txtNum.getText());
        cliente.setComplemento(txtComp.getText());
        cliente.setBairro(txtBairro.getText());
        cliente.setCidade(txtCidade.getText());
        cliente.setUF(txtUF.getText());

        //Contato
        cliente.setTelefone(txtTel.getText());
        cliente.setEmail(txtEmail.getText());

        try {
            //Chama o serviço para cadastro do cliente
            ServicoCliente.cadastrarCliente(cliente);
        } catch (Exception e) {
            //Exibe mensagens de erro para o usuário
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //se tudo tiver certo, exibe mensagem
        JOptionPane.showMessageDialog(rootPane, "Cliente inserido com sucesso.",
                "Cadastro efetuado!", JOptionPane.INFORMATION_MESSAGE);

        //Limpa os campos da tela após realizar a inserção
        txtNomeCliente.setText("");
        fTxtCPF.setText("");
        fTxtRG.setText("");
        comboSexo.setSelectedIndex(0);
        fTxtDataNasc.setValue(null);
        comboEstCivil.setSelectedIndex(0);

        fTxtCEP.setValue(null);
        txtLog.setText("");
        txtNum.setText("");
        txtComp.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtUF.setText("");

        txtTel.setText("");
        txtEmail.setText("");
    }//GEN-LAST:event_buttonCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JComboBox<String> comboEstCivil;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JFormattedTextField fTxtCEP;
    private javax.swing.JFormattedTextField fTxtCPF;
    private javax.swing.JFormattedTextField fTxtDataNasc;
    private javax.swing.JFormattedTextField fTxtRG;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComp;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstCivil;
    private javax.swing.JLabel lblLog;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblUF;
    private javax.swing.JPanel panelContato;
    private javax.swing.JPanel panelEndereco;
    private javax.swing.JPanel panelInfPessoais;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComp;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLog;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtUF;
    // End of variables declaration//GEN-END:variables
}
