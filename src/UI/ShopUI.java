/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import pokemonpikachu.SoundPlayer;

/**
 *
 * @author Santiago
 */
public class ShopUI extends javax.swing.JFrame {

    SoundPlayer soundPlayer = SoundPlayer.getInstance();
    /**
     * Creates new form Shop
     */
    public ShopUI() {
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

        ShopPanel = new javax.swing.JPanel();
        Pricelabel = new javax.swing.JLabel();
        Effectlabel = new javax.swing.JLabel();
        giftlabel = new javax.swing.JLabel();
        AranjaBerry = new javax.swing.JLabel();
        CaquicBerry = new javax.swing.JLabel();
        PokeBall = new javax.swing.JLabel();
        ZrezaBerry = new javax.swing.JLabel();
        ZanamaBerry = new javax.swing.JLabel();
        ZiuelaBerry = new javax.swing.JLabel();
        ZidraBerry = new javax.swing.JLabel();
        EnigmaBerry = new javax.swing.JLabel();
        RareCandy = new javax.swing.JLabel();
        shopbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ShopPanel.setBackground(new java.awt.Color(255, 255, 255));
        ShopPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pricelabel.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        Pricelabel.setForeground(new java.awt.Color(0, 102, 204));
        Pricelabel.setText("Price");
        ShopPanel.add(Pricelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 110, 40));

        Effectlabel.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        Effectlabel.setForeground(new java.awt.Color(0, 102, 204));
        Effectlabel.setText("Effect");
        ShopPanel.add(Effectlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 110, 40));

        giftlabel.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        giftlabel.setForeground(new java.awt.Color(0, 102, 204));
        giftlabel.setText("Gift");
        ShopPanel.add(giftlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 110, 40));

        AranjaBerry.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        AranjaBerry.setForeground(new java.awt.Color(0, 102, 204));
        AranjaBerry.setText("Aranja Berry");
        AranjaBerry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShopPanel.add(AranjaBerry, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 110, 30));

        CaquicBerry.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        CaquicBerry.setForeground(new java.awt.Color(0, 102, 204));
        CaquicBerry.setText("Caquic Berry");
        CaquicBerry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShopPanel.add(CaquicBerry, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 110, 30));

        PokeBall.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        PokeBall.setForeground(new java.awt.Color(0, 102, 204));
        PokeBall.setText("Poke Ball");
        PokeBall.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShopPanel.add(PokeBall, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 110, 30));

        ZrezaBerry.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        ZrezaBerry.setForeground(new java.awt.Color(0, 102, 204));
        ZrezaBerry.setText("Zreza Berry");
        ZrezaBerry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShopPanel.add(ZrezaBerry, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 110, 30));

        ZanamaBerry.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        ZanamaBerry.setForeground(new java.awt.Color(0, 102, 204));
        ZanamaBerry.setText("Zanama Berry");
        ZanamaBerry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShopPanel.add(ZanamaBerry, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 130, 30));

        ZiuelaBerry.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        ZiuelaBerry.setForeground(new java.awt.Color(0, 102, 204));
        ZiuelaBerry.setText("Ziuela Berry");
        ZiuelaBerry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShopPanel.add(ZiuelaBerry, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 130, 30));

        ZidraBerry.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        ZidraBerry.setForeground(new java.awt.Color(0, 102, 204));
        ZidraBerry.setText("Zidra Berry");
        ZidraBerry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShopPanel.add(ZidraBerry, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 130, 30));

        EnigmaBerry.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        EnigmaBerry.setForeground(new java.awt.Color(0, 102, 204));
        EnigmaBerry.setText("Enigma Berry");
        EnigmaBerry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShopPanel.add(EnigmaBerry, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 130, 30));

        RareCandy.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        RareCandy.setForeground(new java.awt.Color(0, 102, 204));
        RareCandy.setText("Rare Candy");
        RareCandy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShopPanel.add(RareCandy, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 130, 30));

        shopbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shopim.png"))); // NOI18N
        shopbg.setText(" ");
        ShopPanel.add(shopbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(ShopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ShopUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShopUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShopUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShopUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShopUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AranjaBerry;
    private javax.swing.JLabel CaquicBerry;
    private javax.swing.JLabel Effectlabel;
    private javax.swing.JLabel EnigmaBerry;
    private javax.swing.JLabel PokeBall;
    private javax.swing.JLabel Pricelabel;
    private javax.swing.JLabel RareCandy;
    private javax.swing.JPanel ShopPanel;
    private javax.swing.JLabel ZanamaBerry;
    private javax.swing.JLabel ZidraBerry;
    private javax.swing.JLabel ZiuelaBerry;
    private javax.swing.JLabel ZrezaBerry;
    private javax.swing.JLabel giftlabel;
    private javax.swing.JLabel shopbg;
    // End of variables declaration//GEN-END:variables
}