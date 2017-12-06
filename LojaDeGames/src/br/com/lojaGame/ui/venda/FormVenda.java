package br.com.lojaGame.ui.venda;

import br.com.lojaGame.exceptions.ClientesException;
import br.com.lojaGame.exceptions.ProdutosException;
import br.com.lojaGame.models.Cliente;
import br.com.lojaGame.models.Produto;
import br.com.lojaGame.models.ItemCart;
import br.com.lojaGame.models.Venda;
import br.com.lojaGame.services.ServicoCliente;
import br.com.lojaGame.services.ServicoProduto;
import br.com.lojaGame.services.ServicoVenda;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormVenda extends javax.swing.JInternalFrame {

    private Venda venda = new Venda();
    private Object cli;
    private float total;

    /**
     * Creates new form FormVenda
     */
    public FormVenda() {
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

        lblID = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        panelAdicionar = new javax.swing.JPanel();
        lblProduto = new javax.swing.JLabel();
        lblQntd = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        txtProduto = new javax.swing.JTextField();
        fTxtQntd = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePesquisaProd = new javax.swing.JTable();
        panelCarrinho = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCarrinho = new javax.swing.JTable();
        buttonExcluir = new javax.swing.JButton();
        buttonFinalizar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        fTxtCPF = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Tela de Venda");

        lblID.setText("CPF");

        lblNome.setText("Nome");

        txtNome.setEditable(false);
        txtNome.setEnabled(false);

        panelAdicionar.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar"));

        lblProduto.setText("Produto");

        lblQntd.setText("Quantidade:");

        btnAdicionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdicionar.setText("Adicionar ao Carrinho");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        txtProduto.setToolTipText("Cód. Barras/Nome");
        txtProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                keyPressedEnterProduto(evt);
            }
        });

        try {
            fTxtQntd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tablePesquisaProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Produto", "Nome", "Plataforma", "Preço Unit."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablePesquisaProd);

        javax.swing.GroupLayout panelAdicionarLayout = new javax.swing.GroupLayout(panelAdicionar);
        panelAdicionar.setLayout(panelAdicionarLayout);
        panelAdicionarLayout.setHorizontalGroup(
            panelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelAdicionarLayout.createSequentialGroup()
                .addGroup(panelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAdicionarLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblQntd))
                    .addGroup(panelAdicionarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdicionarLayout.createSequentialGroup()
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdicionarLayout.createSequentialGroup()
                        .addComponent(fTxtQntd, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAdicionarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAdicionarLayout.setVerticalGroup(
            panelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdicionarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProduto)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQntd)
                    .addComponent(fTxtQntd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(btnAdicionar)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        panelCarrinho.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrinho"));

        tableCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Produto", "Nome", "Plataforma", "Quantidade", "Preço Unit.", "Preço Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCarrinho);

        buttonExcluir.setText("Excluir Produto");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCarrinhoLayout = new javax.swing.GroupLayout(panelCarrinho);
        panelCarrinho.setLayout(panelCarrinhoLayout);
        panelCarrinhoLayout.setHorizontalGroup(
            panelCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarrinhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addGroup(panelCarrinhoLayout.createSequentialGroup()
                        .addComponent(buttonExcluir)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelCarrinhoLayout.setVerticalGroup(
            panelCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarrinhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonFinalizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonFinalizar.setText("Finalizar Pedido");
        buttonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFinalizarActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotal.setText("Total: R$");

        try {
            fTxtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fTxtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                keyPressedEnterCPF(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonFinalizar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTotal)
                        .addGap(151, 151, 151))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelCarrinho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fTxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelAdicionar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fTxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotal)
                .addGap(18, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFinalizar)
                    .addComponent(buttonCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        List<ItemCart> itensCart = venda.getCart();
        for (int i = 0; i < itensCart.size(); i++) {
            ItemCart itemCart = itensCart.get(i);
            itemCart.ajustarEstqCancel();
        }
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed

        try {

            if (tablePesquisaProd.getSelectedRow() >= 0) {

                //sempre que adicionar item no carrindo, total é zerado, para percorrer
                //novamente na tabela e somar
                //somente ao finalizar o pedido, que vai ser enviado o valor total
                total = 0.00f;

                final int rowPesquisa = tablePesquisaProd.getSelectedRow();

                Integer idPesquisa = (Integer) tablePesquisaProd.getValueAt(rowPesquisa, 0);

                Produto prodSelecionado = ServicoProduto.obterProduto(idPesquisa);
                
                DefaultTableModel modelCarrinho = (DefaultTableModel) tableCarrinho.getModel();

                //Adicionando item na venda
                ItemCart item = new ItemCart(prodSelecionado, Integer.parseInt(fTxtQntd.getText()));

                if (Integer.parseInt(fTxtQntd.getText()) <= item.getQntdEstoque()) {
                    venda.addItem(item);

                    //id do produto.
                    Integer ia = item.getIdProd();
                    venda.ajusteEstoque(ia);

                    //aparecer na tabela
                    Object[] row = new Object[6];
                    row[0] = item.getIdProd();
                    row[1] = item.getNomeProd();
                    row[2] = item.getPlataforma();
//                    row[3] = fTxtQntd.getText();
                    //teste
                    row[3] = item.getQntdCompra();
                    row[4] = item.getPrecoUnit();
                    row[5] = item.getValor();
                    modelCarrinho.addRow(row);

                    for (int i = 0; i < tableCarrinho.getRowCount(); i++) {
                        float valorItem = (float) tableCarrinho.getValueAt(i, 5);

                        total += valorItem;

                        lblTotal.setText("Total: R$ %.2f" +total);
                    }
                } else if (item.getQntdEstoque() == 0) {
                    JOptionPane.showMessageDialog(rootPane, "O estoque do produto está vazio");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Só exite " + item.getQntdEstoque() + " quantidade(s) desse produto em estoque");
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Produto não informado/selecionado");
            }

            //limpa o campo de texto Produto e o combo também
            fTxtQntd.setText("");
            txtProduto.setText("");

        } catch (Exception e) {
            //Exibe mensagens de erro na fonte de dados e para o listener
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Falha ao adicionar", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //faz com que a coluna do ID não seja mostrada ao usuário
        tableCarrinho.getColumnModel().getColumn(0).setMinWidth(0);
        tableCarrinho.getColumnModel().getColumn(0).setMaxWidth(0);
        tableCarrinho.getColumnModel().getColumn(0).setWidth(0);
        
        DefaultTableModel modelPesquisaProd = (DefaultTableModel) tablePesquisaProd.getModel();

        modelPesquisaProd.setRowCount(0);        

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void buttonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFinalizarActionPerformed

        try {
            List<ItemCart> itensCart = venda.getCart();

            venda.setCliente(cli);
            venda.setData();

            /*Validando a venda ------------------------------------*/
            //if (fTxtCPF.getText().equals("") || fTxtCPF.getText().equals("   .   .   -  ")) {
            //teste
            if (fTxtCPF.getText() == null) {
                JOptionPane.showMessageDialog(rootPane, "Insira um cliente para realizar a venda!");
                return;
            } else if (txtNome.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Insira um cliente válido!");
                return;
            } else if (venda.contItens() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Nenhum produto foi inserido a venda");
                return;
            }
            /*Fim validando a venda ---------------------------------*/

            //Chama o serviço para cadastro da venda (valida a venda e o list de itens
            ServicoVenda.cadastrarVenda(venda);

            //ajusta o estoque
//            for (int i = 0; i < itensCart.size(); i++) {
//                ItemCart itemCart = itensCart.get(i);
//                itemCart.ajustarEstq();
//            }
            venda.setValorTotal(total);
            JOptionPane.showMessageDialog(rootPane, "Venda realizada com sucesso.",
                    "Finalizado", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_buttonFinalizarActionPerformed

    //carrega a lista de produtos no comboBox assim que pressionar a tecla 'Enter'
    private void keyPressedEnterProduto(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyPressedEnterProduto
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            boolean resultSearch = false;

            try {
                resultSearch = buscaProduto();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                        "Falha ao obter lista", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_keyPressedEnterProduto

    //carrega o nome do cliente assim que é pressionado aqualquer tecla
    private void keyPressedEnterCPF(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyPressedEnterCPF
        //        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        boolean resultSearch = false;

        try {
            resultSearch = buscaCliente();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Falha ao obter lista", JOptionPane.ERROR_MESSAGE);
        }
//        }
    }//GEN-LAST:event_keyPressedEnterCPF

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableCarrinho.getModel();

        //Verifica se há itens selecionados para exclusão.
        //Caso negativo, ignora o comando
        if (tableCarrinho.getSelectedRow() >= 0) {

            //Obtém a linha do item selecionado
            final int row = tableCarrinho.getSelectedRow();

            //Obtém o nome do produto da linha indicada para exibição
            //de mensagem de confirmação de exclusão utilizando seu nome
            String nome = (String) tableCarrinho.getValueAt(row, 1);

            //Mostra o diálogo de confirmação de exclusão
            int resposta = JOptionPane.showConfirmDialog(rootPane,
                    "Excluir o \"" + nome + "\"do carrinho?",
                    "Confirmar exclusão", JOptionPane.YES_NO_OPTION);

            //Se o valor de resposta for "Sim" para a exclusão
            if (resposta == JOptionPane.YES_OPTION) {
                try {

                    //Obtém o valor do item p/ subtrair do total
                    Float valorItem = (float) tableCarrinho.getValueAt(row, 4);

                    //Obtém o ID do produto
                    Integer idItemCart = (Integer) tableCarrinho.getValueAt(row, 0);

                    //deleta o item da venda
                    venda.deleteItem(idItemCart);

                    //exclui a linha da tabela
                    model.removeRow(tableCarrinho.getSelectedRow());

                    //altera a label total
                    lblTotal.setText("Total: R$ " + (total - valorItem));

                } catch (Exception e) {
                    //Se ocorrer algum erro técnico, mostra-o no console,
                    //mas esconde-o do usuário
                    e.printStackTrace();

                    //Exibe uma mensagem de erro genérica ao usuário
                    JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                            "Falha na Exclusão", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    //realiza a busca para achar o cliente que corresponde ao cpf informado
    public boolean buscaCliente() throws ClientesException, Exception {
        List<Cliente> resultadoCliente = ServicoCliente.procurarCliente(fTxtCPF.getText());

        if (resultadoCliente == null || resultadoCliente.size() <= 0) {
            return false;
        }

        for (int i = 0; i < resultadoCliente.size(); i++) {
            Cliente cliente = resultadoCliente.get(i);

            if (cliente != null) {
                txtNome.setText(cliente.getNome());
                cli = cliente;
            }
        }

        return true;
    }

    //realiza a busca para achar os produtos que correspondem ao texto informado
    public boolean buscaProduto() throws ProdutosException, Exception {

        List<Produto> resultadoProd = ServicoProduto.procurarProduto(txtProduto.getText());

        DefaultTableModel modelPesquisaProd = (DefaultTableModel) tablePesquisaProd.getModel();

        modelPesquisaProd.setRowCount(0);

        if (resultadoProd == null || resultadoProd.size() <= 0) {
            return false;
        }

        for (int i = 0; i < resultadoProd.size(); i++) {
            Produto produto = resultadoProd.get(i);

            if (produto != null) {
                Object[] row = new Object[4];
                row[0] = produto.getIdProd();
                row[1] = produto.getNome();
                row[2] = produto.getPlataforma();
                row[3] = produto.getPreco();

                modelPesquisaProd.addRow(row);
            }
        }

        //faz com que a coluna do ID não seja mostrada ao usuário
        tablePesquisaProd.getColumnModel().getColumn(0).setMinWidth(0);
        tablePesquisaProd.getColumnModel().getColumn(0).setMaxWidth(0);
        tablePesquisaProd.getColumnModel().getColumn(0).setWidth(0);

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonFinalizar;
    private javax.swing.JFormattedTextField fTxtCPF;
    private javax.swing.JFormattedTextField fTxtQntd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQntd;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panelAdicionar;
    private javax.swing.JPanel panelCarrinho;
    private javax.swing.JTable tableCarrinho;
    private javax.swing.JTable tablePesquisaProd;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
}
