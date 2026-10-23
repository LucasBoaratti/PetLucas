package Components;

public class CardProduto extends javax.swing.JPanel {

    public CardProduto() {
        initComponents();
        
        // Aplicando a fonte nos cards
        try {
            java.io.InputStream isPrimaryFont = getClass().getResourceAsStream("/Assets/Fonts/source-serif-pro.regular.ttf");
            java.awt.Font primaryFont = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, isPrimaryFont);  
            
            java.awt.Font font = primaryFont.deriveFont(java.awt.Font.PLAIN, 10f);
            java.awt.Font buttonFont = primaryFont.deriveFont(java.awt.Font.PLAIN, 8f);
            
            NomeProduto.setFont(font);
            PrecoProduto.setFont(font);
            BotaoVerProduto.setFont(buttonFont);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Método que adiciona o produto nos cards
    public void setDadosProduto(String nome, float preco, String pathImagem) {
        // Aplicando o nome do produto com tag HTML para quebrar linha
        String labelNomeProduto = "<html><body style='width: 70px; text-align: left'>"
                + nome
                + "</body></html>";
        
        NomeProduto.setText(labelNomeProduto);
        
        PrecoProduto.setText(String.format("R$ %.2f", preco));
        
        // Carregando a imagem do produto
        try {
            ImagemProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource(pathImagem)));
        }
        catch (Exception e) {
            System.out.println("Erro ao carregar imagem: " + pathImagem);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NomeProduto = new javax.swing.JLabel();
        PrecoProduto = new javax.swing.JLabel();
        ImagemProduto = new javax.swing.JLabel();
        BotaoVerProduto = new java.awt.Button();

        setBackground(new java.awt.Color(244, 162, 244));

        NomeProduto.setText("NomeProduto");

        PrecoProduto.setText("PrecoProduto");

        BotaoVerProduto.setBackground(new java.awt.Color(107, 246, 98));
        BotaoVerProduto.setLabel("Ver produto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecoProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(ImagemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoVerProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(NomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PrecoProduto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(ImagemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(BotaoVerProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BotaoVerProduto;
    private javax.swing.JLabel ImagemProduto;
    private javax.swing.JLabel NomeProduto;
    private javax.swing.JLabel PrecoProduto;
    // End of variables declaration//GEN-END:variables
}
