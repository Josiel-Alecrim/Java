
package projetoDeposito;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansCadastro;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;
import modeloDao.DaoCadastro;

public class ForCadastro extends javax.swing.JFrame {
    

    modeloBeans.BeansCadastro mod = new modeloBeans.BeansCadastro();//INSTANCIANADO MODELO CADASTRO
    modeloDao.DaoCadastro controle = new DaoCadastro();            //INSTANCIANDO CONTROLE CADASTRO
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;

    
    public ForCadastro() {
        initComponents();
        setLocationRelativeTo(null);//ABRIR O SISTEMA NO CENTRO DA TELA
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        preencherTabela("select *from clientes order  by nome");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldCelular = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldComplemento = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCadastros = new javax.swing.JTable();
        jTextFieldCpf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCep = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(900, 745));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens32x32/Add.png"))); // NOI18N
        jLabel1.setText("Cadastro de Cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("COD");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("NOME");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("CELULAR");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("ENDEREÇO");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("COMPLEMENTO");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("BAIRRO");

        jTextFieldCod.setEnabled(false);
        jTextFieldCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodActionPerformed(evt);
            }
        });

        jTextFieldNome.setEnabled(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jTextFieldCelular.setEnabled(false);
        jTextFieldCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCelularActionPerformed(evt);
            }
        });

        jTextFieldEndereco.setEnabled(false);

        jTextFieldComplemento.setEnabled(false);
        jTextFieldComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldComplementoActionPerformed(evt);
            }
        });

        jTextFieldBairro.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("SEXO");

        jComboBoxSexo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        jButtonNovo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens25x25/Document.png"))); // NOI18N
        jButtonNovo.setText("NOVO");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens25x25/Save (1).png"))); // NOI18N
        jButtonSalvar.setText("SALVAR");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens25x25/Edit.png"))); // NOI18N
        jButtonEditar.setText("EDITAR");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens25x25/No.png"))); // NOI18N
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens25x25/Delete.png"))); // NOI18N
        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonPesquisar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens25x25/Lupa.png"))); // NOI18N
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

        jTableCadastros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableCadastros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCadastrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCadastros);

        jTextFieldCpf.setEnabled(false);
        jTextFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCpfActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("CPF");

        jTextFieldCep.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("CEP");

        jTextFieldNumero.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("NÚMERO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldNome))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldEndereco)
                                .addGap(245, 245, 245)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(400, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEditar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonExcluir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(400, 400, 400))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jTextFieldCod)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(36, 36, 36))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonExcluir))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldComplementoActionPerformed

    private void jTextFieldCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jTextFieldCod.setText("");
        jTextFieldNome.setText("");
        jTextFieldCpf.setText("");
        jTextFieldCelular.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldNumero.setText("");
        jTextFieldComplemento.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCep.setText("");
        
        jTextFieldNome.setEnabled(true);
        jTextFieldCpf.setEnabled(true);
        jTextFieldCelular.setEnabled(true);
        jComboBoxSexo.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldNumero.setEnabled(true);
        jTextFieldComplemento.setEnabled(true);
        jTextFieldBairro.setEnabled(true);
        jTextFieldCep.setEnabled(true);
        
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldPesquisar.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Preencha o Nome para continuar");
            jTextFieldNome.requestFocus();
            
        }else if(jTextFieldCelular.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Preencha o Celular para continuar");
            jTextFieldCelular.requestFocus();
        } 
        
        else if(jTextFieldEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Preencha o Endereço para continuar");
            jTextFieldEndereco.requestFocus();
            
            
        if (jTextFieldComplemento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Preencha o Número da Residência pra continuar");
            jTextFieldComplemento.requestFocus();
            
        }else if(jTextFieldBairro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Preencha o Bairro para continuar");
            jTextFieldBairro.requestFocus();
        } 
        
        }else 
        if(flag==1){
        mod.setNome(jTextFieldNome.getText());  //PEGANDO DADOS DIGITADOS NO CAMPO DE TEXTO NOME DO FORMULARIO
        mod.setCpf(jTextFieldCpf.getText());
        mod.setTelefone((Integer.parseInt(jTextFieldCelular.getText())));
        mod.setSexo((String)jComboBoxSexo.getSelectedItem());
        mod.setEndereco(jTextFieldEndereco.getText());
        mod.setNumero((Integer.parseInt(jTextFieldNumero.getText())));
        mod.setComplemento(jTextFieldComplemento.getText());
        mod.setBairro(jTextFieldBairro.getText());
        mod.setCep(jTextFieldCep.getText());
        
        controle.Salvar(mod);
        jTextFieldNome.setText("");
        jTextFieldCpf.setText("");
        jTextFieldCelular.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldNumero.setText("");
        jTextFieldComplemento.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCep.setText("");
        
        jTextFieldNome.setEnabled(false);
        jTextFieldCpf.setEnabled(false);
        jTextFieldCelular.setEnabled(false);
        jComboBoxSexo.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jTextFieldNumero.setEnabled(false);
        jTextFieldComplemento.setEnabled(false);
        jTextFieldBairro.setEnabled(false);
        jTextFieldCep.setEnabled(false);
        
        jButtonCancelar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        preencherTabela("select *from clientes order  by nome");
        
        
        }else{
            mod.setId_cliente((Integer.parseInt(jTextFieldCod.getText())));    
            mod.setNome(jTextFieldNome.getText());
            mod.setCpf(jTextFieldCpf.getText());
            mod.setTelefone((Integer.parseInt(jTextFieldCelular.getText())));
            mod.setSexo((String)jComboBoxSexo.getSelectedItem());
            mod.setEndereco(jTextFieldEndereco.getText());
            mod.setNumero((Integer.parseInt(jTextFieldNumero.getText())));
            mod.setComplemento(jTextFieldComplemento.getText());
            mod.setBairro(jTextFieldBairro.getText());
            mod.setCep(jTextFieldCep.getText());
            
            controle.Editar(mod);
            
            jTextFieldNome.setText("");
            jTextFieldCpf.setText("");
            jTextFieldCelular.setText("");
            jTextFieldEndereco.setText("");
            jTextFieldNumero.setText("");
            jTextFieldComplemento.setText("");
            jTextFieldBairro.setText("");
            jTextFieldCep.setText("");
            
            jTextFieldNome.setEnabled(false);
            jTextFieldCpf.setEnabled(false);
            jTextFieldCelular.setEnabled(false);
            jComboBoxSexo.setEnabled(false);
            jTextFieldEndereco.setEnabled(false);
            jTextFieldNumero.setEnabled(false);
            jTextFieldComplemento.setEnabled(false);
            jTextFieldBairro.setEnabled(false);
            jTextFieldCep.setEnabled(false);
            
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            preencherTabela("select *from clientes order  by nome");
            
            }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
            jTextFieldNome.setEnabled(true);
            jTextFieldCpf.setEnabled(true);
            jTextFieldCelular.setEnabled(true);
            jComboBoxSexo.setEnabled(true);
            jTextFieldEndereco.setEnabled(true);
            jTextFieldNumero.setEnabled(true);
            jTextFieldComplemento.setEnabled(true);
            jTextFieldBairro.setEnabled(true);
            jTextFieldCep.setEnabled(true);
        
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonEditar.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNome.setEnabled(false);
        jTextFieldCpf.setEnabled(false);
        jTextFieldCelular.setEnabled(false);
        jComboBoxSexo.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jTextFieldNumero.setEnabled(false);
        jTextFieldComplemento.setEnabled(false);
        jTextFieldBairro.setEnabled(false);
        jTextFieldCep.setEnabled(false);
        
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        
        jTextFieldNome.setText("");
        jTextFieldCpf.setText("");
        jTextFieldCelular.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldNumero.setText("");
        jTextFieldComplemento.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCep.setText("");
            
        jTextFieldPesquisar.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta=0;
        resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja realmente excluir?");
        if (resposta ==JOptionPane.YES_OPTION){
        mod.setId_cliente(Integer.parseInt(jTextFieldCod.getText()));
        controle.Excluir(mod);
            jTextFieldNome.setText("");
            jTextFieldCpf.setText("");
            jTextFieldCelular.setText("");
            jTextFieldEndereco.setText("");
            jTextFieldNumero.setText("");
            jTextFieldComplemento.setText("");
            jTextFieldBairro.setText("");
            jTextFieldCep.setText("");
        
         jTextFieldNome.setEnabled(false);
        jTextFieldCpf.setEnabled(false);
        jTextFieldCelular.setEnabled(false);
        jComboBoxSexo.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jTextFieldNumero.setEnabled(false);
        jTextFieldComplemento.setEnabled(false);
        jTextFieldBairro.setEnabled(false);
        jTextFieldCep.setEnabled(false);
        
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonEditar.setEnabled(false);
        preencherTabela("select *from clientes order  by nome");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        mod.setPesquisar(jTextFieldPesquisar.getText());
        BeansCadastro model = controle.buscaUsuario(mod);
        jTextFieldCod.setText(String.valueOf(model.getId_cliente()));
        jTextFieldNome.setText(model.getNome());
        jTextFieldCpf.setText(model.getCpf());
        jTextFieldCelular.setText(String.valueOf(model.getTelefone()));
        jComboBoxSexo.setSelectedItem(model.getSexo());
        jTextFieldEndereco.setText(model.getEndereco());
        jTextFieldNumero.setText(String.valueOf(model.getNumero()));
        jTextFieldComplemento.setText((model.getComplemento()));
        jTextFieldBairro.setText(model.getBairro());
        jTextFieldCep.setText(model.getCep());
        preencherTabela("select *from clientes where nome like'%"+mod.getPesquisar()+"%'");//%?%);
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTableCadastrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCadastrosMouseClicked
        String nome = ""+jTableCadastros.getValueAt(jTableCadastros.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select *from clientes where nome='"+nome+"'");
        try {
            conex.rs.first();
            jTextFieldCod.setText(String.valueOf(conex.rs.getInt("id_cliente")));
            jTextFieldNome.setText(conex.rs.getString("nome"));
            jTextFieldCpf.setText(conex.rs.getString("cpf"));
            jTextFieldCelular.setText(String.valueOf(conex.rs.getInt("telefone")));
            jComboBoxSexo.setSelectedItem(conex.rs.getString("sexo"));
            jTextFieldEndereco.setText(conex.rs.getString("endereco"));
            jTextFieldNumero.setText(String.valueOf(conex.rs.getInt("numero")));
            jTextFieldComplemento.setText(conex.rs.getString("complemento"));
            jTextFieldBairro.setText(conex.rs.getString("bairro"));
            jTextFieldCep.setText(conex.rs.getString("cep"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados"+ex);
        }
        conex.desconecta();
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jTableCadastrosMouseClicked

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisarActionPerformed

    private void jTextFieldCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCelularActionPerformed

    private void jTextFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCpfActionPerformed

    
    public void preencherTabela(String Sql){
       ArrayList dados = new ArrayList(); 
       String [] colunas = new String []{"id_cliente","nome","cpf","telefone","sexo","endereco","numero","complemento","bairro","cep"};
       conex.conexao();
       conex.executaSql(Sql);
       try{
           conex.rs.first();
           do{
               dados.add(new Object[]{conex.rs.getInt("id_cliente"),conex.rs.getString("nome"),conex.rs.getString("cpf"),
                   conex.rs.getInt("telefone"),conex.rs.getString("sexo"),conex.rs.getString("endereco"),conex.rs.getInt("numero"),conex.rs.getString("complemento"),
                   conex.rs.getString("bairro"),conex.rs.getString("cep")});
            }while(conex.rs.next());
       }catch(SQLException ex){
           //JOptionPane.showMessageDialog(rootPane, "Pesquise por outro cliente");
       }
       ModeloTabela modelo = new ModeloTabela(dados, colunas);
       jTableCadastros.setModel(modelo);
       jTableCadastros.getColumnModel().getColumn(0).setPreferredWidth(70);//(100) TAMANHO DOS CAMPOS DA TABELA DO BD
       jTableCadastros.getColumnModel().getColumn(0).setResizable(false);
       jTableCadastros.getColumnModel().getColumn(1).setPreferredWidth(250);
       jTableCadastros.getColumnModel().getColumn(1).setResizable(false);
       jTableCadastros.getColumnModel().getColumn(2).setPreferredWidth(100);
       jTableCadastros.getColumnModel().getColumn(2).setResizable(false);
       jTableCadastros.getColumnModel().getColumn(3).setPreferredWidth(100);
       jTableCadastros.getColumnModel().getColumn(3).setResizable(false);
       jTableCadastros.getColumnModel().getColumn(4).setPreferredWidth(100);
       jTableCadastros.getColumnModel().getColumn(4).setResizable(false);
       jTableCadastros.getColumnModel().getColumn(5).setPreferredWidth(250);
       jTableCadastros.getColumnModel().getColumn(5).setResizable(false);
       jTableCadastros.getColumnModel().getColumn(6).setPreferredWidth(75);
       jTableCadastros.getColumnModel().getColumn(6).setResizable(false);
       jTableCadastros.getColumnModel().getColumn(7).setPreferredWidth(100);
       jTableCadastros.getColumnModel().getColumn(7).setResizable(false);
       jTableCadastros.getColumnModel().getColumn(8).setPreferredWidth(250);
       jTableCadastros.getColumnModel().getColumn(8).setResizable(false);
       jTableCadastros.getColumnModel().getColumn(9).setPreferredWidth(100);
       jTableCadastros.getColumnModel().getColumn(9).setResizable(false);
       jTableCadastros.getTableHeader().setReorderingAllowed(false);
       jTableCadastros.setAutoResizeMode(jTableCadastros.AUTO_RESIZE_OFF);//TABELA NÃO PODE SER REDIMENSIONADA
       jTableCadastros.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       
       conex.desconecta();
    }
    
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
            java.util.logging.Logger.getLogger(ForCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForCadastro().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCadastros;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCelular;
    private javax.swing.JTextField jTextFieldCep;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPesquisar;
    // End of variables declaration//GEN-END:variables
}
