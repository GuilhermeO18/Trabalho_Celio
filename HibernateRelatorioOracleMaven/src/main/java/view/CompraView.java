package view;

import controller.CompraController;
import controller.CompraController;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.CompraModel;

public class CompraView extends javax.swing.JFrame {

    private String operacao;
    private ArrayList<CompraModel> array;
    private CompraTableModel mtb;
    private CompraController compracontroller;

    private String getOperacao() {
        return operacao;
    }

    private void setOperacao(String operacao) {
        Boolean ativar = (operacao.equals("") ? false : true);
        // operacao=""(consulta), operacao="incluir"(inclusão), operacao="alterar"(alteração)
        this.operacao = operacao;
        btnGRAVAR.setEnabled(ativar);
        btnGRAVAR.setEnabled(ativar);
    }

    public CompraView() {
        compracontroller = new CompraController();
        this.setPreferredSize(new Dimension(750, 650));

        initComponents();
        setOperacao(""); // inicializa o form no modo CONSULTA
        setLocationRelativeTo(null);
        consultar();
        // adiciona evento para que qdo navegar no JTable, atualize o registro nos JTextField´s
        tblConsulta.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent evt) {
                if (evt.getValueIsAdjusting()) {
                    return;
                }
                int selecionado = tblConsulta.getSelectedRow();
                if (selecionado >= 0) {
                    mostrar(array.get(selecionado));
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnPRIMEIRO = new javax.swing.JButton();
        btnANTERIOR = new javax.swing.JButton();
        btnPROXIMO = new javax.swing.JButton();
        btnULTIMO = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnINCLUIR = new javax.swing.JButton();
        btnALTERAR = new javax.swing.JButton();
        btnEXCLUIR = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnGRAVAR = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnIMPRIMIR = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnSAIR = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        edtCPR_CODIGO = new javax.swing.JTextField();
        lblUSU_LOGIN1 = new javax.swing.JLabel();
        lblCPR_EMISSAO = new javax.swing.JLabel();
        edtCPR_EMISSAO = new javax.swing.JTextField();
        lblCPR_VALOR = new javax.swing.JLabel();
        edtCPR_VALOR = new javax.swing.JTextField();
        edtCPR_DESCONTO = new javax.swing.JTextField();
        lblCPR_DESCONTO = new javax.swing.JLabel();
        edtCPR_TOTAL = new javax.swing.JTextField();
        lblCPR_DESCONTO2 = new javax.swing.JLabel();
        lblCPR_DTENTRADA = new javax.swing.JLabel();
        edtCPR_DTENTRADA = new javax.swing.JTextField();
        lblCPR_OBS = new javax.swing.JLabel();
        edtCPR_OBS = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblCONS_ID = new javax.swing.JLabel();
        edtCONS_ID1 = new javax.swing.JTextField();
        lblCodigo2 = new javax.swing.JLabel();
        edtCONS_ID2 = new javax.swing.JTextField();
        btnConsulta = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblConsulta = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MVC - Cadastro de Usuários");
        setFocusable(false);
        getContentPane().setLayout(null);

        jToolBar1.setRollover(true);

        btnPRIMEIRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/primeiro.png"))); // NOI18N
        btnPRIMEIRO.setText("Primeiro");
        btnPRIMEIRO.setFocusable(false);
        btnPRIMEIRO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPRIMEIRO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPRIMEIRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPRIMEIROActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPRIMEIRO);

        btnANTERIOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/anterior.png"))); // NOI18N
        btnANTERIOR.setText("Anterior");
        btnANTERIOR.setFocusable(false);
        btnANTERIOR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnANTERIOR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnANTERIOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnANTERIORActionPerformed(evt);
            }
        });
        jToolBar1.add(btnANTERIOR);

        btnPROXIMO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/proximo.png"))); // NOI18N
        btnPROXIMO.setText("Próximo");
        btnPROXIMO.setFocusable(false);
        btnPROXIMO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPROXIMO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPROXIMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPROXIMOActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPROXIMO);

        btnULTIMO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ultimo.png"))); // NOI18N
        btnULTIMO.setText("Último");
        btnULTIMO.setFocusable(false);
        btnULTIMO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnULTIMO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnULTIMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnULTIMOActionPerformed(evt);
            }
        });
        jToolBar1.add(btnULTIMO);

        jSeparator1.setSeparatorSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator1);

        btnINCLUIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo.png"))); // NOI18N
        btnINCLUIR.setText("Novo");
        btnINCLUIR.setFocusable(false);
        btnINCLUIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnINCLUIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnINCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINCLUIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnINCLUIR);

        btnALTERAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        btnALTERAR.setText("Alterar");
        btnALTERAR.setFocusable(false);
        btnALTERAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnALTERAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALTERARActionPerformed(evt);
            }
        });
        jToolBar1.add(btnALTERAR);

        btnEXCLUIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        btnEXCLUIR.setText("Excluir");
        btnEXCLUIR.setFocusable(false);
        btnEXCLUIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEXCLUIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXCLUIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEXCLUIR);

        jSeparator2.setSeparatorSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator2);

        btnGRAVAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        btnGRAVAR.setText("Gravar");
        btnGRAVAR.setFocusable(false);
        btnGRAVAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGRAVAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGRAVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGRAVARActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGRAVAR);

        jSeparator3.setSeparatorSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator3);

        btnIMPRIMIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imprimir.png"))); // NOI18N
        btnIMPRIMIR.setText("Imprimir");
        btnIMPRIMIR.setFocusable(false);
        btnIMPRIMIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIMPRIMIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIMPRIMIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIMPRIMIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnIMPRIMIR);

        jSeparator4.setSeparatorSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator4);

        btnSAIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        btnSAIR.setText("Sair");
        btnSAIR.setFocusable(false);
        btnSAIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSAIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSAIR);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 0, 740, 71);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastro de Compras");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(60, 80, 590, 29);

        edtCPR_CODIGO.setEditable(false);
        edtCPR_CODIGO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCPR_CODIGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCPR_CODIGOActionPerformed(evt);
            }
        });

        lblUSU_LOGIN1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN1.setText("Código");

        lblCPR_EMISSAO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCPR_EMISSAO.setText("Emissão");

        edtCPR_EMISSAO.setEditable(false);
        edtCPR_EMISSAO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCPR_EMISSAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCPR_EMISSAOActionPerformed(evt);
            }
        });

        lblCPR_VALOR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCPR_VALOR.setText("Valor");

        edtCPR_VALOR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCPR_VALOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCPR_VALORActionPerformed(evt);
            }
        });

        edtCPR_DESCONTO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCPR_DESCONTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCPR_DESCONTOActionPerformed(evt);
            }
        });

        lblCPR_DESCONTO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCPR_DESCONTO.setText("Desconto");

        edtCPR_TOTAL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCPR_TOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCPR_TOTALActionPerformed(evt);
            }
        });

        lblCPR_DESCONTO2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCPR_DESCONTO2.setText("Total");

        lblCPR_DTENTRADA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCPR_DTENTRADA.setText("Data de Entrada");

        edtCPR_DTENTRADA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCPR_DTENTRADA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCPR_DTENTRADAActionPerformed(evt);
            }
        });

        lblCPR_OBS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCPR_OBS.setText("Obs.");

        edtCPR_OBS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCPR_OBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCPR_OBSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblCPR_VALOR)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblCPR_OBS)
                            .addGap(12, 12, 12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUSU_LOGIN1)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtCPR_OBS, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(edtCPR_VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCPR_DESCONTO))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(edtCPR_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCPR_EMISSAO)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtCPR_DESCONTO, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtCPR_EMISSAO, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCPR_DESCONTO2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtCPR_TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCPR_DTENTRADA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtCPR_DTENTRADA, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUSU_LOGIN1)
                    .addComponent(edtCPR_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCPR_EMISSAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPR_EMISSAO)
                    .addComponent(edtCPR_DTENTRADA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPR_DTENTRADA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCPR_VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPR_VALOR)
                    .addComponent(edtCPR_DESCONTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPR_DESCONTO)
                    .addComponent(edtCPR_TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPR_DESCONTO2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCPR_OBS)
                    .addComponent(edtCPR_OBS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados da Compra", jPanel1);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 110, 710, 160);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCONS_ID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_ID.setText("ID");

        edtCONS_ID1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCodigo2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo2.setText("à");

        edtCONS_ID2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnConsulta.setText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpa");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblCONS_ID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtCONS_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCodigo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtCONS_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpar)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCONS_ID)
                    .addComponent(edtCONS_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo2)
                    .addComponent(edtCONS_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(tblConsulta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Consulta", jPanel2);

        getContentPane().add(jTabbedPane2);
        jTabbedPane2.setBounds(10, 280, 720, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPRIMEIROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRIMEIROActionPerformed
        if (array.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não Existem Compras Cadastradas !");
        } else {
            int selecionado = 0;
            tblConsulta.changeSelection(selecionado, 0, false, false);
        }
    }//GEN-LAST:event_btnPRIMEIROActionPerformed

    private void btnINCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINCLUIRActionPerformed
        limpar();
        setOperacao("incluir");
    }//GEN-LAST:event_btnINCLUIRActionPerformed

    private void btnGRAVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRAVARActionPerformed
        String mensagem;
        if (JOptionPane.showConfirmDialog(null, "Confirma Gravação desta Compra ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            CompraModel compramodel = new CompraModel();
            compramodel.setCPR_CODIGO(Integer.parseInt(edtCPR_CODIGO.getText()));
            try {
                compracontroller.gravar(compramodel, getOperacao());
                mensagem = "Dados Gravados com Sucesso";
            } catch (Exception ex) {
                mensagem = "Erro na Gravação do Usuário \n" + ex.getMessage();
            }
            JOptionPane.showMessageDialog(null, mensagem);
            consultar();
        }
    }//GEN-LAST:event_btnGRAVARActionPerformed

    private void btnALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERARActionPerformed
        setOperacao("alterar");
    }//GEN-LAST:event_btnALTERARActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        consultar();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnSAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAIRActionPerformed
        dispose();
    }//GEN-LAST:event_btnSAIRActionPerformed

    private void btnANTERIORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnANTERIORActionPerformed
        int selecionado = tblConsulta.getSelectedRow() - 1;
        if (selecionado >= 0) {
            tblConsulta.changeSelection(selecionado, 0, false, false);
        }
    }//GEN-LAST:event_btnANTERIORActionPerformed

    private void limpar() {
        edtCPR_CODIGO.setText("");
    }

    private void mostrar(CompraModel compra) {
        edtCPR_CODIGO.setText(String.valueOf(compra.getCPR_CODIGO()));
    }

    private String filtrar() {
        String condicao = "";
        if (!edtCONS_ID1.getText().trim().equals("")) {
            condicao += "(CPR_CODIGO >= " + edtCONS_ID1.getText() + ")";
        }
        if (!edtCONS_ID2.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(CPR_CODIGO <= " + edtCONS_ID2.getText() + ")";
        }
        if (!condicao.trim().equals("")) {
            condicao = " WHERE " + condicao;
        }
        return condicao;
    }

    private void consultar() {
        String condicao = filtrar();
        array = null;
        array = compracontroller.consultar(condicao);
        if (array.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não Existem Compras Cadastradas !");
        } else {
            mtb = new CompraTableModel(array);
            tblConsulta.setModel(mtb);
            tblConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            tblConsulta.changeSelection(0, 0, false, false);
            mostrar();
        }
    }

    private void mostrar() {
        int selecionado = tblConsulta.getSelectedRow();
        if (selecionado >= 0) {
            mostrar(array.get(selecionado));
        }
    }
    private void btnPROXIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPROXIMOActionPerformed
        int selecionado = tblConsulta.getSelectedRow() + 1;
        if (selecionado < array.size()) {
            tblConsulta.changeSelection(selecionado, 0, false, false);
        }
    }//GEN-LAST:event_btnPROXIMOActionPerformed

    private void btnULTIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnULTIMOActionPerformed
        int selecionado = array.size() - 1;
        tblConsulta.changeSelection(selecionado, 0, false, false);
    }//GEN-LAST:event_btnULTIMOActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        edtCONS_ID1.setText("");
        edtCONS_ID2.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        String mensagem;
        setOperacao("");
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão desta Compra ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            CompraModel compramodel = new CompraModel();

            try {
                compracontroller.excluir(compramodel);
                mensagem = "Compra Excluído com Sucesso";
            } catch (Exception ex) {
                mensagem = "Erro na Exclusão do Compra \n" + ex.getMessage();
            }
            JOptionPane.showMessageDialog(null, mensagem);
            consultar();
        }
    }//GEN-LAST:event_btnEXCLUIRActionPerformed

    private void btnIMPRIMIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMPRIMIRActionPerformed
        Exception retorno = compracontroller.imprimir();
        if (retorno != null) {
            JOptionPane.showMessageDialog(null, "Erro no Relatório de Usuários /n" + retorno.getMessage());
        }
    }//GEN-LAST:event_btnIMPRIMIRActionPerformed

    private void edtCPR_CODIGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCPR_CODIGOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCPR_CODIGOActionPerformed

    private void edtCPR_EMISSAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCPR_EMISSAOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCPR_EMISSAOActionPerformed

    private void edtCPR_VALORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCPR_VALORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCPR_VALORActionPerformed

    private void edtCPR_DESCONTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCPR_DESCONTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCPR_DESCONTOActionPerformed

    private void edtCPR_TOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCPR_TOTALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCPR_TOTALActionPerformed

    private void edtCPR_DTENTRADAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCPR_DTENTRADAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCPR_DTENTRADAActionPerformed

    private void edtCPR_OBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCPR_OBSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCPR_OBSActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnALTERAR;
    private javax.swing.JButton btnANTERIOR;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEXCLUIR;
    private javax.swing.JButton btnGRAVAR;
    private javax.swing.JButton btnIMPRIMIR;
    private javax.swing.JButton btnINCLUIR;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPRIMEIRO;
    private javax.swing.JButton btnPROXIMO;
    private javax.swing.JButton btnSAIR;
    private javax.swing.JButton btnULTIMO;
    private javax.swing.JTextField edtCONS_ID1;
    private javax.swing.JTextField edtCONS_ID2;
    private javax.swing.JTextField edtCPR_CODIGO;
    private javax.swing.JTextField edtCPR_DESCONTO;
    private javax.swing.JTextField edtCPR_DTENTRADA;
    private javax.swing.JTextField edtCPR_EMISSAO;
    private javax.swing.JTextField edtCPR_OBS;
    private javax.swing.JTextField edtCPR_TOTAL;
    private javax.swing.JTextField edtCPR_VALOR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblCONS_ID;
    private javax.swing.JLabel lblCPR_DESCONTO;
    private javax.swing.JLabel lblCPR_DESCONTO2;
    private javax.swing.JLabel lblCPR_DTENTRADA;
    private javax.swing.JLabel lblCPR_EMISSAO;
    private javax.swing.JLabel lblCPR_OBS;
    private javax.swing.JLabel lblCPR_VALOR;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUSU_LOGIN1;
    private javax.swing.JTable tblConsulta;
    // End of variables declaration//GEN-END:variables
}
