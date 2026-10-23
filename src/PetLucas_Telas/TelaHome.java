package PetLucas_Telas;

import Components.CardProduto;
import java.awt.Font;
import java.io.InputStream;

public class TelaHome extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaHome.class.getName());

    public TelaHome() {
        initComponents();
        carregarProdutos();
        
        try {
            // Aplicando a fonte principal
            java.io.InputStream isPrimaryFont = getClass().getResourceAsStream("/Assets/Fonts/CrimsonText-Regular.ttf");
            java.awt.Font primaryFont = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, isPrimaryFont);  
            
            java.awt.Font titleFont = primaryFont.deriveFont(java.awt.Font.PLAIN, 16f);
               
            HomeLabel.setFont(titleFont);
            ProdutosLabel.setFont(titleFont);
            CarrinhoLabel.setFont(titleFont);
            TextoBoasVindas.setFont(titleFont);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Carregando os produtos a partir do card criado
    private void carregarProdutos() {
        String nomes[] = {
            "Ração para cachorro golden special carne",
            "Ração para cachorro golden special carne",
            "Ração para cachorro golden special carne",
            "Ração para cachorro golden special carne",
            "Ração para cachorro golden special carne",
            "Ração para cachorro golden special carne",
        };
        
        float precos[] = {
            199.99f,
            199.99f,
            199.99f,
            199.99f,
            199.99f,
            199.99f,
        };
        
        String imagens[] = {
            "/Assets/Images/RaçãoGolden.png",
            "/Assets/Images/RaçãoGolden.png",
            "/Assets/Images/RaçãoGolden.png",
            "/Assets/Images/RaçãoGolden.png",
            "/Assets/Images/RaçãoGolden.png",
            "/Assets/Images/RaçãoGolden.png",
        };
        
        // Laço que cria cada card com o produto
        for (int i = 0; i < nomes.length; i++) {
            CardProduto card = new CardProduto();
            
            card.setDadosProduto(nomes[i], precos[i], imagens[i]);
            
            PainelProdutos.add(card);
            
            PainelProdutos.revalidate();
            PainelProdutos.repaint();
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
        TextoBoasVindas = new javax.swing.JLabel();
        PainelProdutos = new javax.swing.JPanel();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        TextoBoasVindas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TextoBoasVindas.setText("PetLucas, o melhor site para seu animal de estimação!");

        PainelProdutos.setPreferredSize(new java.awt.Dimension(525, 170));
        PainelProdutos.setLayout(new java.awt.GridLayout(0, 3, 20, 15));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(PainelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(TextoBoasVindas)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextoBoasVindas)
                .addGap(18, 18, 18)
                .addComponent(PainelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaHome().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cabecalho;
    private javax.swing.JLabel CarrinhoLabel;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JLabel LogoMarca;
    private javax.swing.JPanel PainelProdutos;
    private javax.swing.JLabel ProdutosLabel;
    private javax.swing.JLabel TextoBoasVindas;
    // End of variables declaration//GEN-END:variables
}
