
import java.awt.Desktop;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.TableColumn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Cliente_form_trem extends javax.swing.JFrame {

    /**
     * Creates new form Cliente_form_trem
     */
    public Cliente_form_trem() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Linha 10 Turquesa");
        cmb_estacoes.addItem("Selecione a estação");
        cmb_estacoes.addItem("BRÁS");
        cmb_estacoes.addItem("MOOCA");
        cmb_estacoes.addItem("IPIRANGA");
        cmb_estacoes.addItem("TAMANDUATEÍ");
        cmb_estacoes.addItem("SÃO CAETANO");
        cmb_estacoes.addItem("UTINGA");
        cmb_estacoes.addItem("PREFEITO SALADINO");
        cmb_estacoes.addItem("SANTO ANDRÉ");
        cmb_estacoes.addItem("CAPUAVA");
        cmb_estacoes.addItem("MAUÁ");
        cmb_estacoes.addItem("GUAPITUBA");
        cmb_estacoes.addItem("RIBEIRÃO PIRES");
        cmb_estacoes.addItem("RIO GRANDE DA SERRA");
        
        cmb_estacoes_a.addItem("Selecione a partida");
        cmb_estacoes_a.addItem("BRÁS");
        cmb_estacoes_a.addItem("MOOCA");
        cmb_estacoes_a.addItem("IPIRANGA");
        cmb_estacoes_a.addItem("TAMANDUATEÍ");
        cmb_estacoes_a.addItem("SÃO CAETANO");
        cmb_estacoes_a.addItem("UTINGA");
        cmb_estacoes_a.addItem("PREFEITO SALADINO");
        cmb_estacoes_a.addItem("SANTO ANDRÉ");
        cmb_estacoes_a.addItem("CAPUAVA");
        cmb_estacoes_a.addItem("MAUÁ");
        cmb_estacoes_a.addItem("GUAPITUBA");
        cmb_estacoes_a.addItem("RIBEIRÃO PIRES");
        cmb_estacoes_a.addItem("RIO GRANDE DA SERRA");
        
        cmb_estacoes_b.addItem("Selecione o destino");
        cmb_estacoes_b.addItem("BRÁS");
        cmb_estacoes_b.addItem("MOOCA");
        cmb_estacoes_b.addItem("IPIRANGA");
        cmb_estacoes_b.addItem("TAMANDUATEÍ");
        cmb_estacoes_b.addItem("SÃO CAETANO");
        cmb_estacoes_b.addItem("UTINGA");
        cmb_estacoes_b.addItem("PREFEITO SALADINO");
        cmb_estacoes_b.addItem("SANTO ANDRÉ");
        cmb_estacoes_b.addItem("CAPUAVA");
        cmb_estacoes_b.addItem("MAUÁ");
        cmb_estacoes_b.addItem("GUAPITUBA");
        cmb_estacoes_b.addItem("RIBEIRÃO PIRES");
        cmb_estacoes_b.addItem("RIO GRANDE DA SERRA");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_pesquisar = new javax.swing.JButton();
        cmb_estacoes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmb_estacoes_a = new javax.swing.JComboBox<>();
        cmb_estacoes_b = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btn_estimar = new javax.swing.JButton();
        btn_tarifas = new javax.swing.JButton();
        btn_noticias = new javax.swing.JButton();
        btn_mapa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        jLabel1.setText("Encontre a estação que você procura:");

        jLabel2.setText("BUSCA DE ESTAÇÕES/TERMINAIS");

        jLabel3.setText("Para onde você vai?");

        btn_estimar.setText("Pesquisar tempo");
        btn_estimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estimarActionPerformed(evt);
            }
        });

        btn_tarifas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticket_icon.png"))); // NOI18N
        btn_tarifas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tarifasActionPerformed(evt);
            }
        });

        btn_noticias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newspaper-icon.png"))); // NOI18N
        btn_noticias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_noticiasActionPerformed(evt);
            }
        });

        btn_mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/map-icon.png"))); // NOI18N
        btn_mapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mapaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_estimar)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cmb_estacoes_b, javax.swing.GroupLayout.Alignment.LEADING, 0, 235, Short.MAX_VALUE)
                                        .addComponent(cmb_estacoes_a, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmb_estacoes, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_pesquisar))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_noticias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_mapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_tarifas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cmb_estacoes_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmb_estacoes_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_estimar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pesquisar)
                    .addComponent(cmb_estacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_tarifas, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_mapa)
                .addGap(9, 9, 9)
                .addComponent(btn_noticias)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        try{
            Interface_Trem objeto = (Interface_Trem) Naming.lookup("rmi://localhost:1234/trem");
            int index = cmb_estacoes.getSelectedIndex();
            Info_estacoes ie = new Info_estacoes();
            ie.setVisible(true);
            ie.cmb_info_estacoes.setSelectedIndex(index);
            //ie..setText(objeto.Mostrainfo(index));
            ie.txt_comodidades.setText((objeto.Comodidades(index)).toString().replace("[", " ").replace(",", "").replace("]", " "));
            ie.txt_servicos.setText((objeto.Servicos(index)).toString().replace("[", " ").replace(",", "").replace("]", " "));
        }catch (MalformedURLException | RemoteException | NotBoundException e ){
            System.out.println("Erro"+e.toString());
        }
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void btn_estimarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estimarActionPerformed
        try{
            Interface_Trem objeto = (Interface_Trem) Naming.lookup("rmi://localhost:1234/trem");
            int est1, est2;
            est1=cmb_estacoes_a.getSelectedIndex();
            est2=cmb_estacoes_b.getSelectedIndex();
            if(est1==0 || est2==0 || est1==est2)
                JOptionPane.showMessageDialog(this, "Selecione a origem e o destino!");
            else{
            Mostra_tempo mt = new Mostra_tempo();
            mt.setVisible(true);
            mt.lbl_percurso.setText(cmb_estacoes_a.getSelectedItem().toString()+" até "+cmb_estacoes_b.getSelectedItem().toString());
            mt.lbl_tempo.setText("Tempo estimado: "+objeto.Mostratempo(est1, est2));
            }
        }catch (MalformedURLException | RemoteException | NotBoundException e ){
            System.out.println("Erro"+e.toString());
        }
    }//GEN-LAST:event_btn_estimarActionPerformed

    private void btn_tarifasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tarifasActionPerformed
           Pesquisa_Tarifa pt = new Pesquisa_Tarifa();
           pt.setVisible(true);
          // Cadastro_tarifa ct = new Cadastro_tarifa();
          //   ct.setVisible(true);
    }//GEN-LAST:event_btn_tarifasActionPerformed

    private void btn_noticiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_noticiasActionPerformed
        Desktop desk = java.awt.Desktop.getDesktop();   
try {  
     desk.browse(new java.net.URI("http://www.cptm.sp.gov.br/noticias/Pages/default.aspx"));  
} catch (Exception e) {  
     e.printStackTrace();  
}
    }//GEN-LAST:event_btn_noticiasActionPerformed

    private void btn_mapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mapaActionPerformed
         Mapa m = new Mapa();
         m.setVisible(true);
    }//GEN-LAST:event_btn_mapaActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente_form_trem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente_form_trem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente_form_trem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente_form_trem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente_form_trem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_estimar;
    private javax.swing.JButton btn_mapa;
    private javax.swing.JButton btn_noticias;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JButton btn_tarifas;
    private javax.swing.JComboBox<String> cmb_estacoes;
    public javax.swing.JComboBox<String> cmb_estacoes_a;
    public javax.swing.JComboBox<String> cmb_estacoes_b;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
