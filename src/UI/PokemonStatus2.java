/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DataStructures.AVLNode;
import DataStructures.DynamicArray;
import pokemonpikachu.Game;
import pokemonpikachu.Gift;
import pokemonpikachu.Pokemon;

/**
 *
 * @author Santiago
 */
public class PokemonStatus2 extends javax.swing.JFrame {
    Game game = Game.getInstance();
    Pokemon pachirisu = Pokemon.getInstance("Pachirisu");
    /**
     * Creates new form PokemonStatus
     */
    public PokemonStatus2() {
        initComponents();
        this.setLocationRelativeTo(null);
        game.update();
        showRelationship();
        
        if (pachirisu.getRelationship() <= 2000) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pachirisusigh220.png")));
        } else if (pachirisu.getRelationship() <= 4000) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pachirisuangry220.png")));
        } else if (pachirisu.getRelationship() <= 6000) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pachirisunormal220.png")));
        }else if (pachirisu.getRelationship() < 8000) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pachirisuhappy220.png")));
        }  else {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pachirisuinspired220.png")));
        }
        
        AVLNode<Gift> root = pachirisu.getGiftsReceived().getRoot();
        pachirisu.listGiftsReceived(root);
        DynamicArray<AVLNode<Gift>> list = pachirisu.getListGifts();
        for(AVLNode<Gift> node : list){
        GiftsList.append(node.getData().getName());
        }
        
    }
    public void showRelationship() {
        game.update();
        jLabel2.setText("Relatioship: "+String.valueOf(pachirisu.getRelationship()));
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PokemonStatusBg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        GiftsList = new javax.swing.JTextArea();
        GiftsLabel = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        PokemonStatusLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        StatusLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PokemonStatusBg.setBackground(new java.awt.Color(255, 255, 102));
        PokemonStatusBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GiftsList.setBackground(new java.awt.Color(255, 255, 255));
        GiftsList.setColumns(20);
        GiftsList.setRows(5);
        jScrollPane1.setViewportView(GiftsList);

        PokemonStatusBg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 360, 250));

        GiftsLabel.setFont(new java.awt.Font("Snap ITC", 1, 32)); // NOI18N
        GiftsLabel.setForeground(new java.awt.Color(0, 0, 255));
        GiftsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GiftsLabel.setText("GIFTS");
        PokemonStatusBg.add(GiftsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 360, 60));

        BackBtn.setBackground(new java.awt.Color(0, 0, 255));
        BackBtn.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("BACK");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        PokemonStatusBg.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 130, 40));

        PokemonStatusLabel.setFont(new java.awt.Font("Snap ITC", 1, 32)); // NOI18N
        PokemonStatusLabel.setForeground(new java.awt.Color(0, 0, 255));
        PokemonStatusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PokemonStatusLabel.setText("POKEMON");
        PokemonStatusBg.add(PokemonStatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 220, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pikachuhappy220.png"))); // NOI18N
        jLabel1.setText(" ");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        PokemonStatusBg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 220, 220));

        StatusLabel.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        StatusLabel.setForeground(new java.awt.Color(0, 0, 255));
        StatusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StatusLabel.setText("(STATUS)");
        PokemonStatusBg.add(StatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 220, 50));

        jLabel2.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Relationship: ");
        PokemonStatusBg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 610, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PokemonStatusBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PokemonStatusBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_BackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PokemonStatus2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PokemonStatus2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PokemonStatus2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PokemonStatus2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new PokemonStatus2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel GiftsLabel;
    private javax.swing.JTextArea GiftsList;
    private javax.swing.JPanel PokemonStatusBg;
    private javax.swing.JLabel PokemonStatusLabel;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
