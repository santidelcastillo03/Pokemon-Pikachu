/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import UI.PokemonSelect_3;
import pokemonpikachu.Game;
import pokemonpikachu.Shop;
import pokemonpikachu.SoundPlayer;
import java.awt.Color;
import javax.swing.JOptionPane;
import pokemonpikachu.Gift;
import pokemonpikachu.Pokemon;

/**
 *
 * @author Santiago
 */
public class ShopUI extends javax.swing.JFrame {

    /**
     *
     */
    public String selectedGift;
    Game game = Game.getInstance();
    Shop shop = new Shop(game);
    SoundPlayer soundPlayer = SoundPlayer.getInstance();
    PokemonSelect_3 pokemonSelect;


    /**
     * Creates new form Shop
     */
    public ShopUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        shop.initializeGifts();
        pokemonSelect =PokemonSelect_3.getInstance();
    }

    /**
     *
     * @return
     */
    public Pokemon getSelectedPokemons() {
        return pokemonSelect.getSelectedPokemon();
    }

    /**
     *
     * @param giftName
     */
    public void buyGift(String giftName) {
        Pokemon selectedPokemon = getSelectedPokemons();
        
        for (int i = 0; i < shop.getAvailableGifts().size(); i++) {
            Gift gift = shop.getAvailableGifts().get(i);

            if (gift.getName().equals(giftName)) {

                if (game.getWattsBalance() >= gift.getCost()) {
                    game.deductWatts(gift.getCost());

                        String pokemonName = selectedPokemon.getName();
                        System.out.println(pokemonName);
                        if (pokemonName.equals("Pikachu") || pokemonName.equals("Pachirisu")) {
                            selectedPokemon.increaseRelationship(gift.getRelationshipEffect());
                            selectedPokemon.addGift(gift);
                            JOptionPane.showMessageDialog(null, "You bought a " + giftName + " for " + pokemonName + "!");
                        } else {
                            JOptionPane.showMessageDialog(null, "You can only give gifts to Pikachu or Pachirisu.");
                        }

                } else {
                    JOptionPane.showMessageDialog(null, "You don't have enough watts to buy this gift.");
                }
                break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackBtnShop = new javax.swing.JButton();
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
        AranjaBerryPrice = new javax.swing.JLabel();
        CaquicBerryPrice = new javax.swing.JLabel();
        PokeBallPrice = new javax.swing.JLabel();
        ZrezaBerryPrice = new javax.swing.JLabel();
        ZanamaBerryPrice = new javax.swing.JLabel();
        ZiuelaBerryPrice = new javax.swing.JLabel();
        ZidraBerryPrice = new javax.swing.JLabel();
        EnigmaBerryPrice = new javax.swing.JLabel();
        RareCandyPrice = new javax.swing.JLabel();
        AranjaBerryEffect = new javax.swing.JLabel();
        CaquicBerryEffect = new javax.swing.JLabel();
        PokeBallEffect = new javax.swing.JLabel();
        ZrezaBerryEffect = new javax.swing.JLabel();
        ZanamaBerryEffect = new javax.swing.JLabel();
        ZiuelaBerryEffect = new javax.swing.JLabel();
        ZidraBerryEffect = new javax.swing.JLabel();
        EnigmaBerryEffect = new javax.swing.JLabel();
        RareCandyEffect = new javax.swing.JLabel();
        shopbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackBtnShop.setBackground(new java.awt.Color(0, 102, 204));
        BackBtnShop.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        BackBtnShop.setForeground(new java.awt.Color(255, 255, 255));
        BackBtnShop.setText("BACK");
        BackBtnShop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnShopMouseClicked(evt);
            }
        });
        getContentPane().add(BackBtnShop, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 130, 40));

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
        AranjaBerry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AranjaBerryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AranjaBerryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AranjaBerryMouseExited(evt);
            }
        });
        ShopPanel.add(AranjaBerry, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 110, 30));

        CaquicBerry.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        CaquicBerry.setForeground(new java.awt.Color(0, 102, 204));
        CaquicBerry.setText("Caquic Berry");
        CaquicBerry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CaquicBerry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CaquicBerryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CaquicBerryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CaquicBerryMouseExited(evt);
            }
        });
        ShopPanel.add(CaquicBerry, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 110, 30));

        PokeBall.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        PokeBall.setForeground(new java.awt.Color(0, 102, 204));
        PokeBall.setText("Poke Ball");
        PokeBall.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PokeBall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PokeBallMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PokeBallMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PokeBallMouseExited(evt);
            }
        });
        ShopPanel.add(PokeBall, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 110, 30));

        ZrezaBerry.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        ZrezaBerry.setForeground(new java.awt.Color(0, 102, 204));
        ZrezaBerry.setText("Zreza Berry");
        ZrezaBerry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ZrezaBerry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ZrezaBerryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ZrezaBerryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ZrezaBerryMouseExited(evt);
            }
        });
        ShopPanel.add(ZrezaBerry, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 110, 30));

        ZanamaBerry.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        ZanamaBerry.setForeground(new java.awt.Color(0, 102, 204));
        ZanamaBerry.setText("Zanama Berry");
        ZanamaBerry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ZanamaBerry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ZanamaBerryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ZanamaBerryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ZanamaBerryMouseExited(evt);
            }
        });
        ShopPanel.add(ZanamaBerry, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 130, 30));

        ZiuelaBerry.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        ZiuelaBerry.setForeground(new java.awt.Color(0, 102, 204));
        ZiuelaBerry.setText("Ziuela Berry");
        ZiuelaBerry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ZiuelaBerry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ZiuelaBerryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ZiuelaBerryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ZiuelaBerryMouseExited(evt);
            }
        });
        ShopPanel.add(ZiuelaBerry, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 130, 30));

        ZidraBerry.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        ZidraBerry.setForeground(new java.awt.Color(0, 102, 204));
        ZidraBerry.setText("Zidra Berry");
        ZidraBerry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ZidraBerry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ZidraBerryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ZidraBerryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ZidraBerryMouseExited(evt);
            }
        });
        ShopPanel.add(ZidraBerry, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 130, 30));

        EnigmaBerry.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        EnigmaBerry.setForeground(new java.awt.Color(0, 102, 204));
        EnigmaBerry.setText("Enigma Berry");
        EnigmaBerry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EnigmaBerry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnigmaBerryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EnigmaBerryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EnigmaBerryMouseExited(evt);
            }
        });
        ShopPanel.add(EnigmaBerry, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 130, 30));

        RareCandy.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        RareCandy.setForeground(new java.awt.Color(0, 102, 204));
        RareCandy.setText("Rare Candy");
        RareCandy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RareCandy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RareCandyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RareCandyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RareCandyMouseExited(evt);
            }
        });
        ShopPanel.add(RareCandy, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 130, 30));

        AranjaBerryPrice.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        AranjaBerryPrice.setForeground(new java.awt.Color(0, 102, 204));
        AranjaBerryPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AranjaBerryPrice.setText("100 Watts");
        AranjaBerryPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ShopPanel.add(AranjaBerryPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 110, 30));

        CaquicBerryPrice.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        CaquicBerryPrice.setForeground(new java.awt.Color(0, 102, 204));
        CaquicBerryPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CaquicBerryPrice.setText("200 Watts");
        CaquicBerryPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ShopPanel.add(CaquicBerryPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 110, 30));

        PokeBallPrice.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        PokeBallPrice.setForeground(new java.awt.Color(0, 102, 204));
        PokeBallPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PokeBallPrice.setText("300 Watts");
        PokeBallPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ShopPanel.add(PokeBallPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 110, 30));

        ZrezaBerryPrice.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        ZrezaBerryPrice.setForeground(new java.awt.Color(0, 102, 204));
        ZrezaBerryPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ZrezaBerryPrice.setText("400 Watts");
        ZrezaBerryPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ShopPanel.add(ZrezaBerryPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 110, 30));

        ZanamaBerryPrice.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        ZanamaBerryPrice.setForeground(new java.awt.Color(0, 102, 204));
        ZanamaBerryPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ZanamaBerryPrice.setText("500 Watts");
        ZanamaBerryPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ShopPanel.add(ZanamaBerryPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 110, 30));

        ZiuelaBerryPrice.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        ZiuelaBerryPrice.setForeground(new java.awt.Color(0, 102, 204));
        ZiuelaBerryPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ZiuelaBerryPrice.setText("600 Watts");
        ZiuelaBerryPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ShopPanel.add(ZiuelaBerryPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 110, 30));

        ZidraBerryPrice.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        ZidraBerryPrice.setForeground(new java.awt.Color(0, 102, 204));
        ZidraBerryPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ZidraBerryPrice.setText("700 Watts");
        ZidraBerryPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ShopPanel.add(ZidraBerryPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 110, 30));

        EnigmaBerryPrice.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        EnigmaBerryPrice.setForeground(new java.awt.Color(0, 102, 204));
        EnigmaBerryPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnigmaBerryPrice.setText("800 Watts");
        EnigmaBerryPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ShopPanel.add(EnigmaBerryPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 110, 30));

        RareCandyPrice.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        RareCandyPrice.setForeground(new java.awt.Color(0, 102, 204));
        RareCandyPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RareCandyPrice.setText("900 Watts");
        RareCandyPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ShopPanel.add(RareCandyPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 110, 30));

        AranjaBerryEffect.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        AranjaBerryEffect.setForeground(new java.awt.Color(0, 102, 204));
        AranjaBerryEffect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AranjaBerryEffect.setText("+100 Relationship");
        AranjaBerryEffect.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ShopPanel.add(AranjaBerryEffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 160, 30));

        CaquicBerryEffect.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        CaquicBerryEffect.setForeground(new java.awt.Color(0, 102, 204));
        CaquicBerryEffect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CaquicBerryEffect.setText("+250 Relationship");
        CaquicBerryEffect.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ShopPanel.add(CaquicBerryEffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 160, 30));

        PokeBallEffect.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        PokeBallEffect.setForeground(new java.awt.Color(0, 102, 204));
        PokeBallEffect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PokeBallEffect.setText("+400 Relationship");
        PokeBallEffect.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ShopPanel.add(PokeBallEffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 160, 30));

        ZrezaBerryEffect.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        ZrezaBerryEffect.setForeground(new java.awt.Color(0, 102, 204));
        ZrezaBerryEffect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ZrezaBerryEffect.setText("+550 Relationship");
        ZrezaBerryEffect.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ShopPanel.add(ZrezaBerryEffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 160, 30));

        ZanamaBerryEffect.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        ZanamaBerryEffect.setForeground(new java.awt.Color(0, 102, 204));
        ZanamaBerryEffect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ZanamaBerryEffect.setText("+700 Relationship");
        ZanamaBerryEffect.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ShopPanel.add(ZanamaBerryEffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 160, 30));

        ZiuelaBerryEffect.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        ZiuelaBerryEffect.setForeground(new java.awt.Color(0, 102, 204));
        ZiuelaBerryEffect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ZiuelaBerryEffect.setText("+850 Relationship");
        ZiuelaBerryEffect.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ShopPanel.add(ZiuelaBerryEffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 160, 30));

        ZidraBerryEffect.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        ZidraBerryEffect.setForeground(new java.awt.Color(0, 102, 204));
        ZidraBerryEffect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ZidraBerryEffect.setText("+1000 Relationship");
        ZidraBerryEffect.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ShopPanel.add(ZidraBerryEffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 170, 30));

        EnigmaBerryEffect.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        EnigmaBerryEffect.setForeground(new java.awt.Color(0, 102, 204));
        EnigmaBerryEffect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnigmaBerryEffect.setText("+1150 Relationship");
        EnigmaBerryEffect.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ShopPanel.add(EnigmaBerryEffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 170, 30));

        RareCandyEffect.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        RareCandyEffect.setForeground(new java.awt.Color(0, 102, 204));
        RareCandyEffect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RareCandyEffect.setText("+1300 Relationship");
        RareCandyEffect.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ShopPanel.add(RareCandyEffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 170, 30));

        shopbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shopim.png"))); // NOI18N
        shopbg.setText(" ");
        ShopPanel.add(shopbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(ShopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AranjaBerryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AranjaBerryMouseEntered
        AranjaBerry.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_AranjaBerryMouseEntered

    private void AranjaBerryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AranjaBerryMouseExited
        AranjaBerry.setForeground(new java.awt.Color(0,102,204));
    }//GEN-LAST:event_AranjaBerryMouseExited

    private void CaquicBerryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CaquicBerryMouseEntered
        CaquicBerry.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_CaquicBerryMouseEntered

    private void CaquicBerryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CaquicBerryMouseExited
        CaquicBerry.setForeground(new java.awt.Color(0,102,204));
    }//GEN-LAST:event_CaquicBerryMouseExited

    private void PokeBallMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PokeBallMouseEntered
        PokeBall.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_PokeBallMouseEntered

    private void PokeBallMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PokeBallMouseExited
        PokeBall.setForeground(new java.awt.Color(0,102,204));
    }//GEN-LAST:event_PokeBallMouseExited

    private void ZrezaBerryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZrezaBerryMouseEntered
        ZrezaBerry.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_ZrezaBerryMouseEntered

    private void ZrezaBerryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZrezaBerryMouseExited
        ZrezaBerry.setForeground(new java.awt.Color(0,102,204));
    }//GEN-LAST:event_ZrezaBerryMouseExited

    private void ZanamaBerryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZanamaBerryMouseEntered
        ZanamaBerry.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_ZanamaBerryMouseEntered

    private void ZanamaBerryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZanamaBerryMouseExited
        ZanamaBerry.setForeground(new java.awt.Color(0,102,204));
    }//GEN-LAST:event_ZanamaBerryMouseExited

    private void ZiuelaBerryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZiuelaBerryMouseEntered
        ZiuelaBerry.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_ZiuelaBerryMouseEntered

    private void ZiuelaBerryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZiuelaBerryMouseExited
        ZiuelaBerry.setForeground(new java.awt.Color(0,102,204));
    }//GEN-LAST:event_ZiuelaBerryMouseExited

    private void ZidraBerryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZidraBerryMouseEntered
        ZidraBerry.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_ZidraBerryMouseEntered

    private void ZidraBerryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZidraBerryMouseExited
        ZidraBerry.setForeground(new java.awt.Color(0,102,204));
    }//GEN-LAST:event_ZidraBerryMouseExited

    private void EnigmaBerryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnigmaBerryMouseEntered
        EnigmaBerry.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_EnigmaBerryMouseEntered

    private void EnigmaBerryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnigmaBerryMouseExited
        EnigmaBerry.setForeground(new java.awt.Color(0,102,204));
    }//GEN-LAST:event_EnigmaBerryMouseExited

    private void RareCandyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RareCandyMouseEntered
        RareCandy.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_RareCandyMouseEntered

    private void RareCandyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RareCandyMouseExited
        RareCandy.setForeground(new java.awt.Color(0,102,204));
    }//GEN-LAST:event_RareCandyMouseExited

    private void AranjaBerryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AranjaBerryMouseClicked
       selectedGift = "Baya Aranja";
        pokemonSelect.setVisible(true);
    }//GEN-LAST:event_AranjaBerryMouseClicked

    private void CaquicBerryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CaquicBerryMouseClicked
        selectedGift = "Baya Caquic";
        pokemonSelect.setVisible(true);
    }//GEN-LAST:event_CaquicBerryMouseClicked

    private void PokeBallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PokeBallMouseClicked
        selectedGift = "Poke ball";
        pokemonSelect.setVisible(true);
    }//GEN-LAST:event_PokeBallMouseClicked

    private void ZrezaBerryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZrezaBerryMouseClicked
        selectedGift = "Baya Zreza";
        pokemonSelect.setVisible(true);
    }//GEN-LAST:event_ZrezaBerryMouseClicked

    private void ZanamaBerryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZanamaBerryMouseClicked
        selectedGift = "Baya Zanama";
        pokemonSelect.setVisible(true);
    }//GEN-LAST:event_ZanamaBerryMouseClicked

    private void ZiuelaBerryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZiuelaBerryMouseClicked
        selectedGift = "Baya Ziuela";
        pokemonSelect.setVisible(true);
    }//GEN-LAST:event_ZiuelaBerryMouseClicked

    private void ZidraBerryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZidraBerryMouseClicked
        selectedGift = "Baya Zidra";
        pokemonSelect.setVisible(true);
    }//GEN-LAST:event_ZidraBerryMouseClicked

    private void EnigmaBerryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnigmaBerryMouseClicked
        selectedGift = "Baya Enigma";
        pokemonSelect.setVisible(true);
    }//GEN-LAST:event_EnigmaBerryMouseClicked

    private void RareCandyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RareCandyMouseClicked
        selectedGift = "Caramelo raro";
        pokemonSelect.setVisible(true);
    }//GEN-LAST:event_RareCandyMouseClicked

    private void BackBtnShopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnShopMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_BackBtnShopMouseClicked

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
    private javax.swing.JLabel AranjaBerryEffect;
    private javax.swing.JLabel AranjaBerryPrice;
    private javax.swing.JButton BackBtnShop;
    private javax.swing.JLabel CaquicBerry;
    private javax.swing.JLabel CaquicBerryEffect;
    private javax.swing.JLabel CaquicBerryPrice;
    private javax.swing.JLabel Effectlabel;
    private javax.swing.JLabel EnigmaBerry;
    private javax.swing.JLabel EnigmaBerryEffect;
    private javax.swing.JLabel EnigmaBerryPrice;
    private javax.swing.JLabel PokeBall;
    private javax.swing.JLabel PokeBallEffect;
    private javax.swing.JLabel PokeBallPrice;
    private javax.swing.JLabel Pricelabel;
    private javax.swing.JLabel RareCandy;
    private javax.swing.JLabel RareCandyEffect;
    private javax.swing.JLabel RareCandyPrice;
    private javax.swing.JPanel ShopPanel;
    private javax.swing.JLabel ZanamaBerry;
    private javax.swing.JLabel ZanamaBerryEffect;
    private javax.swing.JLabel ZanamaBerryPrice;
    private javax.swing.JLabel ZidraBerry;
    private javax.swing.JLabel ZidraBerryEffect;
    private javax.swing.JLabel ZidraBerryPrice;
    private javax.swing.JLabel ZiuelaBerry;
    private javax.swing.JLabel ZiuelaBerryEffect;
    private javax.swing.JLabel ZiuelaBerryPrice;
    private javax.swing.JLabel ZrezaBerry;
    private javax.swing.JLabel ZrezaBerryEffect;
    private javax.swing.JLabel ZrezaBerryPrice;
    private javax.swing.JLabel giftlabel;
    private javax.swing.JLabel shopbg;
    // End of variables declaration//GEN-END:variables
}
