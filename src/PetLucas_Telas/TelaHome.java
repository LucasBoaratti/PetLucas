package PetLucas_Telas;

import Components.CardProduto;
import Components.CardProdutosRecomendados;
import petlucas.Produto;
import java.util.ArrayList;
import java.awt.Font;
import java.io.InputStream;

public class TelaHome extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaHome.class.getName());
    
    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<Produto> produtosRecomendados = new ArrayList<>();

    public TelaHome() {
        initComponents();
        carregarProdutos();
        carregarProdutosRecomendados();
        
        try {
            // Aplicando a fonte principal
            java.io.InputStream isPrimaryFont = getClass().getResourceAsStream("/Assets/Fonts/CrimsonText-Regular.ttf");
            java.awt.Font primaryFont = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, isPrimaryFont);  
            
            java.awt.Font titleFont = primaryFont.deriveFont(java.awt.Font.PLAIN, 16f);
               
            HomeLabel.setFont(titleFont);
            ProdutosLabel.setFont(titleFont);
            CarrinhoLabel.setFont(titleFont);
            TextoBoasVindas.setFont(titleFont);
            TextoRecomendado.setFont(titleFont);
            TextoRodape.setFont(titleFont);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Carregando os produtos a partir do card criado
    private void carregarProdutos() {
        // Exibindo os produtos com arraylist
        produtos.add(new Produto(
            "Ração para cachorros golden special carne",
            "Ração Golden Special sabor carne para cachorros.",
            199.99f,
            "/Assets/Images/RaçãoGolden.png",
            "Ração"
        ));
        
        produtos.add(new Produto(
            "Ração para gatos golden special carne e frango",
            "Ração Golden Special sabor carne e frango para gatos.",
            59.99f,
            "/Assets/Images/RaçãoGoldenGatos.png",
            "Ração"
        ));
        
        produtos.add(new Produto(
            "Arranhador para gatos macio e duroo",
            "Arranhador confortável para gatos.",
            49.99f,
            "/Assets/Images/ArranhadorGato.png",
            "Brinquedos"
        ));
            
        produtos.add(new Produto(
            "Túnel com 4 saídas de brinquedo para gatos divertidos",
            "Túnel divertido com quatro saídas para gatos.",
            99.99f,
            "/Assets/Images/TunelGato.png",
            "Brinquedos"
        ));
        
        produtos.add(new Produto(
            "Bolinha colorida de brinquedo para cachorros",
            "Bolinha colorida para diversão dos cachorros.",
            15.99f,
            "/Assets/Images/BolinhaParaCachorro.png",
            "Brinquedos"
        ));
        
        produtos.add(new Produto(
            "Bolinha vazia para colocar comida para cachorros",
            "Bolinha interativa para colocar comida.",
            69.99f,
            "/Assets/Images/BolinhaComRação.png",
            "Brinquedos"
        ));
        
        // Laço que cria cada card com o produto
        for (Produto produto : produtos) {
            CardProduto card = new CardProduto();
            
            card.setDadosProduto(produto);
            
            PainelProdutos.add(card);
        }
        
        PainelProdutos.revalidate();
        PainelProdutos.repaint();
    }
    
    private void carregarProdutosRecomendados() {
        produtosRecomendados.add(new Produto(
            "Ração para papagaios bico fino sabor frutas",
            "Ração para papagaios da marca bico fino sabor frutas e estrusado.",
            79.99f,
            "/Assets/Images/RaçãoNutrópicaPapagaio.png",
            "Ração"
        ));
        
        produtosRecomendados.add(new Produto(
            "Mordedor para cachorro, colorido",
            "Mordedor para cachorro colorido.",
            14.99f,
            "/Assets/Images/MordedorCachorro.png",
            "Brinquedo"
        ));
        
        produtosRecomendados.add(new Produto(
            "Vermífugo para gatos com vermes",
            "Vermífugo para gatos com vermes.",
            40.99f,
            "/Assets/Images/VermífugoParaGato.png",
            "Remédio"
        ));
        
        produtosRecomendados.add(new Produto(
            "Vermífugo para cachorros com vermes",
            "Vermífugo para cachorros com vermes.",
            19.99f,
            "/Assets/Images/VermífugoParaCachorro.png",
            "Remédio"
        ));
        
        produtosRecomendados.add(new Produto(
            "Cama para cachorros cor azul",
            "Cama para cachorros dormirem na cor azul.",
            489.99f,
            "/Assets/Images/CamaParaCachorro.png",
            "Cama"
        ));
        
        produtosRecomendados.add(new Produto(
            "Cama para gatos cor rosa",
            "Cama para gatos dormirem na cor rosa.",
            339.99f,
            "/Assets/Images/CamaParaGato.png",
            "Cama"
        ));
        
        produtosRecomendados.add(new Produto(
            "Ração para cachorros champ sabor carne e cereal",
            "Ração para cachorros champ sabor carne e cereal.",
            59.99f,
            "/Assets/Images/RaçãoParaCachorroChamp.png",
            "Ração"
        ));
        
        produtosRecomendados.add(new Produto(
            "Sachê para gatos whiskas sabor carne",
            "Sachê para gatos whiskas sabor carne",
            3.99f,
            "/Assets/Images/SachêParaGatos.png",
            "Ração"
        ));

        // Laço que cria cada card com o produto
        for (Produto produto : produtosRecomendados) {
            CardProdutosRecomendados card = new CardProdutosRecomendados();
            
            card.setDadosProduto(produto);
            
            PainelProdutosRecomendados.add(card);
        }
        
        PainelProdutosRecomendados.revalidate();
        PainelProdutosRecomendados.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Overflow = new javax.swing.JScrollPane();
        PaginaHome = new javax.swing.JPanel();
        Cabecalho = new javax.swing.JPanel();
        LogoMarca = new javax.swing.JLabel();
        HomeLabel = new javax.swing.JLabel();
        ProdutosLabel = new javax.swing.JLabel();
        CarrinhoLabel = new javax.swing.JLabel();
        TextoBoasVindas = new javax.swing.JLabel();
        PainelProdutos = new javax.swing.JPanel();
        TextoRecomendado = new javax.swing.JLabel();
        PainelProdutosRecomendados = new javax.swing.JPanel();
        Rodape = new javax.swing.JPanel();
        TextoRodape = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Overflow.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

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

        TextoRecomendado.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TextoRecomendado.setText("Recomendado para seu bichano");

        PainelProdutosRecomendados.setPreferredSize(new java.awt.Dimension(600, 400));
        PainelProdutosRecomendados.setLayout(new java.awt.GridLayout(0, 4, 28, 28));

        Rodape.setBackground(new java.awt.Color(244, 162, 244));

        TextoRodape.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TextoRodape.setText("PetLucas, 2026");

        javax.swing.GroupLayout RodapeLayout = new javax.swing.GroupLayout(Rodape);
        Rodape.setLayout(RodapeLayout);
        RodapeLayout.setHorizontalGroup(
            RodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RodapeLayout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(TextoRodape)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RodapeLayout.setVerticalGroup(
            RodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextoRodape, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PaginaHomeLayout = new javax.swing.GroupLayout(PaginaHome);
        PaginaHome.setLayout(PaginaHomeLayout);
        PaginaHomeLayout.setHorizontalGroup(
            PaginaHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaginaHomeLayout.createSequentialGroup()
                .addGroup(PaginaHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaginaHomeLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(PainelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PaginaHomeLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(PainelProdutosRecomendados, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PaginaHomeLayout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(TextoRecomendado)))
                .addGap(69, 70, Short.MAX_VALUE))
            .addGroup(PaginaHomeLayout.createSequentialGroup()
                .addGroup(PaginaHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rodape, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(PaginaHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PaginaHomeLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextoBoasVindas)
                    .addGap(174, 174, 174)))
        );
        PaginaHomeLayout.setVerticalGroup(
            PaginaHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaginaHomeLayout.createSequentialGroup()
                .addComponent(Cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(PainelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextoRecomendado)
                .addGap(19, 19, 19)
                .addComponent(PainelProdutosRecomendados, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Rodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(PaginaHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PaginaHomeLayout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(TextoBoasVindas)
                    .addContainerGap(1044, Short.MAX_VALUE)))
        );

        Overflow.setViewportView(PaginaHome);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Overflow, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Overflow, javax.swing.GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE)
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
    private javax.swing.JScrollPane Overflow;
    private javax.swing.JPanel PaginaHome;
    private javax.swing.JPanel PainelProdutos;
    private javax.swing.JPanel PainelProdutosRecomendados;
    private javax.swing.JLabel ProdutosLabel;
    private javax.swing.JPanel Rodape;
    private javax.swing.JLabel TextoBoasVindas;
    private javax.swing.JLabel TextoRecomendado;
    private javax.swing.JLabel TextoRodape;
    // End of variables declaration//GEN-END:variables
}
