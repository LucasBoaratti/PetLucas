package PetLucas_Telas;

import java.awt.Font;
import java.io.InputStream;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaLogin.class.getName());

    public TelaLogin() {
        initComponents();   
        
        try {
            // Aplicando a fonte principal
            java.io.InputStream isPrimaryFont = getClass().getResourceAsStream("/Assets/Fonts/CrimsonText-Regular.ttf");
            java.awt.Font primaryFont = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, isPrimaryFont);  
            
            java.awt.Font titleFont = primaryFont.deriveFont(java.awt.Font.PLAIN, 20f);
            
            TextoBoasVindas.setFont(titleFont);
            
            // Aplicando a fonte secundaria
            java.io.InputStream isSecondFont = getClass().getResourceAsStream("/Assets/Fonts/source-serif-pro.regular.ttf");
            java.awt.Font secondaryFont = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, isSecondFont);
            
            java.awt.Font textFont = secondaryFont.deriveFont(java.awt.Font.PLAIN, 14f);
            
            NomeLabel.setFont(textFont);
            SenhaLabel.setFont(textFont);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FundoTela = new java.awt.Panel();
        FundoLogin = new javax.swing.JPanel();
        TextoBoasVindas = new java.awt.Label();
        NomeLabel = new java.awt.Label();
        NomeInput = new java.awt.TextField();
        SenhaLabel = new java.awt.Label();
        SenhaInput = new javax.swing.JPasswordField();
        BotaoEntrar = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        FundoTela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        FundoLogin.setBackground(new java.awt.Color(244, 162, 244));
        FundoLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FundoLogin.setPreferredSize(new java.awt.Dimension(370, 200));

        TextoBoasVindas.setAlignment(java.awt.Label.CENTER);
        TextoBoasVindas.setText("Seja bem-vindo(a) à PetLucas");

        NomeLabel.setText("Nome:");

        NomeInput.setForeground(new java.awt.Color(0, 0, 0));
        NomeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeInputActionPerformed(evt);
            }
        });

        SenhaLabel.setText("Senha:");

        SenhaInput.setToolTipText("");
        SenhaInput.setActionCommand("<Not Set>");
        SenhaInput.setName("SenhaInput"); // NOI18N
        SenhaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaInputActionPerformed(evt);
            }
        });

        BotaoEntrar.setBackground(new java.awt.Color(107, 246, 98));
        BotaoEntrar.setLabel("Entrar");
        BotaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FundoLoginLayout = new javax.swing.GroupLayout(FundoLogin);
        FundoLogin.setLayout(FundoLoginLayout);
        FundoLoginLayout.setHorizontalGroup(
            FundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoLoginLayout.createSequentialGroup()
                .addGroup(FundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoBoasVindas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FundoLoginLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(FundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SenhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomeInput, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(SenhaInput))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(FundoLoginLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(BotaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        FundoLoginLayout.setVerticalGroup(
            FundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextoBoasVindas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(NomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(NomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(SenhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(SenhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(BotaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout FundoTelaLayout = new javax.swing.GroupLayout(FundoTela);
        FundoTela.setLayout(FundoTelaLayout);
        FundoTelaLayout.setHorizontalGroup(
            FundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoTelaLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(FundoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        FundoTelaLayout.setVerticalGroup(
            FundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoTelaLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(FundoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FundoTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FundoTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeInputActionPerformed

    private void SenhaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaInputActionPerformed

    private void BotaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarActionPerformed
        String nome = NomeInput.getText().trim();
        String senha = new String(SenhaInput.getPassword()); // Convertendo a senha para string
        
        TelaHome home = new TelaHome();
        
        if (nome.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, // Criando um popup de aviso
                "Os campos de nome e senha não podem ser vazios",
                "Aviso",
                JOptionPane.WARNING_MESSAGE
            );
        }
        
        if (nome.equals("Lucas") && senha.equals("12345")) {
            JOptionPane.showMessageDialog(this,
                "Seja bem vindo à PetLucas!",
                "Sucesso",
                JOptionPane.INFORMATION_MESSAGE
            );
            
            home.setVisible(true);
            
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(this, 
                "Usuário ou senha incorretos. Tente novamente",
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
            
            NomeInput.setText("");
            SenhaInput.setText("");
        }
    }//GEN-LAST:event_BotaoEntrarActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TelaLogin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BotaoEntrar;
    private javax.swing.JPanel FundoLogin;
    private java.awt.Panel FundoTela;
    private java.awt.TextField NomeInput;
    private java.awt.Label NomeLabel;
    private javax.swing.JPasswordField SenhaInput;
    private java.awt.Label SenhaLabel;
    private java.awt.Label TextoBoasVindas;
    // End of variables declaration//GEN-END:variables
}
