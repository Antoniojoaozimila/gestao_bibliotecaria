
package View;

import Modelagem.FicheiroDat;
import Modelagem.Manuais;
import java.util.ArrayList;

/**
 *
 * @author Antonio joao zimila
 */
public class MenuInicial extends javax.swing.JFrame {

    /**
     * Creates new form MenuInicial
     */

  FicheiroDat f =new FicheiroDat(); 
  ArrayList<Object> manuaisFicheiro = f.leitura("Manuais.dat");
    public MenuInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuOpcoes = new javax.swing.JMenu();
        itemCadastroManuais = new javax.swing.JMenuItem();
        itemVisualizarManuais = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        LevantamentoItem = new javax.swing.JMenuItem();
        devolucaoItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane2.setBackground(new java.awt.Color(0, 51, 153));

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 819, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        MenuOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-configurações-20.png"))); // NOI18N
        MenuOpcoes.setText("Opções");
        MenuOpcoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuOpcoesMouseEntered(evt);
            }
        });

        itemCadastroManuais.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_MASK));
        itemCadastroManuais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-salvar-20.png"))); // NOI18N
        itemCadastroManuais.setText("Cadastro de Manuais");
        itemCadastroManuais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastroManuaisActionPerformed(evt);
            }
        });
        MenuOpcoes.add(itemCadastroManuais);

        itemVisualizarManuais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-invisível-20.png"))); // NOI18N
        itemVisualizarManuais.setText("Visualizar todos Manuais");
        itemVisualizarManuais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVisualizarManuaisActionPerformed(evt);
            }
        });
        MenuOpcoes.add(itemVisualizarManuais);

        jMenuBar1.add(MenuOpcoes);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-emprestar-o-livro-20.png"))); // NOI18N
        jMenu2.setText("Empretimos");

        LevantamentoItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-emprestar-o-livro-20_2.png"))); // NOI18N
        LevantamentoItem.setText("Levantamento");
        LevantamentoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevantamentoItemActionPerformed(evt);
            }
        });
        jMenu2.add(LevantamentoItem);

        devolucaoItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-emprestar-o-livro-20_1.png"))); // NOI18N
        devolucaoItem.setText("Devolucao");
        devolucaoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolucaoItemActionPerformed(evt);
            }
        });
        jMenu2.add(devolucaoItem);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-livro-razão-20.png"))); // NOI18N
        jMenu3.setText("Venda");
        jMenuBar1.add(jMenu3);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-abrir-pasta-20.png"))); // NOI18N
        jMenu1.setText("Relatorios");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemCadastroManuaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastroManuaisActionPerformed
     CadastroManuais c =  new CadastroManuais();
     c.setVisible(true);
     c.popular();//passando todos dados da base de dados para tabela apos clicar cadastrar manuais
       
    }//GEN-LAST:event_itemCadastroManuaisActionPerformed

    private void itemVisualizarManuaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVisualizarManuaisActionPerformed
       VisualizarManuais v = new VisualizarManuais();
       jDesktopPane2.add(v);
       v.setVisible(true);
       v.popular();
       /*
           for(Object item: manuaisFicheiro){
           String nome =(String) ((Manuais)item).getNome();
           String classe=(String) ((Manuais)item).getClasse();
           String editora=(String) ((Manuais)item).getEditora();
           String loc = (String)   ((Manuais)item).getLocalizacao();
           
             v.popular(nome,classe,editora,loc);
      }
       */
    }//GEN-LAST:event_itemVisualizarManuaisActionPerformed

    private void MenuOpcoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuOpcoesMouseEntered
        
   // MenuOpcoes.add(itemCadastroManuais);
    }//GEN-LAST:event_MenuOpcoesMouseEntered

    private void LevantamentoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevantamentoItemActionPerformed
        Emprestimo m = new Emprestimo();
       jDesktopPane2.add(m);
        m.setVisible(true);
    }//GEN-LAST:event_LevantamentoItemActionPerformed

    private void devolucaoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolucaoItemActionPerformed

        Devolucao d = new Devolucao();
        jDesktopPane2.add(d);
        d.setVisible(true);
    }//GEN-LAST:event_devolucaoItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem LevantamentoItem;
    private javax.swing.JMenu MenuOpcoes;
    private javax.swing.JMenuItem devolucaoItem;
    private javax.swing.JMenuItem itemCadastroManuais;
    private javax.swing.JMenuItem itemVisualizarManuais;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
