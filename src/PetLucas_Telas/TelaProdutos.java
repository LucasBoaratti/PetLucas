package PetLucas_Telas;

import Components.CardProduto;
import java.util.ArrayList;
import petlucas.Produto;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.io.InputStream;

public class TelaProdutos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaProdutos.class.getName());
    
    private ArrayList<Produto> produtos = new ArrayList<>();

    public TelaProdutos() {
        initComponents();
        adicionarLinksCabecalho();
        carregarTodosProdutos();
        adicionarEventosFiltros();
        
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
        
        CarrinhoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelaCarrinho telaCarrinho = new TelaCarrinho();
                telaCarrinho.setVisible(true);
                
                dispose();
            }
        });
        
        // Mudando o cursor do mouse
        CarrinhoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
    
    // Carregando os produtos a partir do card criado
    private void carregarTodosProdutos() {
        Produtos.setPreferredSize(null);
        
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
            "Brinquedo"
        ));
            
        produtos.add(new Produto(
            "Túnel com 4 saídas de brinquedo para gatos divertidos",
            "Túnel divertido com quatro saídas para gatos.",
            99.99f,
            "/Assets/Images/TunelGato.png",
            "Brinquedo"
        ));
        
        produtos.add(new Produto(
            "Bolinha colorida de brinquedo para cachorros",
            "Bolinha colorida para diversão dos cachorros.",
            15.99f,
            "/Assets/Images/BolinhaParaCachorro.png",
            "Brinquedo"
        ));
        
        produtos.add(new Produto(
            "Bolinha vazia para colocar comida para cachorros",
            "Bolinha interativa para colocar comida.",
            69.99f,
            "/Assets/Images/BolinhaComRação.png",
            "Brinquedo"
        ));
        
        produtos.add(new Produto(
            "Vermífugo para pássaros conta-gotas",
            "Vermífugo para você cuidar do seu pássaro, caso ele esteja com vermes.",
            12.99f,
            "/Assets/Images/VermífugoParaPássaros.png",
            "Remédio"
        ));
        
        produtos.add(new Produto(
            "Ração para papagaios bico fino sabor frutas",
            "Ração para papagaios da marca bico fino sabor frutas e estrusado.",
            79.99f,
            "/Assets/Images/RaçãoNutrópicaPapagaio.png",
            "Ração"
        ));
        
        produtos.add(new Produto(
            "Mordedor para cachorro, colorido",
            "Mordedor para cachorro colorido.",
            14.99f,
            "/Assets/Images/MordedorCachorro.png",
            "Brinquedo"
        ));
        
        produtos.add(new Produto(
            "Vermífugo para gatos com vermes",
            "Vermífugo para gatos com vermes.",
            40.99f,
            "/Assets/Images/VermífugoParaGato.png",
            "Remédio"
        ));
        
        produtos.add(new Produto(
            "Vermífugo para cachorros com vermes",
            "Vermífugo para cachorros com vermes.",
            19.99f,
            "/Assets/Images/VermífugoParaCachorro.png",
            "Remédio"
        ));
        
        produtos.add(new Produto(
            "Cama para cachorros cor azul",
            "Cama para cachorros dormirem na cor azul.",
            489.99f,
            "/Assets/Images/CamaParaCachorro.png",
            "Cama"
        ));
        
        produtos.add(new Produto(
            "Cama para gatos cor rosa",
            "Cama para gatos dormirem na cor rosa.",
            339.99f,
            "/Assets/Images/CamaParaGato.png",
            "Cama"
        ));
        
        produtos.add(new Produto(
            "Ração para cachorros champ sabor carne e cereal",
            "Ração para cachorros champ sabor carne e cereal.",
            59.99f,
            "/Assets/Images/RaçãoParaCachorroChamp.png",
            "Ração"
        ));
        
        produtos.add(new Produto(
            "Sachê para gatos whiskas sabor carne",
            "Sachê para gatos whiskas sabor carne",
            3.99f,
            "/Assets/Images/SachêParaGatos.png",
            "Ração"
        ));
        
        produtos.add(new Produto(
            "Vermífugo para cachorros Chemital com 4 comprimidos",
            "Vermífugo para cachorros da marca Chemital que possui 4 comprimidos.",
            5.99f,
            "/Assets/Images/VermífugoParaCães.png",
            "Remédio"
        ));
        
        produtos.add(new Produto(
            "Cama para cachorros grande macia",
            "Cama para cachorros de porte grande, feita com tecido de almofada.",
            219.99f,
            "/Assets/Images/CamaParaCachorrosGrandes.png",
            "Cama"
        ));
        
        produtos.add(new Produto(
            "Cama para gatos grande formato toca",
            "Cama para gatos de porte grande no formato de toca, na cor cinza.",
            139.99f,
            "/Assets/Images/CamaParaGatosGrandes.png",
            "Cama"
        ));
        
        // Método que filtra e cria os cards para os produtos
        filtrarProduto();
        
        Produtos.revalidate();
        Produtos.repaint();
        OverflowProdutos.revalidate();
        OverflowProdutos.repaint();
    }
    
    // Método de filtros
    private void filtrarProduto() {
        // Removendo os produtos que estão no painél
        Produtos.removeAll();
        
        // Verificando se um filtro já foi selecionado
        boolean filtroSelecionado = FiltroRacao.isSelected() || FiltroBrinquedo.isSelected() || FiltroRemedio.isSelected() || FiltroCama.isSelected();
        
        for (Produto produto :  produtos) {
            boolean selecionado = false;
            
            // Verifica se o filtro total está selecionado
            if (FiltroTodos.isSelected() || !filtroSelecionado) {
                selecionado = true;
            }
            else {
                // Verifica se cada filtro foi selecionado
                if (FiltroRacao.isSelected() && produto.getTipo().equalsIgnoreCase("Ração")) {
                    selecionado = true;
                }
                
                if (FiltroBrinquedo.isSelected() && produto.getTipo().equalsIgnoreCase("Brinquedo")) {
                    selecionado = true;
                }
                
                if (FiltroRemedio.isSelected() && produto.getTipo().equalsIgnoreCase("Remédio")) {
                    selecionado = true;
                }
                
                if (FiltroCama.isSelected() && produto.getTipo().equalsIgnoreCase("Cama")) {
                    selecionado = true;
                }
            }
            
            // Se o filtro foi selecionado, o card é criado
            if (selecionado) {
                CardProduto card = new CardProduto();
                
                card.setDadosProduto(produto);
                
                Produtos.add(card);
            }
        }
        
        Produtos.revalidate();
        Produtos.repaint();
    }
    
    // Método para adicionar os eventos nos checkbox
    private void adicionarEventosFiltros() {
        // Evento para o filtro "todos"
        FiltroTodos.addActionListener(e -> {
            // Se o filtro todos tiver selecionado, todos os outros filtros serão desmarcados
            if (FiltroTodos.isSelected()) {
                FiltroRacao.setSelected(false);
                FiltroBrinquedo.setSelected(false);
                FiltroRemedio.setSelected(false);
                FiltroCama.setSelected(false);
            }
            
            filtrarProduto();
        });
        
        // Evento para o filtro "Ração"
        FiltroRacao.addActionListener(e -> {
            FiltroTodos.setSelected(false);

            filtrarProduto();
        });
        
        // Evento para o filtro "Brinquedo"
        FiltroBrinquedo.addActionListener(e -> {
            FiltroTodos.setSelected(false);

            filtrarProduto();
        });

        // Evento para o filtro "Remédio"
        FiltroRemedio.addActionListener(e -> {
            FiltroTodos.setSelected(false);

            filtrarProduto();
        });

        // Evento para o filtro "Cama"
        FiltroCama.addActionListener(e -> {
            FiltroTodos.setSelected(false);

            filtrarProduto();
        });
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
        OverflowProdutos = new javax.swing.JScrollPane();
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

        Produtos.setOpaque(false);
        Produtos.setPreferredSize(new java.awt.Dimension(600, 100));
        Produtos.setLayout(new java.awt.GridLayout(0, 3, 10, 15));
        OverflowProdutos.setViewportView(Produtos);
        Produtos.getAccessibleContext().setAccessibleDescription("");

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
            .addComponent(Rodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGap(17, 17, 17)
                        .addComponent(OverflowProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OverflowProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Rodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Overflow.setViewportView(PaginaProdutos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Overflow, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Overflow, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private javax.swing.JScrollPane OverflowProdutos;
    private javax.swing.JPanel PaginaProdutos;
    private javax.swing.JPanel Produtos;
    private javax.swing.JLabel ProdutosLabel;
    private javax.swing.JPanel Rodape;
    private javax.swing.JLabel TextoFiltros;
    private javax.swing.JLabel TextoProdutosLoja;
    private javax.swing.JLabel TextoRodape;
    // End of variables declaration//GEN-END:variables
}
