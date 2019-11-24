package view;

import controller.ClienteController;
import controller.PessoaController;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.PessoaModel;
import model.ClienteModel;

public class ClienteView extends javax.swing.JFrame {

    private String operacao;
    private ArrayList<ClienteModel> array;
    private ClienteTableModel mtb;
    private ClienteController clientecontroller;
    private PessoaController pessoacontroller;

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

    public ClienteView() {
        clientecontroller = new ClienteController();
        pessoacontroller = new PessoaController();
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
        lblUSU_NOME = new javax.swing.JLabel();
        edtCLI_LIMITECRED = new javax.swing.JTextField();
        edtCLI_CODIGO = new javax.swing.JTextField();
        lblUSU_LOGIN1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblUSU_NOME1 = new javax.swing.JLabel();
        edtPES_NOME = new javax.swing.JTextField();
        chkPES_ATIVO = new javax.swing.JCheckBox();
        edtPES_CODIGO = new javax.swing.JTextField();
        lblUSU_LOGIN2 = new javax.swing.JLabel();
        edtPES_FANTASIA = new javax.swing.JTextField();
        lblUSU_NOME2 = new javax.swing.JLabel();
        chkPES_FISICA = new javax.swing.JCheckBox();
        edtPES_CPFCNPJ = new javax.swing.JTextField();
        lblUSU_LOGIN3 = new javax.swing.JLabel();
        edtPES_RGIE = new javax.swing.JTextField();
        lblUSU_LOGIN4 = new javax.swing.JLabel();
        edtPES_CADASTRO = new javax.swing.JTextField();
        lblUSU_LOGIN5 = new javax.swing.JLabel();
        lblUSU_NOME3 = new javax.swing.JLabel();
        edtPES_ENDERECO = new javax.swing.JTextField();
        edtPES_COMPLEMENTO = new javax.swing.JTextField();
        lblUSU_NOME4 = new javax.swing.JLabel();
        lblUSU_NOME5 = new javax.swing.JLabel();
        edtPES_BAIRRO = new javax.swing.JTextField();
        edtPES_CIDADE = new javax.swing.JTextField();
        lblUSU_NOME6 = new javax.swing.JLabel();
        edtPES_UF = new javax.swing.JTextField();
        lblUSU_LOGIN7 = new javax.swing.JLabel();
        edtPES_CEP = new javax.swing.JTextField();
        lblUSU_NOME7 = new javax.swing.JLabel();
        edtPES_FONE1 = new javax.swing.JTextField();
        lblUSU_NOME8 = new javax.swing.JLabel();
        edtPES_FONE2 = new javax.swing.JTextField();
        lblUSU_NOME9 = new javax.swing.JLabel();
        edtPES_CELULAR = new javax.swing.JTextField();
        lblUSU_NOME10 = new javax.swing.JLabel();
        edtPES_EMAIL = new javax.swing.JTextField();
        lblUSU_NOME11 = new javax.swing.JLabel();
        edtPES_SITE = new javax.swing.JTextField();
        lblUSU_NOME12 = new javax.swing.JLabel();
        edtPES_NUMERO = new javax.swing.JTextField();
        lblUSU_LOGIN8 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblCONS_ID = new javax.swing.JLabel();
        edtCONS_ID1 = new javax.swing.JTextField();
        lblCodigo2 = new javax.swing.JLabel();
        edtCONS_ID2 = new javax.swing.JTextField();
        btnConsulta = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblCONS_NOME = new javax.swing.JLabel();
        edtCONS_NOME = new javax.swing.JTextField();
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
        jToolBar1.setBounds(20, 0, 690, 71);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastro de Clientes");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(60, 80, 590, 29);

        lblUSU_NOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME.setText("Limite de Crédito");

        edtCLI_LIMITECRED.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCLI_LIMITECRED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCLI_LIMITECREDActionPerformed(evt);
            }
        });

        edtCLI_CODIGO.setEditable(false);
        edtCLI_CODIGO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCLI_CODIGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCLI_CODIGOActionPerformed(evt);
            }
        });

        lblUSU_LOGIN1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN1.setText("Código");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUSU_NOME)
                    .addComponent(lblUSU_LOGIN1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtCLI_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCLI_LIMITECRED, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUSU_LOGIN1)
                    .addComponent(edtCLI_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUSU_NOME)
                    .addComponent(edtCLI_LIMITECRED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados do Cliente", jPanel1);

        lblUSU_NOME1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME1.setText("Nome");

        edtPES_NOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPES_NOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_NOMEActionPerformed(evt);
            }
        });

        chkPES_ATIVO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkPES_ATIVO.setText("ATIVO?");
        chkPES_ATIVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPES_ATIVOActionPerformed(evt);
            }
        });

        edtPES_CODIGO.setEditable(false);
        edtPES_CODIGO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPES_CODIGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_CODIGOActionPerformed(evt);
            }
        });

        lblUSU_LOGIN2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN2.setText("Código");

        edtPES_FANTASIA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPES_FANTASIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_FANTASIAActionPerformed(evt);
            }
        });

        lblUSU_NOME2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME2.setText("Nome Fantasia");

        chkPES_FISICA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkPES_FISICA.setText("FÍSICA?");
        chkPES_FISICA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPES_FISICAActionPerformed(evt);
            }
        });

        edtPES_CPFCNPJ.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPES_CPFCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_CPFCNPJActionPerformed(evt);
            }
        });

        lblUSU_LOGIN3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN3.setText("CPF/CNPJ");

        edtPES_RGIE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPES_RGIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_RGIEActionPerformed(evt);
            }
        });

        lblUSU_LOGIN4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN4.setText("RG");

        edtPES_CADASTRO.setEditable(false);
        edtPES_CADASTRO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPES_CADASTRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_CADASTROActionPerformed(evt);
            }
        });

        lblUSU_LOGIN5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN5.setText("Cadastro");

        lblUSU_NOME3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME3.setText("Endereço");

        edtPES_ENDERECO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPES_ENDERECO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_ENDERECOActionPerformed(evt);
            }
        });

        edtPES_COMPLEMENTO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPES_COMPLEMENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_COMPLEMENTOActionPerformed(evt);
            }
        });

        lblUSU_NOME4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME4.setText("Complemento");

        lblUSU_NOME5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME5.setText("Bairro");

        edtPES_BAIRRO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPES_BAIRRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_BAIRROActionPerformed(evt);
            }
        });

        edtPES_CIDADE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPES_CIDADE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_CIDADEActionPerformed(evt);
            }
        });

        lblUSU_NOME6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME6.setText("Cidade");

        edtPES_UF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPES_UF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_UFActionPerformed(evt);
            }
        });

        lblUSU_LOGIN7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN7.setText("UF");

        edtPES_CEP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPES_CEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_CEPActionPerformed(evt);
            }
        });

        lblUSU_NOME7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME7.setText("CEP");

        edtPES_FONE1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPES_FONE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_FONE1ActionPerformed(evt);
            }
        });

        lblUSU_NOME8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME8.setText("Fone 1");

        edtPES_FONE2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPES_FONE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_FONE2ActionPerformed(evt);
            }
        });

        lblUSU_NOME9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME9.setText("Fone 2");

        edtPES_CELULAR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPES_CELULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_CELULARActionPerformed(evt);
            }
        });

        lblUSU_NOME10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME10.setText("Celular");

        edtPES_EMAIL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPES_EMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_EMAILActionPerformed(evt);
            }
        });

        lblUSU_NOME11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME11.setText("Email");

        edtPES_SITE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPES_SITE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_SITEActionPerformed(evt);
            }
        });

        lblUSU_NOME12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME12.setText("Site");

        edtPES_NUMERO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPES_NUMERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_NUMEROActionPerformed(evt);
            }
        });

        lblUSU_LOGIN8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN8.setText("Numero");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUSU_LOGIN2)
                            .addComponent(lblUSU_NOME1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(edtPES_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkPES_ATIVO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkPES_FISICA))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(edtPES_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblUSU_LOGIN3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtPES_CPFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblUSU_LOGIN4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtPES_RGIE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUSU_LOGIN5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtPES_CADASTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUSU_NOME3)
                            .addComponent(lblUSU_NOME12)
                            .addComponent(lblUSU_NOME4)
                            .addComponent(lblUSU_NOME2)
                            .addComponent(lblUSU_NOME7)
                            .addComponent(lblUSU_NOME10))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(edtPES_SITE)
                                        .addGap(47, 47, 47))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(edtPES_CELULAR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(458, 458, 458))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(edtPES_ENDERECO)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblUSU_LOGIN8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(edtPES_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblUSU_NOME5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edtPES_BAIRRO))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(edtPES_COMPLEMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(lblUSU_NOME6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edtPES_CIDADE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblUSU_LOGIN7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edtPES_UF, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(edtPES_FANTASIA)
                                        .addGap(105, 105, 105))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblUSU_NOME11)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(edtPES_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblUSU_NOME8)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(edtPES_FONE1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblUSU_NOME9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(edtPES_FONE2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(edtPES_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUSU_LOGIN2)
                    .addComponent(edtPES_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUSU_LOGIN3)
                    .addComponent(edtPES_CPFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUSU_LOGIN4)
                    .addComponent(edtPES_RGIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUSU_LOGIN5)
                    .addComponent(edtPES_CADASTRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUSU_NOME1)
                    .addComponent(edtPES_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPES_ATIVO)
                    .addComponent(chkPES_FISICA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUSU_NOME2)
                    .addComponent(edtPES_FANTASIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUSU_LOGIN8)
                    .addComponent(edtPES_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUSU_NOME5)
                    .addComponent(edtPES_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUSU_NOME3)
                    .addComponent(edtPES_ENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUSU_NOME6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edtPES_COMPLEMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUSU_NOME4)
                        .addComponent(lblUSU_LOGIN7)
                        .addComponent(edtPES_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edtPES_CIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edtPES_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUSU_NOME7))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edtPES_FONE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUSU_NOME8)
                        .addComponent(edtPES_FONE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUSU_NOME9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtPES_CELULAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUSU_NOME10)
                    .addComponent(lblUSU_NOME11)
                    .addComponent(edtPES_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUSU_NOME12)
                    .addComponent(edtPES_SITE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados da Pessoa", jPanel4);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 110, 710, 290);

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

        lblCONS_NOME.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_NOME.setText("Nome");

        edtCONS_NOME.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblCONS_NOME)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_NOME))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblCONS_ID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCodigo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCONS_ID)
                    .addComponent(edtCONS_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo2)
                    .addComponent(edtCONS_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCONS_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_NOME)
                    .addComponent(btnLimpar))
                .addContainerGap())
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Consulta", jPanel2);

        getContentPane().add(jTabbedPane2);
        jTabbedPane2.setBounds(10, 420, 720, 170);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPRIMEIROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRIMEIROActionPerformed
        if (array.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não Existem Clientes Cadastrados !");
        } else {
            int selecionado = 0;
            tblConsulta.changeSelection(selecionado, 0, false, false);
        }
    }//GEN-LAST:event_btnPRIMEIROActionPerformed

    private void btnINCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINCLUIRActionPerformed
        limpar();
        setOperacao("incluir");
        edtCLI_LIMITECRED.setFocusable(true);
    }//GEN-LAST:event_btnINCLUIRActionPerformed

    private void btnGRAVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRAVARActionPerformed
        String mensagem;
        if (JOptionPane.showConfirmDialog(null, "Confirma Gravação deste Cliente ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            String fisica,ativo;
            if(chkPES_FISICA.isSelected())
                fisica = "S";
            else
                fisica = "N";
            
            if(chkPES_ATIVO.isSelected())
                ativo = "S";
            else
                ativo = "N";
            
            PessoaModel pessoamodel = new PessoaModel();
            ClienteModel clientemodel = new ClienteModel();
            pessoamodel.setPES_CODIGO(Integer.parseInt(edtPES_CODIGO.getText()));
            pessoamodel.setPES_NOME(edtPES_NOME.getText());
            pessoamodel.setPES_FANTASIA(edtPES_FANTASIA.getText());
            pessoamodel.setPES_FISICA(fisica);
            pessoamodel.setPES_CPFCNPJ(edtPES_CPFCNPJ.getText());
            pessoamodel.setPES_RGIE(edtPES_RGIE.getText());
            pessoamodel.setPES_ENDERECO(edtPES_ENDERECO.getText());
            pessoamodel.setPES_NUMERO(edtPES_NUMERO.getText());
            pessoamodel.setPES_COMPLEMENTO(edtPES_COMPLEMENTO.getText());
            pessoamodel.setPES_BAIRRO(edtPES_BAIRRO.getText());
            pessoamodel.setPES_CIDADE(edtPES_CIDADE.getText());
            pessoamodel.setPES_UF(edtPES_UF.getText());
            pessoamodel.setPES_CEP(edtPES_CEP.getText());
            pessoamodel.setPES_FONE1(edtPES_FONE1.getText());
            pessoamodel.setPES_FONE2(edtPES_FONE2.getText());
            pessoamodel.setPES_CELULAR(edtPES_CELULAR.getText());
            pessoamodel.setPES_SITE(edtPES_SITE.getText());
            pessoamodel.setPES_EMAIL(edtPES_EMAIL.getText());
            pessoamodel.setPES_ATIVO(ativo);
            
           
//            ClienteModel clientemodel = new ClienteModel();
            clientemodel.setPessoa(pessoamodel);
            clientemodel.setCLI_CODIGO(Integer.parseInt(edtCLI_CODIGO.getText()));
            

            try {
                pessoacontroller.gravar(pessoamodel, getOperacao());
                clientecontroller.gravar(clientemodel, getOperacao());
                mensagem = "Dados Gravados com Sucesso";
            } catch (Exception ex) {
                mensagem = "Erro na Gravação do Cliente \n" + ex.getMessage();
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
        edtCLI_CODIGO.setText("0");
        edtCLI_LIMITECRED.setText("");
        edtPES_CODIGO.setText("0");
        edtPES_NOME.setText("");
        edtPES_FANTASIA.setText("");
        edtPES_CPFCNPJ.setText("");
        edtPES_RGIE.setText("");
        edtPES_CADASTRO.setText("");
        edtPES_ENDERECO.setText("");
        edtPES_NUMERO.setText("");
        edtPES_COMPLEMENTO.setText("");
        edtPES_BAIRRO.setText("");
        edtPES_CIDADE.setText("");
        edtPES_UF.setText("");
        edtPES_CEP.setText("");
        edtPES_FONE1.setText("");
        edtPES_FONE2.setText("");
        edtPES_CELULAR.setText("");
        edtPES_SITE.setText("");
        edtPES_EMAIL.setText("");
        chkPES_ATIVO.setSelected(false);
        chkPES_FISICA.setSelected(false);
    }

    private void mostrar(ClienteModel cliente) {
        edtCLI_CODIGO.setText(String.valueOf(cliente.getCLI_CODIGO()));
    }

    private String filtrar() {
        String condicao = "";
        if (!edtCONS_ID1.getText().trim().equals("")) {
            condicao += "(CLI_CODIGO >= " + edtCONS_ID1.getText() + ")";
        }
        if (!edtCONS_ID2.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(CLI_CODIGO <= " + edtCONS_ID2.getText() + ")";
        }
        if (!edtCONS_NOME.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(CLI_NOME LIKE ('%" + edtCONS_NOME.getText() + "%'))";
        }
        if (!condicao.trim().equals("")) {
            condicao = " WHERE " + condicao;
        }
        return condicao;
    }

    private void consultar() {
        String condicao = filtrar();
        array = null;
        array = clientecontroller.consultar(condicao);
        if (array.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não Existem Clientes Cadastrados !");
        } else {
            mtb = new ClienteTableModel(array);
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
        edtCONS_NOME.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        String mensagem;
        setOperacao("");
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão deste Cliente ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            ClienteModel clientemodel = new ClienteModel();

            try {
                clientecontroller.excluir(clientemodel);
                mensagem = "Cliente Excluído com Sucesso";
            } catch (Exception ex) {
                mensagem = "Erro na Exclusão do Cliente \n" + ex.getMessage();
            }
            JOptionPane.showMessageDialog(null, mensagem);
            consultar();
        }
    }//GEN-LAST:event_btnEXCLUIRActionPerformed

    private void btnIMPRIMIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMPRIMIRActionPerformed
        Exception retorno = clientecontroller.imprimir();
        if (retorno != null) {
            JOptionPane.showMessageDialog(null, "Erro no Relatório de Clientes /n" + retorno.getMessage());
        }
    }//GEN-LAST:event_btnIMPRIMIRActionPerformed

    private void edtCLI_CODIGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCLI_CODIGOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCLI_CODIGOActionPerformed

    private void edtCLI_LIMITECREDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCLI_LIMITECREDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCLI_LIMITECREDActionPerformed

    private void edtPES_COMPLEMENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_COMPLEMENTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_COMPLEMENTOActionPerformed

    private void edtPES_ENDERECOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_ENDERECOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_ENDERECOActionPerformed

    private void edtPES_CADASTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_CADASTROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_CADASTROActionPerformed

    private void edtPES_RGIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_RGIEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_RGIEActionPerformed

    private void edtPES_CPFCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_CPFCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_CPFCNPJActionPerformed

    private void chkPES_FISICAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPES_FISICAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPES_FISICAActionPerformed

    private void edtPES_FANTASIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_FANTASIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_FANTASIAActionPerformed

    private void edtPES_CODIGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_CODIGOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_CODIGOActionPerformed

    private void chkPES_ATIVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPES_ATIVOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPES_ATIVOActionPerformed

    private void edtPES_NOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_NOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_NOMEActionPerformed

    private void edtPES_BAIRROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_BAIRROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_BAIRROActionPerformed

    private void edtPES_CIDADEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_CIDADEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_CIDADEActionPerformed

    private void edtPES_UFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_UFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_UFActionPerformed

    private void edtPES_CEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_CEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_CEPActionPerformed

    private void edtPES_FONE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_FONE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_FONE1ActionPerformed

    private void edtPES_FONE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_FONE2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_FONE2ActionPerformed

    private void edtPES_CELULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_CELULARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_CELULARActionPerformed

    private void edtPES_EMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_EMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_EMAILActionPerformed

    private void edtPES_SITEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_SITEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_SITEActionPerformed

    private void edtPES_NUMEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_NUMEROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_NUMEROActionPerformed
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
    private javax.swing.JCheckBox chkPES_ATIVO;
    private javax.swing.JCheckBox chkPES_FISICA;
    private javax.swing.JTextField edtCLI_CODIGO;
    private javax.swing.JTextField edtCLI_LIMITECRED;
    private javax.swing.JTextField edtCONS_ID1;
    private javax.swing.JTextField edtCONS_ID2;
    private javax.swing.JTextField edtCONS_NOME;
    private javax.swing.JTextField edtPES_BAIRRO;
    private javax.swing.JTextField edtPES_CADASTRO;
    private javax.swing.JTextField edtPES_CELULAR;
    private javax.swing.JTextField edtPES_CEP;
    private javax.swing.JTextField edtPES_CIDADE;
    private javax.swing.JTextField edtPES_CODIGO;
    private javax.swing.JTextField edtPES_COMPLEMENTO;
    private javax.swing.JTextField edtPES_CPFCNPJ;
    private javax.swing.JTextField edtPES_EMAIL;
    private javax.swing.JTextField edtPES_ENDERECO;
    private javax.swing.JTextField edtPES_FANTASIA;
    private javax.swing.JTextField edtPES_FONE1;
    private javax.swing.JTextField edtPES_FONE2;
    private javax.swing.JTextField edtPES_NOME;
    private javax.swing.JTextField edtPES_NUMERO;
    private javax.swing.JTextField edtPES_RGIE;
    private javax.swing.JTextField edtPES_SITE;
    private javax.swing.JTextField edtPES_UF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
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
    private javax.swing.JLabel lblCONS_NOME;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUSU_LOGIN1;
    private javax.swing.JLabel lblUSU_LOGIN2;
    private javax.swing.JLabel lblUSU_LOGIN3;
    private javax.swing.JLabel lblUSU_LOGIN4;
    private javax.swing.JLabel lblUSU_LOGIN5;
    private javax.swing.JLabel lblUSU_LOGIN7;
    private javax.swing.JLabel lblUSU_LOGIN8;
    private javax.swing.JLabel lblUSU_NOME;
    private javax.swing.JLabel lblUSU_NOME1;
    private javax.swing.JLabel lblUSU_NOME10;
    private javax.swing.JLabel lblUSU_NOME11;
    private javax.swing.JLabel lblUSU_NOME12;
    private javax.swing.JLabel lblUSU_NOME2;
    private javax.swing.JLabel lblUSU_NOME3;
    private javax.swing.JLabel lblUSU_NOME4;
    private javax.swing.JLabel lblUSU_NOME5;
    private javax.swing.JLabel lblUSU_NOME6;
    private javax.swing.JLabel lblUSU_NOME7;
    private javax.swing.JLabel lblUSU_NOME8;
    private javax.swing.JLabel lblUSU_NOME9;
    private javax.swing.JTable tblConsulta;
    // End of variables declaration//GEN-END:variables
}
