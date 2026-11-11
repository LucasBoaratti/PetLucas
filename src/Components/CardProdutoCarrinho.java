package Components;

import petlucas.Produto;

public class CardProdutoCarrinho extends javax.swing.JPanel {

    public CardProdutoCarrinho() {
        initComponents();
        
        try {
            // Aplicando a fonte principal
            java.io.InputStream isPrimaryFont = getClass().getResourceAsStream("/Assets/Fonts/CrimsonText-Regular.ttf");
            java.awt.Font primaryFont = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, isPrimaryFont);
            
            java.awt.Font titleFont = primaryFont.deriveFont(java.awt.Font.PLAIN, 16f);
            
            java.io.InputStream isSecondFont = getClass().getResourceAsStream("/Assets/Fonts/source-serif-pro.regular.ttf");
            java.awt.Font secondaryFont = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, isSecondFont);
            
            java.awt.Font textFont = secondaryFont.deriveFont(java.awt.Font.PLAIN, 14f);
            
            NomeProduto.setFont(titleFont);
            
            PrecoProduto.setFont(textFont);
            Quantidade.setFont(textFont);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Método que exibe o produto no carrinho do usuário
    public void setDadosProduto(Produto produto, int quantidade) {
        // Aplicando o nome do produto com tag HTML para quebrar linha
        String labelNomeProduto = "<html><body style='width: 150px; text-align: left'>"
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

        ImagemProduto = new javax.swing.JLabel();
        NomeProduto = new javax.swing.JLabel();
        PrecoProduto = new javax.swing.JLabel();
        Quantidade = new javax.swing.JLabel();

        NomeProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NomeProduto.setText("NomeProduto");

        PrecoProduto.setText("Preço");

        Quantidade.setText("Quantidade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(ImagemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NomeProduto)
                        .addComponent(Quantidade)
                        .addComponent(PrecoProduto))
                    .addContainerGap(17, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ImagemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(NomeProduto)
                            .addGap(27, 27, 27)
                            .addComponent(PrecoProduto)
                            .addGap(18, 18, 18)
                            .addComponent(Quantidade)))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagemProduto;
    private javax.swing.JLabel NomeProduto;
    private javax.swing.JLabel PrecoProduto;
    private javax.swing.JLabel Quantidade;
    // End of variables declaration//GEN-END:variables
}
