package Components;

import PetLucas_Telas.TelaProdutoIndividual;
import petlucas.Produto;

public class CardProdutosRecomendados extends javax.swing.JPanel {
    private Produto produto;
    
    public CardProdutosRecomendados() {
        initComponents();
        
        // Aplicando a fonte nos cards
        try {
            java.io.InputStream isPrimaryFont = getClass().getResourceAsStream("/Assets/Fonts/source-serif-pro.regular.ttf");
            java.awt.Font primaryFont = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, isPrimaryFont);  
            
            java.awt.Font font = primaryFont.deriveFont(java.awt.Font.PLAIN, 12f);
            java.awt.Font buttonFont = primaryFont.deriveFont(java.awt.Font.PLAIN, 10f);
            
            NomeProduto.setFont(font);
            PrecoProduto.setFont(font);
            BotaoVerProduto.setFont(buttonFont);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Adicionando os dados no card do produto
    public void setDadosProduto(Produto produto) {
        this.produto = produto;
        
        String labelNomeProduto = "<html><body style='width: 70px; text-align: center'>"
                + produto.getNome()
                + "</body></html>";
        
        NomeProduto.setText(labelNomeProduto);
        
        PrecoProduto.setText(String.format("R$ %.2f", produto.getPreco()));
        
        // Carregando a imagem do produto
        try {
            // Carregando a imagem individual
            java.awt.Image imagemOriginal = javax.imageio.ImageIO.read(getClass().getResource(produto.getImagem()));
            
            // Definindo o tamanho da imagem
            int largura = 80;
            int altura = 80;
            
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
        BotaoVerProduto = new javax.swing.JButton();

        setBackground(new java.awt.Color(244, 162, 244));

        ImagemProduto.setPreferredSize(new java.awt.Dimension(80, 80));

        NomeProduto.setText("NomeProduto");

        PrecoProduto.setText("PrecoProduto");

        BotaoVerProduto.setBackground(new java.awt.Color(107, 246, 98));
        BotaoVerProduto.setText("Ver produto");
        BotaoVerProduto.addActionListener(this::BotaoVerProdutoActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PrecoProduto)
                    .addComponent(NomeProduto)
                    .addComponent(BotaoVerProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ImagemProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ImagemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NomeProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PrecoProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoVerProduto)
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoVerProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVerProdutoActionPerformed
        TelaProdutoIndividual tela = new TelaProdutoIndividual(produto);
        
        tela.setVisible(true);
    }//GEN-LAST:event_BotaoVerProdutoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoVerProduto;
    private javax.swing.JLabel ImagemProduto;
    private javax.swing.JLabel NomeProduto;
    private javax.swing.JLabel PrecoProduto;
    // End of variables declaration//GEN-END:variables
}
