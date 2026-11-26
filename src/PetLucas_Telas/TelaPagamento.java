package PetLucas_Telas;

import javax.swing.*;
import java.awt.*;
import java.net.URI;

public class TelaPagamento extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaPagamento.class.getName());

    public TelaPagamento() {
        initComponents();
        adicionarLinksCabecalho();
        pagarComCartao();
        
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
            TextoFormaPagamento.setFont(titleFont);
            
            TextoNomeCartao.setFont(textFont);
            CampoNomeCartao.setFont(textFont);
            TextoNumeroCartao.setFont(textFont);
            CampoNumeroCartao.setFont(textFont);
            TextoCVV.setFont(textFont);
            CampoCVV.setFont(textFont);
            TextoDataVencimento.setFont(textFont);
            CampoDataVencimento.setFont(textFont);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
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
    
    // Método que deixa as informações do cartão invisíveis e só faz elas aparecerem, caso o usuário clique no ícone do cartão
    private void pagarComCartao() {
        // Deixando as informações ocultas, caso o usuário não clique nos ícones do cartão
        TextoNomeCartao.setVisible(false);
        CampoNomeCartao.setVisible(false);
        TextoNumeroCartao.setVisible(false);
        CampoNumeroCartao.setVisible(false);
        TextoCVV.setVisible(false);
        CampoCVV.setVisible(false);
        TextoDataVencimento.setVisible(false);
        CampoDataVencimento.setVisible(false);
        
        // Adicionando a chamada do botão para aparecer os itens ao clicar no cartão
        CartaoCredito.addActionListener(e -> {
            TextoNomeCartao.setVisible(true);
            CampoNomeCartao.setVisible(true);
            TextoNumeroCartao.setVisible(true);
            CampoNumeroCartao.setVisible(true);
            TextoCVV.setVisible(true);
            CampoCVV.setVisible(true);
            TextoDataVencimento.setVisible(true);
            CampoDataVencimento.setVisible(true);
        });
        
        CartaoDebito.addActionListener(e -> {
            TextoNomeCartao.setVisible(true);
            CampoNomeCartao.setVisible(true);
            TextoNumeroCartao.setVisible(true);
            CampoNumeroCartao.setVisible(true);
            TextoCVV.setVisible(true);
            CampoCVV.setVisible(true);
            TextoDataVencimento.setVisible(true);
            CampoDataVencimento.setVisible(true);
        });
    }
    
    // Método com a lógica para abrir o link, caso o usuário decida pagar com boleto
    private void pagarComBoleto(String url) {
        try {
            // Verificando se o ambiente suporta a classe Desktop e a ação de navegar
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                URI uri = new URI(url);
                Desktop.getDesktop().browse(uri);
            }
            else {
                JOptionPane.showMessageDialog(null, 
                    "Ops, seu navegador não tem suporte para esse tipo de link.",
                    "Erro",
                    JOptionPane.WARNING_MESSAGE
                );
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                "Erro ao abrir o link: " + e.getMessage(),
                "Erro",
                JOptionPane.WARNING_MESSAGE
            );
        }
    }
    
    // Método com a lógica para abrir o link, caso o usuário decida pagar com pix
    private void pagarComPix(String url) {
        try {
            // Verificando se o ambiente suporta a classe Desktop e a ação de navegar
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                URI uri = new URI(url);
                Desktop.getDesktop().browse(uri);
            }
            else {
                JOptionPane.showMessageDialog(null, 
                    "Ops, seu navegador não tem suporte para esse tipo de link.",
                    "Erro",
                    JOptionPane.WARNING_MESSAGE
                );
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                "Erro ao abrir o link: " + e.getMessage(),
                "Erro",
                JOptionPane.WARNING_MESSAGE
            );
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
        Pagamento = new javax.swing.JPanel();
        TextoFormaPagamento = new javax.swing.JLabel();
        CartaoCredito = new javax.swing.JButton();
        CartaoDebito = new javax.swing.JButton();
        Boleto = new javax.swing.JButton();
        Pix = new javax.swing.JButton();
        TextoNumeroCartao = new javax.swing.JLabel();
        CampoNumeroCartao = new javax.swing.JTextField();
        TextoNomeCartao = new javax.swing.JLabel();
        CampoNomeCartao = new javax.swing.JTextField();
        TextoCVV = new javax.swing.JLabel();
        CampoCVV = new javax.swing.JTextField();
        TextoDataVencimento = new javax.swing.JLabel();
        CampoDataVencimento = new javax.swing.JTextField();
        BotaoPagar = new javax.swing.JToggleButton();
        Rodape = new javax.swing.JPanel();
        TextoRodape = new javax.swing.JLabel();

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
                .addGap(26, 26, 26)
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

        Pagamento.setBackground(new java.awt.Color(244, 162, 244));

        TextoFormaPagamento.setText("Escolha sua forma de pagamento");

        CartaoCredito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Images/CartãoCrédito.png"))); // NOI18N
        CartaoCredito.setBorder(null);
        CartaoCredito.setBorderPainted(false);
        CartaoCredito.setContentAreaFilled(false);
        CartaoCredito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        CartaoDebito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Images/CartãoDébito.png"))); // NOI18N
        CartaoDebito.setBorder(null);
        CartaoDebito.setBorderPainted(false);
        CartaoDebito.setContentAreaFilled(false);
        CartaoDebito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Boleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Images/Boleto.png"))); // NOI18N
        Boleto.setBorder(null);
        Boleto.setBorderPainted(false);
        Boleto.setContentAreaFilled(false);
        Boleto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boleto.addActionListener(this::BoletoActionPerformed);

        Pix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Images/Pix.png"))); // NOI18N
        Pix.setBorder(null);
        Pix.setBorderPainted(false);
        Pix.setContentAreaFilled(false);
        Pix.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pix.addActionListener(this::PixActionPerformed);

        TextoNumeroCartao.setText("Número do Cartão:");

        CampoNumeroCartao.setToolTipText("");

        TextoNomeCartao.setText("Nome no Cartão:");

        TextoCVV.setText("CVV");

        TextoDataVencimento.setText("Data de Vencimento");

        BotaoPagar.setBackground(new java.awt.Color(107, 246, 98));
        BotaoPagar.setText("Pagar");
        BotaoPagar.addActionListener(this::BotaoPagarActionPerformed);

        javax.swing.GroupLayout PagamentoLayout = new javax.swing.GroupLayout(Pagamento);
        Pagamento.setLayout(PagamentoLayout);
        PagamentoLayout.setHorizontalGroup(
            PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PagamentoLayout.createSequentialGroup()
                .addGroup(PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PagamentoLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextoNomeCartao)
                                        .addComponent(TextoNumeroCartao)
                                        .addComponent(CampoNumeroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TextoDataVencimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CampoDataVencimento))))
                            .addGroup(PagamentoLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(TextoFormaPagamento)))
                        .addGroup(PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoCVV)
                            .addComponent(CampoNomeCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoCVV, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PagamentoLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(BotaoPagar))
                    .addGroup(PagamentoLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(CartaoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CartaoDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Boleto)
                        .addGap(18, 18, 18)
                        .addComponent(Pix)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        PagamentoLayout.setVerticalGroup(
            PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PagamentoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(TextoFormaPagamento)
                .addGap(18, 18, 18)
                .addGroup(PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Boleto)
                    .addComponent(Pix)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CartaoCredito)
                        .addComponent(CartaoDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(TextoNumeroCartao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoNumeroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoNomeCartao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoNomeCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoCVV)
                    .addComponent(TextoDataVencimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoCVV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoPagar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Rodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(Rodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Método com a lógica para exibir um modal, informando ao usuário que o pagamento foi realizado
    private void BotaoPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPagarActionPerformed
        JOptionPane.showMessageDialog(this,
            "Pagamento realizado com sucesso! Muito obrigado por comprar na PetLucas!!",
            "Finalizado",
            JOptionPane.INFORMATION_MESSAGE
        );
        
        // Voltando para a tela home, após o modal
        TelaHome telaHome = new TelaHome();
        telaHome.setVisible(true);
    }//GEN-LAST:event_BotaoPagarActionPerformed

    // Método de pagar com boleto
    private void BoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoletoActionPerformed
        pagarComBoleto("https://www.paypal.com/br/home");
    }//GEN-LAST:event_BoletoActionPerformed

    // Método de pagar com pix
    private void PixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PixActionPerformed
        pagarComPix("https://banco.bradesco/html/classic/index.shtm");
    }//GEN-LAST:event_PixActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaPagamento().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boleto;
    private javax.swing.JToggleButton BotaoPagar;
    private javax.swing.JPanel Cabecalho;
    private javax.swing.JTextField CampoCVV;
    private javax.swing.JTextField CampoDataVencimento;
    private javax.swing.JTextField CampoNomeCartao;
    private javax.swing.JTextField CampoNumeroCartao;
    private javax.swing.JLabel CarrinhoLabel;
    private javax.swing.JButton CartaoCredito;
    private javax.swing.JButton CartaoDebito;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JLabel LogoMarca;
    private javax.swing.JPanel Pagamento;
    private javax.swing.JButton Pix;
    private javax.swing.JLabel ProdutosLabel;
    private javax.swing.JPanel Rodape;
    private javax.swing.JLabel TextoCVV;
    private javax.swing.JLabel TextoDataVencimento;
    private javax.swing.JLabel TextoFormaPagamento;
    private javax.swing.JLabel TextoNomeCartao;
    private javax.swing.JLabel TextoNumeroCartao;
    private javax.swing.JLabel TextoRodape;
    // End of variables declaration//GEN-END:variables
}
