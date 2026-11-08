package PetLucas_Telas;

import Components.CardProduto;
import java.util.ArrayList;
import petlucas.Produto;
import java.awt.Font;
import java.io.InputStream;

public class TelaProdutos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaProdutos.class.getName());
    
    private ArrayList<Produto> produtos = new ArrayList<>();

    public TelaProdutos() {
        initComponents();
        adicionarLinksCabecalho();
        carregarTodosProdutos();
        
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
    
    // Carregando os produtos a partir do card criado
    private void carregarTodosProdutos() {
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
            "Arranhador para gatos macio e duro",
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
            
            Produtos.add(card);
        }
        
        Produtos.revalidate();
        Produtos.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Overflow = new javax.swing.JScrollPane();
        PaginaProdutos = new javax.swing.JPanel();
        Cabecalho = new javax.swing.JPanel();
        LogoMarca = new javax.swing.JLabel();
        HomeLabel = new javax.swing.JLabel();
        ProdutosLabel = new javax.swing.JLabel();
        CarrinhoLabel = new javax.swing.JLabel();
        TextoProdutosLoja = new javax.swing.JLabel();
        FiltroTodos = new javax.swing.JCheckBox();
        TextoFiltros = new javax.swing.JLabel();
        FiltroRacao = new javax.swing.JCheckBox();
        FiltroBrinquedo = new javax.swing.JCheckBox();
        FiltroRemedio = new javax.swing.JCheckBox();
        FiltroCama = new javax.swing.JCheckBox();
        Produtos = new javax.swing.JPanel();
        Rodape = new javax.swing.JPanel();
        TextoRodape = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Overflow.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        PaginaProdutos.setPreferredSize(new java.awt.Dimension(650, 424));

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

        TextoProdutosLoja.setText("Confira todos os produtos da loja aqui");

        FiltroTodos.setText("Todos");
        FiltroTodos.addActionListener(this::FiltroTodosActionPerformed);

        TextoFiltros.setText("Filtros:");

        FiltroRacao.setText("Rações");

        FiltroBrinquedo.setText("Brinquedos");

        FiltroRemedio.setText("Remédios");

        FiltroCama.setText("Camas");

        Produtos.setPreferredSize(new java.awt.Dimension(601, 300));
        Produtos.setLayout(new java.awt.GridLayout(0, 3, 20, 15));

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

        javax.swing.GroupLayout PaginaProdutosLayout = new javax.swing.GroupLayout(PaginaProdutos);
        PaginaProdutos.setLayout(PaginaProdutosLayout);
        PaginaProdutosLayout.setHorizontalGroup(
            PaginaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PaginaProdutosLayout.createSequentialGroup()
                .addGroup(PaginaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaginaProdutosLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(TextoProdutosLoja))
                    .addGroup(PaginaProdutosLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
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
                        .addComponent(FiltroCama))
                    .addGroup(PaginaProdutosLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Produtos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(Rodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PaginaProdutosLayout.setVerticalGroup(
            PaginaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaginaProdutosLayout.createSequentialGroup()
                .addComponent(Cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextoProdutosLoja)
                .addGap(21, 21, 21)
                .addGroup(PaginaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoFiltros)
                    .addComponent(FiltroTodos)
                    .addComponent(FiltroRacao)
                    .addComponent(FiltroBrinquedo)
                    .addComponent(FiltroRemedio)
                    .addComponent(FiltroCama))
                .addGap(18, 18, 18)
                .addComponent(Produtos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(Rodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Produtos.getAccessibleContext().setAccessibleDescription("");

        Overflow.setViewportView(PaginaProdutos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Overflow, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Overflow, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
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
    private javax.swing.JScrollPane Overflow;
    private javax.swing.JPanel PaginaProdutos;
    private javax.swing.JPanel Produtos;
    private javax.swing.JLabel ProdutosLabel;
    private javax.swing.JPanel Rodape;
    private javax.swing.JLabel TextoFiltros;
    private javax.swing.JLabel TextoProdutosLoja;
    private javax.swing.JLabel TextoRodape;
    // End of variables declaration//GEN-END:variables
}
