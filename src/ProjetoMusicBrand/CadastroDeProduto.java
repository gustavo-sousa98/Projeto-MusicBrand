/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoMusicBrand;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class CadastroDeProduto extends javax.swing.JFrame {

    public Connection con;
    public Statement st;
    public ResultSet resultado = null;

    public CadastroDeProduto() {
        initComponents();

        try {
            con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/XWCLbDUMdi",
                    "XWCLbDUMdi", "aHScI8izn4");

            st = (Statement) con.createStatement();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não conectado!");

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");
        setPreferredSize(new java.awt.Dimension(1300, 840));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 146, 17)));
        jPanel1.setPreferredSize(new java.awt.Dimension(910, 840));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 48, 39));
        jLabel1.setText("CADASTRO DE PRODUTO");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel20.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Desc. do Produto");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 146, 17)));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setToolTipText("Descreva o produto");

        jLabel21.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Categoria");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 146, 17)));

        jLabel22.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Marca");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 146, 17)));

        jLabel23.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Cor");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 146, 17)));

        jLabel24.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Valor de Compra");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 146, 17)));

        jLabel25.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Valor de Venda");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 146, 17)));

        jLabel26.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Quantidade");
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 146, 17)));

        jLabel27.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Fornecedor");
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 146, 17)));

        jComboBox1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jComboBox1.setMaximumRowCount(10);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas as Categorias", "Áudio Profissional", "Bateria & Percussão", "Cordas & Acessórios", "Pianos & Teclados", "Sopro" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setToolTipText("Digite a cor do produto");

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setToolTipText("Digite a quantidade");

        jLabel28.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Tipo");
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 146, 17)));

        jComboBox2.setMaximumRowCount(10);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o tipo" }));

        jComboBox3.setMaximumRowCount(25);
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a marca", "Behringer", "Blackstar", "Casio", "Comica", "Eagle", "Gator", "Gianni", "Hering", "Jackson", "Kalani", "Korg", "Luen", "On-stage Stands", "Pearl", "Roland", "Rozini ", "Sennheiser", "Sigma", "Tagima", "Winner", "Yamaha" }));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(248, 146, 17));
        jButton1.setText("Alterar");
        jButton1.setToolTipText("Incluir Cadastro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(248, 146, 17));
        jButton3.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Limpar");
        jButton3.setToolTipText("Limpar Cadastro");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(248, 146, 17));
        jButton4.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Incluir");
        jButton4.setToolTipText("Alterar Cadastro");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(248, 146, 17));
        jButton2.setText("Excluir");
        jButton2.setToolTipText("Excluir Cadastro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Banjo.png"))); // NOI18N

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o fornecedor", "America Eagle Comercio de Discos Ltda", "Behringer & Fratine Ltda", "Blackstar Shop Music", "Casio Brasil Comercio de Produtos Eletronicos Ltda", "Epiphone Musical S/A", "Fender Instrumentos Musicais do Brasil Ltda", "Gator Cases", "Giannini SA", "Gretsch Ltda", "Hering Instrumentos Musicais Ltda ", "Jackson Music Instruments", "Kalini Instrumentos Musicais Ltda", "Komicco Teatro de Repertorio Ltda", "Korg Brasil S/A", "Luen Instrumentos Musicais Importação e Exportação Ltda", "Martin Masver Instrumentos Musicais Ltda", "Nektar comercio Musical Ltda", "On Stage - Som, Luz, Imagens e Eventos Eireli", "Pbr Instrumentos Musicais Ltda", "Phoenix Instrumentos Musicais Ltda", "Pride Music Coml Importadora Ltda", "Roland DG Brasil Importação e Exportação Ltda", "Rozini Industria e Comercio de Instrumentos Musicais Ltda", "Sennheiser Eletronic Corporation", "Sigma Instrumentos Ltda", "SKB Musical S/A", "Soft Case Confecções De Capas Eireli", "Tagima Ind e Com Instrumentos Musicais Ltda", "Waldman Comercio Importação e Exportação", "Winner Instrumentos Musicais Ltda", "Yamaha Musical do Brasil Ltda", "Zeus Produtos Eletronicos Comercio Ltda" }));
        jComboBox4.setToolTipText("");

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));

        jTextField6.setBackground(new java.awt.Color(255, 255, 255));

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(248, 146, 17));
        jButton5.setText("Retornar");
        jButton5.setToolTipText("Retornar Para Tela Principal");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(16, 16, 16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField6))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField4))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(558, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        ExcluirProduto excluir = new ExcluirProduto();

        excluir.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Botão Incluir
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {

            String categoria, tp_instrumento, nome, marca, cor, valor_compra, valor_venda, qtd, fornecedor;

            categoria = (String) (jComboBox1.getSelectedItem());
            tp_instrumento = (String) (jComboBox2.getSelectedItem());
            nome = jTextField2.getText();
            marca = (String) (jComboBox3.getSelectedItem());
            cor = jTextField3.getText();
            valor_compra = jTextField4.getText();
            valor_venda = jTextField6.getText();
            qtd = jTextField5.getText();
            fornecedor = (String) (jComboBox4.getSelectedItem());

            String minhasql = "insert into produto (categoria,tp_instrumento, nome, marca, cor, valor_compra, valor_venda, qtd, fornecedor) values ('"
                    + categoria + "','" 
                    + tp_instrumento + "','" 
                    + nome + "','" 
                    + marca + "', '" 
                    + cor + "'," 
                    + valor_compra+ "," 
                    + valor_venda + ",'" 
                    + qtd + "', '" 
                    + fornecedor + "')";

            st.executeUpdate(minhasql);

            JOptionPane.showMessageDialog(null, "Produto Cadastrado!");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Produto Não Cadastrado!");

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Função de Limpar os campos para o botão "Limpar"
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        jComboBox1.setSelectedItem("Todas as Categorias");
        jComboBox2.setSelectedItem("Selecione o tipo");
        jTextField2.setText("");
        jComboBox3.setSelectedItem("Selecione a marca");
        jTextField5.setText("");
        jComboBox4.setSelectedItem("Selecione o fornecedor");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField6.setText("");

    }//GEN-LAST:event_jButton3ActionPerformed

    // Função para deixar uma ComboBox dependente da outra
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        if (jComboBox1.getSelectedItem().equals("Todas as Categorias")) {
            jComboBox2.removeAllItems();
            jComboBox2.addItem("Selecione Primeiro a Categoria ");

        } else if (jComboBox1.getSelectedItem().equals("Áudio Profissional")) {

            jComboBox2.removeAllItems();
            jComboBox1.setSelectedItem("Áudio Profissional");

            jComboBox2.addItem("Selecione o tipo");
            jComboBox2.addItem("Acessórios");
            jComboBox2.addItem("Cabos");
            jComboBox2.addItem("Caixas Acusticas");
            jComboBox2.addItem("Fone de Ouvido");
            jComboBox2.addItem("Microfones");
            jComboBox2.addItem("Mixers e Mesas");
            jComboBox2.addItem("Processadores");
            jComboBox2.addItem("Sistema sem Fio");
            jComboBox2.addItem("Tecnologia");

        } else if (jComboBox1.getSelectedItem().equals("Bateria & Percussão")) {

            jComboBox2.removeAllItems();
            jComboBox1.setSelectedItem("Bateria & Percussão");

            jComboBox2.addItem("Selecione o tipo");
            jComboBox2.addItem("Acessórios");
            jComboBox2.addItem("Bateria Acústica");
            jComboBox2.addItem("Bateria Eletrônica");
            jComboBox2.addItem("Ferragens");
            jComboBox2.addItem("Peles");
            jComboBox2.addItem("Percussão");
            jComboBox2.addItem("Kit de Pratos");

        } else if (jComboBox1.getSelectedItem().equals("Cordas & Acessórios")) {

            jComboBox2.removeAllItems();
            jComboBox1.setSelectedItem("Cordas & Acessórios");

            jComboBox2.addItem("Selecione o tipo");
            jComboBox2.addItem("Acessórios");
            jComboBox2.addItem("Amplificadores para Baixo");
            jComboBox2.addItem("Amplificadores para Guitarra");
            jComboBox2.addItem("Bandolim");
            jComboBox2.addItem("Cases");
            jComboBox2.addItem("Cavaco & Banjo");
            jComboBox2.addItem("Contrabaixo");
            jComboBox2.addItem("Controladores & Footswitch");
            jComboBox2.addItem("Efeitos");
            jComboBox2.addItem("Encordoamento");
            jComboBox2.addItem("Guitarra");
            jComboBox2.addItem("Palhetas e Dedeiras");
            jComboBox2.addItem("Peças e Reposições");
            jComboBox2.addItem("Pedal de efeito");
            jComboBox2.addItem("Pedaleira & Multi Efeito");
            jComboBox2.addItem("Ukulele");
            jComboBox2.addItem("Viola Caipira");
            jComboBox2.addItem("Violão Acústico");
            jComboBox2.addItem("Violão Eletroacústico");
            jComboBox2.addItem("Violino");
            jComboBox2.addItem("Violoncello");
    }//GEN-LAST:event_jComboBox1ActionPerformed

    else if (jComboBox1.getSelectedItem().equals("Pianos & Teclados")) {

            jComboBox2.removeAllItems();
            jComboBox1.setSelectedItem("Pianos & Teclados");

            jComboBox2.addItem("Selecione o tipo");
            jComboBox2.addItem("Acessórios");
            jComboBox2.addItem("Acordeons");
            jComboBox2.addItem("Amplificadores");
            jComboBox2.addItem("Arranjadores");
            jComboBox2.addItem("Controladores");
            jComboBox2.addItem("Pianos");
            jComboBox2.addItem("Synths");
            jComboBox2.addItem("Teclados");
            jComboBox2.addItem("WorkStations");

        } else if (jComboBox1.getSelectedItem().equals("Sopro")) {

            jComboBox2.removeAllItems();
            jComboBox1.setSelectedItem("Sopro");

            jComboBox2.addItem("Selecione o tipo");
            jComboBox2.addItem("Acessórios");
            jComboBox2.addItem("Clarinetas");
            jComboBox2.addItem("Flautas");
            jComboBox2.addItem("Gaitas");
            jComboBox2.addItem("Geral");
            jComboBox2.addItem("Saxofone");
            jComboBox2.addItem("Trompete");

        }

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        AlterarProduto alterar = new AlterarProduto();
        alterar.setVisible(true);
        
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        TelaPrincipalMB principal = new TelaPrincipalMB();

        principal.setVisible(true); // retorna a tela principal

        dispose(); // fecha este formulário e retorna ao formulário anterior.
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroDeProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
