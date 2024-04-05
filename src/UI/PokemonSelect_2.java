/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import pokemonpikachu.SoundPlayer;

/**
 *
 * @author Angel
 */
public class PokemonSelect_2 extends javax.swing.JFrame {
    Bet bet = new Bet();
    Bet2 bet2 = new Bet2();
    /**
     * Creates new form PokemonSelect
     */
    public PokemonSelect_2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PokemonSelectPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        PachirisuBtn = new javax.swing.JButton();
        PikachuBtn = new javax.swing.JButton();
        Backbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PokemonSelectPanel.setBackground(new java.awt.Color(255, 255, 102));
        PokemonSelectPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 51, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Select your Pokemon");
        PokemonSelectPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 500, 70));

        PachirisuBtn.setBackground(new java.awt.Color(0, 51, 255));
        PachirisuBtn.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        PachirisuBtn.setForeground(new java.awt.Color(255, 255, 255));
        PachirisuBtn.setText("PACHIRISU");
        PachirisuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PachirisuBtnMouseClicked(evt);
            }
        });
        PachirisuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PachirisuBtnActionPerformed(evt);
            }
        });
        PokemonSelectPanel.add(PachirisuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 170, 40));

        PikachuBtn.setBackground(new java.awt.Color(0, 51, 255));
        PikachuBtn.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        PikachuBtn.setForeground(new java.awt.Color(255, 255, 255));
        PikachuBtn.setText("PIKACHU");
        PikachuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PikachuBtnMouseClicked(evt);
            }
        });
        PikachuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PikachuBtnActionPerformed(evt);
            }
        });
        PokemonSelectPanel.add(PikachuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 170, 40));

        Backbtn.setBackground(new java.awt.Color(0, 51, 255));
        Backbtn.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        Backbtn.setForeground(new java.awt.Color(255, 255, 255));
        Backbtn.setText("BACK");
        Backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackbtnMouseClicked(evt);
            }
        });
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });
        PokemonSelectPanel.add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 100, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pika130.png"))); // NOI18N
        jLabel2.setText(" ");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        PokemonSelectPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 130, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pachi130.png"))); // NOI18N
        jLabel3.setText(" ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        PokemonSelectPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 130, 130));

        getContentPane().add(PokemonSelectPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackbtnActionPerformed

    private void PikachuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PikachuBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PikachuBtnActionPerformed

    private void PachirisuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PachirisuBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PachirisuBtnActionPerformed

    private void PikachuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PikachuBtnMouseClicked
        this.setVisible(false);
        bet.setVisible(true);
        
    }//GEN-LAST:event_PikachuBtnMouseClicked

    private void PachirisuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PachirisuBtnMouseClicked
        this.setVisible(false);
        bet2.setVisible(true);
    }//GEN-LAST:event_PachirisuBtnMouseClicked

    private void BackbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackbtnMouseClicked
       this.setVisible(false);
    }//GEN-LAST:event_BackbtnMouseClicked

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
            java.util.logging.Logger.getLogger(PokemonSelect_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PokemonSelect_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PokemonSelect_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PokemonSelect_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PokemonSelect_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.JButton PachirisuBtn;
    private javax.swing.JButton PikachuBtn;
    private javax.swing.JPanel PokemonSelectPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
