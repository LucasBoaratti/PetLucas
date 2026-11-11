package PetLucas_Telas;

import petlucas.Produto;

public class TelaCarrinho extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCarrinho.class.getName());

    public TelaCarrinho() {
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
            TextoCarrinho.setFont(titleFont);
            NomeProduto.setFont(titleFont);
            
            PrecoProduto.setFont(textFont);
            Quantidade.setFont(textFont);
            ResumoPedidoTexto.setFont(textFont);
            PrecoTotal.setFont(textFont);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public TelaCarrinho(Produto produto, int quantidade) {
        initComponents();
        adicionarLinksCabecalho();
        
        setDadosProduto(produto, quantidade);
    }
    
    // Método que adiciona links no cabecalho
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
        
        ProdutosLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelaProdutos telaProdutos = new TelaProdutos();
                telaProdutos.setVisible(true);
                
                dispose();
            }
        });
        
        // Mudando o cursor do mouse
        ProdutosLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
    
    // Método que exibe o produto no carrinho do usuário
    public void setDadosProduto(Produto produto, int quantidade) {
        // Aplicando o nome do produto com tag HTML para quebrar linha
        String labelNomeProduto = "<html><body style='width: 70px; text-align: left'>"
                + produto.getNome()
                + "</body></html>";
        
        NomeProduto.setText(labelNomeProduto);
        
        // Calculando o preço total, de acordo com a quantidade escolhida pelo usuário
        float precoTotal = produto.getPreco() * quantidade;
        PrecoProduto.setText(String.format("R$ %.2f", precoTotal));
        
        Quantidade.setText(String.format("Quantidade: %d", quantidade));
        
        // Carregando a imagem do produto
        try {
            // Carregando a imagem individual
            java.awt.Image imagemOriginal = javax.imageio.ImageIO.read(getClass().getResource(produto.getImagem()));
            
            // Definindo o tamanho da imagem
            int largura = 115;
            int altura = 115;
            
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

        Overflow = new javax.swing.JScrollPane();
        CarrinhoCompras = new javax.swing.JPanel();
        Cabecalho = new javax.swing.JPanel();
        LogoMarca = new javax.swing.JLabel();
        HomeLabel = new javax.swing.JLabel();
        ProdutosLabel = new javax.swing.JLabel();
        CarrinhoLabel = new javax.swing.JLabel();
        TextoCarrinho = new javax.swing.JLabel();
        Produtos = new javax.swing.JPanel();
        ImagemProduto = new javax.swing.JLabel();
        NomeProduto = new javax.swing.JLabel();
        PrecoProduto = new javax.swing.JLabel();
        Quantidade = new javax.swing.JLabel();
        ResumoPedido = new javax.swing.JPanel();
        ResumoPedidoTexto = new javax.swing.JLabel();
        PrecoTotal = new javax.swing.JLabel();
        BotaoRealizarPagamento = new javax.swing.JButton();
        Rodape = new javax.swing.JPanel();
        TextoRodape = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Overflow.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        Overflow.setPreferredSize(new java.awt.Dimension(1071, 1000));

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
                .addGap(26, 26, 26)
                .addComponent(LogoMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(HomeLabel)
                .addGap(18, 18, 18)
                .addComponent(ProdutosLabel)
                .addGap(18, 18, 18)
                .addComponent(CarrinhoLabel)
                .addGap(37, 37, 37))
        );
        CabecalhoLayout.setVerticalGroup(
            CabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabecalhoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(CabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HomeLabel)
                    .addComponent(ProdutosLabel)
                    .addComponent(CarrinhoLabel)))
            .addGroup(CabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        TextoCarrinho.setText("Seu carrinho");

        NomeProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NomeProduto.setText("NomeProduto");

        PrecoProduto.setText("Preço");

        Quantidade.setText("Quantidade");

        javax.swing.GroupLayout ProdutosLayout = new javax.swing.GroupLayout(Produtos);
        Produtos.setLayout(ProdutosLayout);
        ProdutosLayout.setHorizontalGroup(
            ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProdutosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(ImagemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomeProduto)
                    .addComponent(Quantidade)
                    .addComponent(PrecoProduto))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        ProdutosLayout.setVerticalGroup(
            ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProdutosLayout.createSequentialGroup()
                .addGroup(ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProdutosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ImagemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProdutosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(NomeProduto)
                        .addGap(27, 27, 27)
                        .addComponent(PrecoProduto)
                        .addGap(18, 18, 18)
                        .addComponent(Quantidade)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ResumoPedido.setBackground(new java.awt.Color(244, 162, 244));

        ResumoPedidoTexto.setText("Resumo do pedido");

        PrecoTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PrecoTotal.setText("PrecoTotal");

        BotaoRealizarPagamento.setBackground(new java.awt.Color(107, 246, 98));
        BotaoRealizarPagamento.setText("Realizar Pagamento");
        BotaoRealizarPagamento.addActionListener(this::BotaoRealizarPagamentoActionPerformed);

        javax.swing.GroupLayout ResumoPedidoLayout = new javax.swing.GroupLayout(ResumoPedido);
        ResumoPedido.setLayout(ResumoPedidoLayout);
        ResumoPedidoLayout.setHorizontalGroup(
            ResumoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResumoPedidoLayout.createSequentialGroup()
                .addGroup(ResumoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResumoPedidoLayout.createSequentialGroup()
                        .addGroup(ResumoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ResumoPedidoLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(ResumoPedidoTexto))
                            .addGroup(ResumoPedidoLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(PrecoTotal)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResumoPedidoLayout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(BotaoRealizarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ResumoPedidoLayout.setVerticalGroup(
            ResumoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResumoPedidoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(ResumoPedidoTexto)
                .addGap(29, 29, 29)
                .addComponent(PrecoTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoRealizarPagamento)
                .addContainerGap())
        );

        Rodape.setBackground(new java.awt.Color(244, 162, 244));

        TextoRodape.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TextoRodape.setText("PetLucas, 2026");

        javax.swing.GroupLayout RodapeLayout = new javax.swing.GroupLayout(Rodape);
        Rodape.setLayout(RodapeLayout);
        RodapeLayout.setHorizontalGroup(
            RodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RodapeLayout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(TextoRodape)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RodapeLayout.setVerticalGroup(
            RodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextoRodape, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout CarrinhoComprasLayout = new javax.swing.GroupLayout(CarrinhoCompras);
        CarrinhoCompras.setLayout(CarrinhoComprasLayout);
        CarrinhoComprasLayout.setHorizontalGroup(
            CarrinhoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CarrinhoComprasLayout.createSequentialGroup()
                .addGroup(CarrinhoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CarrinhoComprasLayout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(TextoCarrinho))
                    .addGroup(CarrinhoComprasLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Produtos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(ResumoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(CarrinhoComprasLayout.createSequentialGroup()
                .addGroup(CarrinhoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Rodape, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cabecalho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 424, Short.MAX_VALUE))
        );
        CarrinhoComprasLayout.setVerticalGroup(
            CarrinhoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CarrinhoComprasLayout.createSequentialGroup()
                .addComponent(Cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextoCarrinho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CarrinhoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ResumoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Produtos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addComponent(Rodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Overflow.setViewportView(CarrinhoCompras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Overflow, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Overflow, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoRealizarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRealizarPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoRealizarPagamentoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaCarrinho().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoRealizarPagamento;
    private javax.swing.JPanel Cabecalho;
    private javax.swing.JPanel CarrinhoCompras;
    private javax.swing.JLabel CarrinhoLabel;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JLabel ImagemProduto;
    private javax.swing.JLabel LogoMarca;
    private javax.swing.JLabel NomeProduto;
    private javax.swing.JScrollPane Overflow;
    private javax.swing.JLabel PrecoProduto;
    private javax.swing.JLabel PrecoTotal;
    private javax.swing.JPanel Produtos;
    private javax.swing.JLabel ProdutosLabel;
    private javax.swing.JLabel Quantidade;
    private javax.swing.JPanel ResumoPedido;
    private javax.swing.JLabel ResumoPedidoTexto;
    private javax.swing.JPanel Rodape;
    private javax.swing.JLabel TextoCarrinho;
    private javax.swing.JLabel TextoRodape;
    // End of variables declaration//GEN-END:variables
}
