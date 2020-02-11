
package projetoDeposito;

import modeloBeans.BeansVendas;
import modeloDao.DaoVendas;
import modeloDao.DaoProdutos;
import modeloDao.DaoCadastro;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import modeloBeans.BeansCadastro;
import modeloBeans.BeansProdutos;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;





public class ForVendas extends javax.swing.JFrame {
    modeloDao.DaoVendas controle = new DaoVendas(); 
    modeloBeans.BeansVendas mod = new modeloBeans.BeansVendas(); //INSTANCIANADO MODELO CADASTRO//INSTANCIANDO CONTROLE CADASTRO
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;
    
    
    
    
    
  public ForVendas() {
        initComponents();
        setLocationRelativeTo(null);//ABRIR O SISTEMA NO CENTRO DA TELA
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        preencherNomes();
        preencherProdutos();
        
    }
  
  public void preencherNomes(){
      conex.conexao();
      
      conex.executaSql("select * from clientes order by nome");
      try {
          conex.rs.first();
          jComboBoxNome.removeAllItems();
          do{
              jComboBoxNome.addItem(conex.rs.getString("nome"));
              jTextFieldCod.setText(String.valueOf(conex.rs.getInt("id_cliente")));
          }while(conex.rs.next());
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher nome" + ex);
        }
      conex.desconecta();
  }
  
  public void preencherProdutos(){
      conex.conexao();
      
      conex.executaSql("select * from produtos order by nome_produto");
      try {
          conex.rs.first();
          jComboBoxProduto.removeAllItems();
          do{
              jComboBoxProduto.addItem(conex.rs.getString("nome_produto"));
              jTextFieldQuantidade.setText(String.valueOf(conex.rs.getFloat("valor_venda")));
          }while(conex.rs.next());
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher nome" + ex);
        }
      conex.desconecta();
  }

  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonAdicionar = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jTextFieldNumeroVenda = new javax.swing.JTextField();
        jTextFieldProduto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jButtonPesquisar1 = new javax.swing.JButton();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jTextFieldValorUnidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldValorTotal = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextFieldValorPago = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldValorTroco = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldValorEntrega = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldValorVenda = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxProduto = new javax.swing.JComboBox<>();
        jComboBoxNome = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Código");

        jTextFieldCod.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldCod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCod.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nº Venda");

        jButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens25x25/Add.png"))); // NOI18N
        jButtonAdicionar.setText("ADICIONAR");
        jButtonAdicionar.setEnabled(false);
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jTextFieldPesquisar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jTextFieldPesquisar.setEnabled(false);

