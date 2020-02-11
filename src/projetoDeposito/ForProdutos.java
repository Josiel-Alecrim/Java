
package projetoDeposito;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansCadastro;
import modeloBeans.BeansProdutos;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;
import modeloDao.DaoCadastro;
import modeloDao.DaoProdutos;


public class ForProdutos extends javax.swing.JFrame {
    
    modeloBeans.BeansProdutos mod = new modeloBeans.BeansProdutos();//INSTANCIANADO MODELO CADASTRO
    modeloDao.DaoProdutos controle = new DaoProdutos();            //INSTANCIANDO CONTROLE CADASTRO
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;

    
    public ForProdutos() {
        initComponents();
        setLocationRelativeTo(null);//ABRIR O SISTEMA NO CENTRO DA TELA
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        preencherTabela("select * from produtos order  by nome_produto");
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jTextFieldNomeProduto = new javax.swing.JTextField();
        jTextFieldEntradas = new javax.swing.JTextField();
        jTextFieldValorCompra = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jComboBoxOficina = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldValorVenda = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldDataEntrada = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens32x32/Add.png"))); // NOI18N
        jLabel1.setText("CADASTRO DE PRODUTOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(1086, 684));

        jLabel2.setText("COD");

        jLabel3.setText("PRODUTO");

        jLabel4.setText("ENTRADAS");

        jTextFieldCod.setEnabled(false);

        jTextFieldNomeProduto.setEnabled(false);

        jTextFieldEntradas.setEnabled(false);

        jTextFieldValorCompra.setEnabled(false);

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens25x25/Document.png"))); // NOI18N
        jButtonNovo.setText("NOVO");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens25x25/Save (1).png"))); // NOI18N
        jButtonSalvar.setText("SALVAR");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens25x25/Edit.png"))); // NOI18N
        jButtonEditar.setText("EDITAR");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens25x25/No.png"))); // NOI18N
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens25x25/Delete.png"))); // NOI18N
        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonPesquisar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonPesquisar.setText("PESQUISAR");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTextFieldPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisarActionPerformed(evt);
            }
        });

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);

        jComboBoxOficina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Civil", "Eletrica", "Refrigeracao" }));
        jComboBoxOficina.setEnabled(false);

        jLabel6.setText("OFICINA");

        jLabel7.setText("VALOR COMPRA");

        jLabel8.setText("VALOR VENDA");

        jTextFieldValorVenda.setEnabled(false);

        jLabel10.setText("DATA ENTRADA");

        jComboBoxTipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CAIXAS", "METROS", "UNIDADE" }));
        jComboBoxTipo.setEnabled(false);

        jLabel9.setText("TIPO");

        try {
            jTextFieldDataEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldDataEntrada.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextFieldNomeProduto))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxOficina, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextFieldValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDataEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(jButtonNovo)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEditar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonExcluir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(287, 287, 287)
                                .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPesquisar)))
                        .addGap(0, 244, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldEntradas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCod, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNomeProduto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxOficina, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(111, 111, 111)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonExcluir))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosMouseClicked
        String nome = ""+jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select *from produtos where nome_produto='"+nome+"'");
        try {
            conex.rs.first();
            jTextFieldCod.setText(String.valueOf(conex.rs.getInt("id_produtos")));
            jTextFieldNomeProduto.setText(conex.rs.getString("nome_produto"));
            jComboBoxTipo.setSelectedItem(conex.rs.getString("oficina"));
            jTextFieldEntradas.setText(String.valueOf(conex.rs.getInt("entrada_inicial")));
            jTextFieldValorCompra.setText(String.valueOf(conex.rs.getInt("valor_compra")));
            jTextFieldValorVenda.setText(String.valueOf(conex.rs.getInt("valor_venda")));
            jTextFieldDataEntrada.setText(String.valueOf(conex.rs.getDate("data_entrada")));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados"+ex);
        }
        conex.desconecta();
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jTableProdutosMouseClicked

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jTextFieldNomeProduto.setText("");
        jTextFieldEntradas.setText("");
        jTextFieldValorCompra.setText("");
        jTextFieldValorVenda.setText("");
        jTextFieldDataEntrada.setText("");
        
        //CAMPOS BBLOQUEADOS
        jTextFieldNomeProduto.setEnabled(true);
        jComboBoxOficina.setEnabled(true);
        jTextFieldEntradas.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jTextFieldValorCompra.setEnabled(true);
        jTextFieldValorVenda.setEnabled(true);
        jTextFieldDataEntrada.setEnabled(true);
        
        
        //BOTÕES
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldPesquisar.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTextFieldNomeProduto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Preencha o Nome do produto para continuar");
            jTextFieldNomeProduto.requestFocus();
        }
        
        if(jTextFieldEntradas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Preencha a Entrada para continuar");
            jTextFieldEntradas.requestFocus();
        } 
        
        if(jTextFieldValorCompra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Preencha o Valor de Compra para continuar");
           jTextFieldValorCompra.requestFocus();
        }
        
        if(jTextFieldValorVenda.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Preencha o Valor de Venda para continuar");
           jTextFieldValorVenda.requestFocus();
        }
        
        if(jTextFieldDataEntrada.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Preencha a Data para continuar");
           jTextFieldDataEntrada.requestFocus();
        }
        
        else 
        if(flag==1){
        mod.setNome_produto(jTextFieldNomeProduto.getText());  //PEGANDO DADOS DIGITADOS NO CAMPO DE TEXTO NOME DO FORMULARIO
        mod.setOficina((String)jComboBoxOficina.getSelectedItem());
        mod.setEntrada_inicial((Integer.parseInt(jTextFieldEntradas.getText())));
        mod.setTipo((String)jComboBoxTipo.getSelectedItem());
        mod.setValor_compra((Float.parseFloat(jTextFieldValorCompra.getText())));
        mod.setValor_venda((Float.parseFloat(jTextFieldValorVenda.getText())));
        mod.setData_entrada((Date.valueOf(jTextFieldDataEntrada.getText())));
        
       
        
        controle.Salvar(mod);
        jTextFieldNomeProduto.setText("");
        jTextFieldEntradas.setText("");
        jTextFieldValorCompra.setText("");
        jTextFieldValorVenda.setText("");
        jTextFieldEntradas.setText("");
        jTextFieldDataEntrada.setText("");
        
        jTextFieldNomeProduto.setEnabled(false);
        jComboBoxOficina.setEnabled(false);
        jComboBoxTipo.setEnabled(false);
        jTextFieldEntradas.setEnabled(false);
        jComboBoxTipo.setEnabled(false);
        jTextFieldValorCompra.setEnabled(false);
        jTextFieldValorVenda.setEnabled(false);
        jTextFieldDataEntrada.setEnabled(false);
        
        
        jButtonNovo.setEnabled(true);
        jButtonCancelar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        preencherTabela("select *from produtos order  by nome_produto");
        
        
        }else{
            mod.setId_produto((Integer.parseInt(jTextFieldCod.getText())));
            mod.setNome_produto(jTextFieldNomeProduto.getText());
            mod.setEntrada_inicial((Integer.parseInt(jTextFieldEntradas.getText())));
            
            
            controle.Editar(mod);
            jTextFieldCod.setText("");
            jTextFieldNomeProduto.setText("");
            jTextFieldEntradas.setText("");
            jTextFieldValorCompra.setText("");
            jTextFieldValorVenda.setText("");
            jTextFieldEntradas.setText("");
            
            jTextFieldNomeProduto.setEnabled(false);
            jComboBoxOficina.setEnabled(false);
            jTextFieldEntradas.setEnabled(false);
            jComboBoxTipo.setEnabled(false);
            jTextFieldValorCompra.setEnabled(false);
            jTextFieldValorVenda.setEnabled(false);
            jTextFieldDataEntrada.setEnabled(false);
            
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            preencherTabela("select *from produtos order  by nome");
            
            }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldCod.setEnabled(!true);
        jTextFieldNomeProduto.setEnabled(!true);
        jTextFieldEntradas.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldCod.setText("");
        jTextFieldNomeProduto.setText("");
        jTextFieldEntradas.setText("");
        jTextFieldValorCompra.setText("");
        jTextFieldPesquisar.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta=0;
        resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja realmente excluir?");
        if (resposta ==JOptionPane.YES_OPTION){
        mod.setId_produto(Integer.parseInt(jTextFieldCod.getText()));
        controle.Excluir(mod);
        jTextFieldNomeProduto.setText("");
        jTextFieldEntradas.setText("");
        jTextFieldValorCompra.setText("");
        jTextFieldNomeProduto.setEnabled(false);
        
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonEditar.setEnabled(false);
        preencherTabela("select *from produtos order  by nome_produto");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        mod.setPesquisa(jTextFieldPesquisar.getText());
        BeansProdutos model = controle.buscaProdutos(mod);
        jTextFieldCod.setText(String.valueOf(model.getId_produto()));
        jTextFieldNomeProduto.setText(model.getNome_produto());
        preencherTabela("select *from produtos where nome_produto like'%"+mod.getPesquisa()+"%'");//%?%);
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        jTextFieldNomeProduto.setEnabled(true);
        jTextFieldEntradas.setEnabled(true);
        jTextFieldValorCompra.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonEditar.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTextFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisarActionPerformed

    
    public void preencherTabela(String Sql){
       ArrayList dados = new ArrayList(); 
       String [] colunas = new String []{"id_produto","nome_produtos","oficina","entrada_inicial","tipo","valor_compra","valor_venda","valor_lucro","data_entrada"};
       conex.conexao();
       conex.executaSql(Sql);
       try{
           conex.rs.first();
           do{
               dados.add(new Object[]{conex.rs.getInt("id_produtos"),conex.rs.getString("nome_produto"),conex.rs.getString("oficina"),conex.rs.getInt("entrada_inicial")
                       ,conex.rs.getString("tipo"),conex.rs.getFloat("valor_compra"),conex.rs.getFloat("valor_venda"),conex.rs.getFloat("valor_lucro")
                       ,conex.rs.getDate("data_entrada")});
            }while(conex.rs.next());
       }catch(SQLException ex){
           //JOptionPane.showMessageDialog(rootPane, "Pesquise por outro cliente");
       }
       ModeloTabela modelo = new ModeloTabela(dados, colunas);
       jTableProdutos.setModel(modelo);
       jTableProdutos.getColumnModel().getColumn(0).setPreferredWidth(100);//(100) TAMANHO DOS CAMPOS DA TABELA DO BD
       jTableProdutos.getColumnModel().getColumn(0).setResizable(false);
       jTableProdutos.getColumnModel().getColumn(1).setPreferredWidth(250);
       jTableProdutos.getColumnModel().getColumn(1).setResizable(false);
       jTableProdutos.getColumnModel().getColumn(2).setPreferredWidth(100);
       jTableProdutos.getColumnModel().getColumn(2).setResizable(false);
       jTableProdutos.getColumnModel().getColumn(3).setPreferredWidth(100);
       jTableProdutos.getColumnModel().getColumn(3).setResizable(false);
       jTableProdutos.getColumnModel().getColumn(4).setPreferredWidth(100);
       jTableProdutos.getColumnModel().getColumn(4).setResizable(false);
       jTableProdutos.getColumnModel().getColumn(5).setPreferredWidth(100);
       jTableProdutos.getColumnModel().getColumn(5).setResizable(false);
       jTableProdutos.getColumnModel().getColumn(6).setPreferredWidth(100);
       jTableProdutos.getColumnModel().getColumn(6).setResizable(false);
       jTableProdutos.getColumnModel().getColumn(7).setPreferredWidth(100);
       jTableProdutos.getColumnModel().getColumn(7).setResizable(false);
       jTableProdutos.getColumnModel().getColumn(8).setPreferredWidth(100);
       jTableProdutos.getColumnModel().getColumn(8).setResizable(false);
       jTableProdutos.getTableHeader().setReorderingAllowed(false);
       jTableProdutos.setAutoResizeMode(jTableProdutos.AUTO_RESIZE_OFF);//TABELA NÃO PODE SER REDIMENSIONADA
       jTableProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       
       conex.desconecta();
    }
    
    
    
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
            java.util.logging.Logger.getLogger(ForProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxOficina;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JFormattedTextField jTextFieldDataEntrada;
    private javax.swing.JTextField jTextFieldEntradas;
    private javax.swing.JTextField jTextFieldNomeProduto;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldValorCompra;
    private javax.swing.JTextField jTextFieldValorVenda;
    // End of variables declaration//GEN-END:variables
}
