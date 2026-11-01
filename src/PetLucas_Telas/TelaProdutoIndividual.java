package PetLucas_Telas;

import petlucas.Produto;
import java.awt.Font;
import java.io.InputStream;

public class TelaProdutoIndividual extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaProdutoIndividual.class.getName());

    public TelaProdutoIndividual() {
        initComponents();
        
        try {
            // Aplicando a fonte principal
            java.io.InputStream isPrimaryFont = getClass().getResourceAsStream("/Assets/Fonts/CrimsonText-Regular.ttf");
            java.awt.Font primaryFont = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, isPrimaryFont);
            
            java.awt.Font titleFont = primaryFont.deriveFont(java.awt.Font.PLAIN, 16f);
            
            java.io.InputStream isSecondFont = getClass().getResourceAsStream("/Assets/Fonts/source-serif-pro.regular.ttf");
            java.awt.Font secondaryFont = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, isSecondFont);
            
            java.awt.Font textFont = secondaryFont.deriveFont(java.awt.Font.PLAIN, 12f);
            java.awt.Font descriptionFont = secondaryFont.deriveFont(java.awt.Font.PLAIN, 10f);
            
            HomeLabel.setFont(titleFont);
            ProdutosLabel.setFont(titleFont);
            CarrinhoLabel.setFont(titleFont);
            NomeProduto.setFont(titleFont);
            DescricaoProduto.setFont(descriptionFont);
            QuantidadeProduto.setFont(textFont);
            Quantidade.setFont(textFont);
            BotaoAdicionarCarrinho.setFont(textFont);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Construtor que "leva" o produto para a página de produto individual
    public TelaProdutoIndividual(Produto produto) {
        this();
        
        carregarProduto(produto);
    }
    
    // Adicionando o produto para exibir suas informações
    private void carregarProduto(Produto produto) {
        String labelNomeProduto = "<html><body style='width: 250px; text-align: left'>"
                + produto.getNome()
                + "</body></html>";
        
        NomeProduto.setText(labelNomeProduto);
        
        String labelDescricaoProduto = "<html><body style='width: 280px; text-align: left'>"
                + produto.getDescricao()
                + "</body></html>";
        
        DescricaoProduto.setText(labelDescricaoProduto);
        
        // Buscando a imagem
        try {
            // Carregando a imagem individual
            java.awt.Image imagemOriginal = javax.imageio.ImageIO.read(getClass().getResource(produto.getImagem()));
            
            // Definindo o tamanho da imagem
            int largura = 230;
            int altura = 230;
            
            // Redimensionando a imagem
            java.awt.Image imagemAlterada = imagemOriginal.getScaledInstance(largura, altura, java.awt.Image.SCALE_DEFAULT);
            
            ImagemProduto.setIcon(new javax.swing.ImageIcon(imagemAlterada));
        }
        catch (Exception e) {
            System.out.println("Erro ao carregar a imagem: " + produto.getImagem());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cabecalho = new javax.swing.JPanel();
        LogoMarca = new javax.swing.JLabel();
        HomeLabel = new javax.swing.JLabel();
        ProdutosLabel = new javax.swing.JLabel();
        CarrinhoLabel = new javax.swing.JLabel();
        ImagemProduto = new javax.swing.JLabel();
        NomeProduto = new javax.swing.JLabel();
        DescricaoProduto = new javax.swing.JLabel();
        QuantidadeProduto = new javax.swing.JLabel();
        Menos = new javax.swing.JLabel();
        Quantidade = new javax.swing.JLabel();
        Mais = new javax.swing.JLabel();
        BotaoAdicionarCarrinho = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
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

        ImagemProduto.setPreferredSize(new java.awt.Dimension(230, 230));

        NomeProduto.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        NomeProduto.setText("NomeProduto");

        DescricaoProduto.setText("DescricaoProduto");

        QuantidadeProduto.setText("Quantidade:");

        Menos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Images/Menos.png"))); // NOI18N

        Quantidade.setText("1");

        Mais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Images/Mais.png"))); // NOI18N

        BotaoAdicionarCarrinho.setBackground(new java.awt.Color(107, 246, 98));
        BotaoAdicionarCarrinho.setText("Adicionar ao carrinho");
        BotaoAdicionarCarrinho.addActionListener(this::BotaoAdicionarCarrinhoActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(ImagemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeProduto)
                            .addComponent(DescricaoProduto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(QuantidadeProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Menos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Quantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mais))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(BotaoAdicionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImagemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NomeProduto)
                        .addGap(37, 37, 37)
                        .addComponent(DescricaoProduto)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Mais)
                                .addComponent(Quantidade)
                                .addComponent(Menos))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(QuantidadeProduto)))
                        .addGap(48, 48, 48)
                        .addComponent(BotaoAdicionarCarrinho)))
                .addGap(0, 71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoAdicionarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAdicionarCarrinhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoAdicionarCarrinhoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaProdutoIndividual().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAdicionarCarrinho;
    private javax.swing.JPanel Cabecalho;
    private javax.swing.JLabel CarrinhoLabel;
    private javax.swing.JLabel DescricaoProduto;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JLabel ImagemProduto;
    private javax.swing.JLabel LogoMarca;
    private javax.swing.JLabel Mais;
    private javax.swing.JLabel Menos;
    private javax.swing.JLabel NomeProduto;
    private javax.swing.JLabel ProdutosLabel;
    private javax.swing.JLabel Quantidade;
    private javax.swing.JLabel QuantidadeProduto;
    // End of variables declaration//GEN-END:variables
}