        jTextFieldNumeroVenda.setBackground(new java.awt.Color(102, 255, 102));
        jTextFieldNumeroVenda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldNumeroVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNumeroVenda.setEnabled(false);
        jTextFieldNumeroVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroVendaActionPerformed(evt);
            }
        });

        jTextFieldProduto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldProduto.setEnabled(false);
        jTextFieldProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProdutoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Produtos");

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. Produto", "Nome produto", "Valor Unidade", "Quantidade", "Valor Total"
            }
        ));
        jScrollPane2.setViewportView(jTableProdutos);
        if (jTableProdutos.getColumnModel().getColumnCount() > 0) {
            jTableProdutos.getColumnModel().getColumn(0).setMaxWidth(80);
            jTableProdutos.getColumnModel().getColumn(1).setMinWidth(300);
            jTableProdutos.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        jButtonPesquisar1.setText("PESQUISAR");
        jButtonPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisar1ActionPerformed(evt);
            }
        });

        jTextFieldQuantidade.setEnabled(false);
        jTextFieldQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeActionPerformed(evt);
            }
        });

        jTextFieldValorUnidade.setEnabled(false);
        jTextFieldValorUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorUnidadeActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Valor Unit");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Quantidade");

        jTextFieldValorTotal.setEditable(false);
        jTextFieldValorTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jTextFieldValorTotal.setEnabled(false);
        jTextFieldValorTotal.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jTextFieldValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorTotalActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Total");

        jFormattedTextFieldValorPago.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jFormattedTextFieldValorPago.setEnabled(false);
        jFormattedTextFieldValorPago.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jFormattedTextFieldValorPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldValorPagoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Valor Recebido");

        jTextFieldValorTroco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jTextFieldValorTroco.setEnabled(false);
        jTextFieldValorTroco.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jTextFieldValorTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorTrocoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Troco");

        jTextFieldValorEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jTextFieldValorEntrega.setEnabled(false);
        jTextFieldValorEntrega.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Valor Entrega");

        jTextFieldValorVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jTextFieldValorVenda.setEnabled(false);
        jTextFieldValorVenda.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Valor Venda");

        jComboBoxProduto.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxProdutoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProdutoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNumeroVenda))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jComboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextFieldQuantidade))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldValorUnidade)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel7))
                                    .addComponent(jFormattedTextFieldValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldValorTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel4))
                                    .addComponent(jTextFieldValorEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxNome, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jTextFieldCod))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldProduto)
                        .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldValorUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldNumeroVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(3, 3, 3)
                                    .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(3, 3, 3)
                                    .addComponent(jFormattedTextFieldValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(3, 3, 3)
                                .addComponent(jTextFieldValorTroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(13, 13, 13)
                        .addComponent(jTextFieldValorEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("Caixa", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1235, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 60, 1240, 610);

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens32x32/New_file.png"))); // NOI18N
        jButtonNovo.setText("NOVO");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNovo);
        jButtonNovo.setBounds(40, 680, 130, 60);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens32x32/Cancel.png"))); // NOI18N
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(180, 680, 130, 60);

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens32x32/Ok.png"))); // NOI18N
        jButtonSalvar.setText("FINALIZAR");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(1110, 680, 130, 60);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens32x32/Yes.png"))); // NOI18N
        jLabel10.setText("FRENTE DE CAIXA");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 20, 1220, 40);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(540, 680, 127, 60);

        setSize(new java.awt.Dimension(1510, 799));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumeroVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroVendaActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        //LIMPANDO OS CAMPOS 
        flag = 1;
        jTextFieldNumeroVenda.setText("");
        jTextFieldCod.setText("");
      
        jTextFieldNumeroVenda.setText("");
        jTextFieldProduto.setText("");
        jTextFieldValorVenda.setText("");
        jTextFieldValorEntrega.setText("");
        jTextFieldValorTroco.setText("");
        jTextFieldValorTotal.setText("");
        jTextFieldPesquisar.setText("");
        jFormattedTextFieldValorPago.setText("");
       
        
        //DEIXANDO OS CAMPOS BLOQUEADOS
        jTextFieldNumeroVenda.setEnabled(false);
        jTextFieldCod.setEnabled(false);
        jComboBoxNome.setEnabled(true);
        jTextFieldProduto.setEnabled(true);
        //DEIXANDO OS CAMPOS DESBLOQUEADOS
        jTextFieldValorVenda.setEnabled(true);
        jTextFieldValorEntrega.setEnabled(true);
        jTextFieldValorTroco.setEnabled(true);
        jTextFieldValorTotal.setEnabled(true);
        jTextFieldPesquisar.setEnabled(true);
        jFormattedTextFieldValorPago.setEnabled(true);
        jTextFieldQuantidade.setEnabled(true);
        jTextFieldValorUnidade.setEnabled(true);
        
        jButtonCancelar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonAdicionar.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
         if (jFormattedTextFieldValorPago.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Preencha o VALOR RECEBIDO para continuar");
            jFormattedTextFieldValorPago.requestFocus();
        }
        if(flag==1){
                mod.setid_cliente((Integer.parseInt(jTextFieldCod.getText()))); 
                mod.setNome_cliente((String) jComboBoxNome.getText()); //PEGANDO DADOS DIGITADOS NO CAMPO DE TEXTO NOME DO FORMULARIO
                mod.setId_venda((Integer.parseInt(jTextFieldCod.getText())));    //PEGANDO DADOS DIGITADOS NO CAMPO DE TEXTO NOME DO FORMULARIO
                mod.setIntens_da_venda((String)jTextFieldProduto.getText());
                mod.setValor_entrega((Integer.parseInt(jTextFieldValorEntrega.getText().replaceAll("//D", ""))));
                mod.setTotal_venda((Integer.parseInt(jTextFieldValorVenda.getText().replaceAll("\\D", ""))));
                mod.setValor_pago((Integer.parseInt(jFormattedTextFieldValorPago.getText().replaceAll("//D", ""))));
                mod.setValor_troco((Integer.parseInt(jTextFieldValorEntrega.getText().replaceAll("\\D", ""))));
                //mod.setValorDesconto((Integer.parseInt(jTextFieldValorTroco.getText().replaceAll("\\D", ""))));
                

                controle.Salvar(mod);
                jTextFieldNumeroVenda.setText("");
                jTextFieldCod.setText("");
                jTextFieldNome.setText("");
                jTextFieldNumeroVenda.setText("");
                jTextFieldProduto.setText("");
                jTextFieldValorVenda.setText("");
                jTextFieldValorEntrega.setText("");
                jTextFieldValorTroco.setText("");
                jTextFieldValorTotal.setText("");
                jTextFieldPesquisar.setText("");
                jFormattedTextFieldValorPago.setText("");
                
                jTextFieldQuantidade.setText("");
                jTextFieldValorUnidade.setText("");


                jTextFieldPesquisar.setText("");
                preencherTabela("select *from vendas order by cod_venda");



                jTextFieldNumeroVenda.setEnabled(true);
                jTextFieldCod.setEnabled(true);
                jTextFieldNome.setEnabled(true);
                jButtonCancelar.setEnabled(true);
                jTextFieldValorVenda.setEnabled(false);
                jTextFieldValorEntrega.setEnabled(false);
                jTextFieldValorTroco.setEnabled(false);
                jFormattedTextFieldValorPago.setEnabled(false);
                jTextFieldValorTotal.setEnabled(false);

                jButtonNovo.setEnabled(true);
                jButtonCancelar.setEnabled(false);
                jButtonSalvar.setEnabled(false);
                preencherTabela("select *from vendas order by cod_venda");
        
        
        }else{
            mod.setId_venda((Integer.parseInt(jTextFieldCod.getText())));
            mod.setNome_cliente((String) jTextFieldNome.getText());
            mod.setId_venda((Integer.parseInt(jTextFieldNumeroVenda.getText())));
            mod.setIntens_da_venda((String)jTextFieldProduto.getText());
            mod.setTotal_venda((Integer.parseInt(jTextFieldValorVenda.getText())));
            mod.setValor_entrega((Integer.parseInt(jTextFieldValorEntrega.getText())));
            mod.setValor_pago((Integer.parseInt(jFormattedTextFieldValorPago.getText())));
            mod.setValor_troco((Integer.parseInt(jTextFieldValorTroco.getText())));
            mod.setTotal_venda((Integer.parseInt(jTextFieldValorTotal.getText())));
            preencherTabela("select *from vendas order by cod_venda");
        }
        
        
        
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
                jTextFieldNumeroVenda.setText("");
                jTextFieldCod.setText("");
                jTextFieldNome.setText("");
                jTextFieldNumeroVenda.setText("");
                jTextFieldProduto.setText("");
                jTextFieldValorVenda.setText("");
                jTextFieldValorEntrega.setText("");
                jTextFieldValorTroco.setText("");
                jTextFieldValorTotal.setText("");
                jTextFieldPesquisar.setText("");
                jFormattedTextFieldValorPago.setText("");
                jTextFieldPesquisar.setText("");
                
                jTextFieldQuantidade.setText("");
                jTextFieldValorUnidade.setText("");
                
                
        
        jTextFieldNumeroVenda.setEnabled(false);
                jTextFieldCod.setEnabled(false);
                jTextFieldNome.setEnabled(false);
                jTextFieldProduto.setEnabled(false);
                jButtonCancelar.setEnabled(false);
                jTextFieldValorVenda.setEnabled(false);
                jTextFieldValorEntrega.setEnabled(false);
                jTextFieldValorTroco.setEnabled(false);
                jFormattedTextFieldValorPago.setEnabled(false);
                jTextFieldValorTotal.setEnabled(false);
                jTextFieldPesquisar.setEnabled(false);
                
                jTextFieldQuantidade.setEnabled(false);
                jTextFieldValorUnidade.setEnabled(false);
        
        jButtonCancelar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonAdicionar.setEnabled(false);
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTableProdutos.getModel();
        String nome = jTextFieldProduto.getText().toString();
       
        //inserir produto na tabela
        modelo.addRow(new Object[]{
            jTextFieldCod.getText(),
            jComboBoxProduto.getSelectedItem(),
            jTextFieldQuantidade.getText(),
            jTextFieldValorUnidade.getText(),
            Double.parseDouble(jTextFieldQuantidade.getText()) * Double.parseDouble(jTextFieldValorUnidade.getText())
        });
        //CALCULAR O VALOR TOTAL DA VENDA
        jTextFieldValorTotal.setText(CalcularValorTotal()+"");
        
        
        
        jTextFieldQuantidade.setText("");
        jTextFieldValorUnidade.setText("");
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jTextFieldValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorTotalActionPerformed
        
    }//GEN-LAST:event_jTextFieldValorTotalActionPerformed

    private void jFormattedTextFieldValorPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldValorPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldValorPagoActionPerformed

    private void jTextFieldValorTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorTrocoActionPerformed
        
    }//GEN-LAST:event_jTextFieldValorTrocoActionPerformed

    private void jTextFieldProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProdutoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisar1ActionPerformed
       
    }//GEN-LAST:event_jButtonPesquisar1ActionPerformed

    private void jTextFieldQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantidadeActionPerformed

    private void jTextFieldValorUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorUnidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorUnidadeActionPerformed

    private void jComboBoxProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProdutoActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jComboBoxProdutoActionPerformed

    private void jComboBoxProdutoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxProdutoPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        if (this.jComboBoxProduto.isPopupVisible()){
            preencherProdutos();
        }
        
    }//GEN-LAST:event_jComboBoxProdutoPopupMenuWillBecomeInvisible
    private void retornarProduto(){
         
    }
    
    
    
    private double CalcularValorTotal() {
        double soma = 0, valor = 0;
        int contador = jTableProdutos.getRowCount();
        for (int i = 0; i < contador; i++) {
                valor = (double) jTableProdutos.getValueAt(i,4);
                soma += valor;
            }
        return soma;
    }
    
    /**public void preencherTabela(String Sql){
       ArrayList dados = new ArrayList(); 
       String [] colunas = new String []{"id_venda","produtos","id_cliente","nome","valor_venda",
           "valor_entrega","valor_recebido","troco","Total"};
       conex.conexao();
       conex.executaSql(Sql);
       try{
           conex.rs.next();
           do{
               dados.add(new Object[]{conex.rs.getDate("data_venda"),conex.rs.getInt("cod_venda"),conex.rs.getString("pedido"),conex.rs.getInt("cod")
                       ,conex.rs.getString("nome"),conex.rs.getInt("valor_venda")
                       ,conex.rs.getInt("valor_entrega"),conex.rs.getInt("valor_total")});
            }while(conex.rs.next());                                //(NumberFormat.getCurrencyInstance().format(12345678.90));
       }catch(SQLException ex){
           //JOptionPane.showMessageDialog(rootPane, "Pesquise por outro cliente");
       }
       ModeloTabela modelo = new ModeloTabela(dados, colunas);
       jTableProdutos.setModel(modelo);
       jTableProdutos.getColumnModel().getColumn(0).setPreferredWidth(100);//(100) TAMANHO DOS CAMPOS DA TABELA DO BD
       jTableProdutos.getColumnModel().getColumn(0).setResizable(false);
       jTableProdutos.getColumnModel().getColumn(1).setPreferredWidth(150);
       jTableProdutos.getColumnModel().getColumn(1).setResizable(false);
       jTableProdutos.getColumnModel().getColumn(2).setPreferredWidth(100);
       jTableProdutos.getColumnModel().getColumn(2).setResizable(false);
       jTableProdutos.getColumnModel().getColumn(3).setPreferredWidth(150);
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
    }**/
 
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
            java.util.logging.Logger.getLogger(ForVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForVendas().setVisible(true);
            }
        });
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar1;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxNome;
    private javax.swing.JComboBox<String> jComboBoxProduto;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldNumeroVenda;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldProduto;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JFormattedTextField jTextFieldValorEntrega;
    private javax.swing.JFormattedTextField jTextFieldValorTotal;
    private javax.swing.JFormattedTextField jTextFieldValorTroco;
    private javax.swing.JTextField jTextFieldValorUnidade;
    private javax.swing.JFormattedTextField jTextFieldValorVenda;
    // End of variables declaration//GEN-END:variables
}
