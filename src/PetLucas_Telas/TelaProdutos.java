package PetLucas_Telas;

public class TelaProdutos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaProdutos.class.getName());

    public TelaProdutos() {
        initComponents();
        adicionarLinksCabecalho();
        
        try {
            // Aplicando a fonte principal
            java.io.InputStream isPrimaryFont = getClass().getResourceAsStream("/Assets/Fonts/CrimsonText-Regular.ttf");
            java.awt.Font primaryFont = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, isPrimaryFont);
            
            java.awt.Font titleFont = primaryFont.deriveFont(java.awt.Font.PLAIN, 16f);
            
            java.io.InputStream isSecondFont = getClass().getResourceAsStream("/Assets/Fonts/source-serif-pro.regular.ttf");
            java.awt.Font secondaryFont = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, isSecondFont);
            
            java.awt.Font textFont = secondaryFont.deriveFont(java.awt.Font.PLAIN, 14f);
            
            HomeLabel.setFont(titleFont);
            ProdutosLabel.setFont(titleFont);
            CarrinhoLabel.setFont(titleFont);
            TextoProdutosLoja.setFont(titleFont);
            
            TextoFiltros.setFont(textFont);
            FiltroTodos.setFont(textFont);
            FiltroRacao.setFont(textFont);
            FiltroBrinquedo.setFont(textFont);
            FiltroRemedio.setFont(textFont);
            FiltroCama.setFont(textFont);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Método para adicionar links no cabeçalho
    private void adicionarLinksCabecalho() {
        // Criando um link no label home do cabeçalho para ir para a tela home
        HomeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelaHome telaHome = new TelaHome();
                telaHome.setVisible(true);
                
                dispose();
            }
        });
        
        // Mudando o cursor do mouse
        HomeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cabecalho = new javax.swing.JPanel();
        LogoMarca = new javax.swing.JLabel();
        HomeLabel = new javax.swing.JLabel();
        ProdutosLabel = new javax.swing.JLabel();
        CarrinhoLabel = new javax.swing.JLabel();
        TextoProdutosLoja = new javax.swing.JLabel();
        TextoFiltros = new javax.swing.JLabel();
        FiltroTodos = new javax.swing.JCheckBox();
        FiltroRacao = new javax.swing.JCheckBox();
        FiltroBrinquedo = new javax.swing.JCheckBox();
        FiltroRemedio = new javax.swing.JCheckBox();
        FiltroCama = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cabecalho.setBackground(new java.awt.Color(244, 162, 244));

        LogoMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Images/LogoMarca.png"))); // NOI18N

        HomeLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        HomeLabel.setText("Home");

        ProdutosLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ProdutosLabel.setText("Produtos");

        CarrinhoLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CarrinhoLabel.setText("Carrinho");

        javax.swing.GroupLayout CabecalhoLayout = new javax.swing.GroupLayout(Cabecalho);
        Cabecalho.setLayout(CabecalhoLayout);
        CabecalhoLayout.setHorizontalGroup(
            CabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabecalhoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(LogoMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(HomeLabel)
                .addGap(18, 18, 18)
                .addComponent(ProdutosLabel)
                .addGap(18, 18, 18)
                .addComponent(CarrinhoLabel)
                .addGap(37, 37, 37))
        );
        CabecalhoLayout.setVerticalGroup(
            CabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogoMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CabecalhoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(CabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HomeLabel)
                    .addComponent(ProdutosLabel)
                    .addComponent(CarrinhoLabel))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        TextoProdutosLoja.setText("Confira todos os produtos da loja aqui");

        TextoFiltros.setText("Filtros:");

        FiltroTodos.setText("Todos");
        FiltroTodos.addActionListener(this::FiltroTodosActionPerformed);

        FiltroRacao.setText("Rações");

        FiltroBrinquedo.setText("Brinquedos");

        FiltroRemedio.setText("Remédios");

        FiltroCama.setText("Camas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(TextoProdutosLoja)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextoFiltros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FiltroTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FiltroRacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FiltroBrinquedo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FiltroRemedio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FiltroCama)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextoProdutosLoja)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoFiltros)
                    .addComponent(FiltroTodos)
                    .addComponent(FiltroRacao)
                    .addComponent(FiltroBrinquedo)
                    .addComponent(FiltroRemedio)
                    .addComponent(FiltroCama))
                .addGap(0, 272, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FiltroTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroTodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltroTodosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaProdutos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cabecalho;
    private javax.swing.JLabel CarrinhoLabel;
    private javax.swing.JCheckBox FiltroBrinquedo;
    private javax.swing.JCheckBox FiltroCama;
    private javax.swing.JCheckBox FiltroRacao;
    private javax.swing.JCheckBox FiltroRemedio;
    private javax.swing.JCheckBox FiltroTodos;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JLabel LogoMarca;
    private javax.swing.JLabel ProdutosLabel;
    private javax.swing.JLabel TextoFiltros;
    private javax.swing.JLabel TextoProdutosLoja;
    // End of variables declaration//GEN-END:variables
}
