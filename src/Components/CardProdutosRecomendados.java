package Components;

public class CardProdutosRecomendados extends javax.swing.JPanel {
    
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
    public void setDadosProduto(String nomeProduto, float precoProduto, String pathImagemProduto) {
        String labelNomeProduto = "<html><body style='width: 70px; text-align: center'>"
                + nomeProduto
                + "</body></html>";
        
        NomeProduto.setText(labelNomeProduto);
        
        PrecoProduto.setText(String.format("R$ %.2f", precoProduto));
        
        // Carregando a imagem do produto
        try {
            ImagemProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource(pathImagemProduto)));
        }
        catch (Exception e) {
            System.out.println("Erro ao carregar imagem: " + pathImagemProduto);
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

        NomeProduto.setText("NomeProduto");

        PrecoProduto.setText("PrecoProduto");

        BotaoVerProduto.setBackground(new java.awt.Color(107, 246, 98));
        BotaoVerProduto.setText("Ver produto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PrecoProduto)
                        .addComponent(NomeProduto)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ImagemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BotaoVerProduto)
                        .addContainerGap(15, Short.MAX_VALUE))))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoVerProduto;
    private javax.swing.JLabel ImagemProduto;
    private javax.swing.JLabel NomeProduto;
    private javax.swing.JLabel PrecoProduto;
    // End of variables declaration//GEN-END:variables
}
