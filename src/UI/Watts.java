/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import pokemonpikachu.Game;

/**
 *
 * @author Santiago
 */
public class Watts extends javax.swing.JFrame {
    Game game = Game.getInstance();
    /**
     * Creates new form Watts
     */
    public Watts() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        System.out.println(game.getWattsBalance());
        showWatts();
        
    }
    
    /**
     *
     */
    public void showWatts() {
        
        game.update();
        int watts = game.getWattsBalance();
        
        jLabel1.setText(String.valueOf(watts));
        
        //
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WattsPanel = new javax.swing.JPanel();
        titlewatts = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Backbtn = new javax.swing.JButton();
        wattsbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        WattsPanel.setBackground(new java.awt.Color(255, 255, 255));
        WattsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titlewatts.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        titlewatts.setForeground(new java.awt.Color(255, 255, 255));
        titlewatts.setText("WATTS AVAILABLE:");
        WattsPanel.add(titlewatts, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 230, 100));

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("0");
        WattsPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 260, 110));

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
        WattsPanel.add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 100, 30));

        wattsbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wattsim.png"))); // NOI18N
        wattsbg.setText(" ");
        WattsPanel.add(wattsbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WattsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WattsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Watts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Watts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Watts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Watts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Watts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.JPanel WattsPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel titlewatts;
    private javax.swing.JLabel wattsbg;
    // End of variables declaration//GEN-END:variables
}
